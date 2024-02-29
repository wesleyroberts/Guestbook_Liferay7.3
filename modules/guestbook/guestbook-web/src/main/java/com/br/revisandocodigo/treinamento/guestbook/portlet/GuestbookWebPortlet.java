package com.br.revisandocodigo.treinamento.guestbook.portlet;

import com.br.revisandocodigo.treinamento.guestbook.constants.GuestbookWebPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.br.revisandocodigo.treinamento.guestbook.model.Guestbook;
import com.br.revisandocodigo.treinamento.guestbook.model.GuestbookEntry;
import com.br.revisandocodigo.treinamento.guestbook.service.GuestbookEntryLocalService;
import com.br.revisandocodigo.treinamento.guestbook.service.GuestbookLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author wesley
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.social",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=flase",
		"javax.portlet.display-name=GuestbookWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/guestbook/view.jsp",
		"javax.portlet.name=" + GuestbookWebPortletKeys.GUESTBOOKWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GuestbookWebPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Guestbook.class.getName(), renderRequest);

			long groupId = serviceContext.getScopeGroupId();

			long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");

			List<Guestbook> guestbooks = guestbookLocalService.getGuestbooks(
					groupId);

			if (guestbooks.isEmpty()) {
				Guestbook guestbook = guestbookLocalService.addGuestbook(
						serviceContext.getUserId(), "Main", serviceContext);

				guestbookId = guestbook.getGuestBookId();
			}

			if (guestbookId == 0) {
				guestbookId = guestbooks.get(0).getGuestBookId();
			}

			renderRequest.setAttribute("guestbookId", guestbookId);
		}
		catch (Exception e) {
			throw new PortletException(e);
		}

		super.render(renderRequest, renderResponse);
	}
	public void addEntry(ActionRequest request, ActionResponse response)
			throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				GuestbookEntry.class.getName(), request);

		String userName = ParamUtil.getString(request, "name");
		String email = ParamUtil.getString(request, "email");
		String message = ParamUtil.getString(request, "message");
		long guestbookId = ParamUtil.getLong(request, "guestbookId");
		long entryId = ParamUtil.getLong(request, "entryId");

		if (entryId > 0) {

			try {

				guestbookEntryLocalService.updateGuestbookEntry(
						serviceContext.getUserId(), guestbookId, entryId, userName,
						email, message, serviceContext);

				response.setRenderParameter(
						"guestbookId", Long.toString(guestbookId));

				SessionMessages.add(request, "entryAdded");
			}
			catch (Exception e) {

				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter(
						"mvcPath", "/com/br/revisandocodigo/treinamento/guestbook/guestbook/edit_entry.jsp");

				SessionErrors.add(request, e.getClass().getName());
			}

		}
		else {

			try {
				guestbookEntryLocalService.addGuestbookEntry(
						serviceContext.getUserId(), guestbookId, userName, email,
						message, serviceContext);

				response.setRenderParameter(
						"guestbookId", Long.toString(guestbookId));

			}
			catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter(
						"mvcPath", "/com/br/revisandocodigo/treinamento/guestbook/guestbook/edit_entry.jsp");
			}
		}
	}

	public void deleteEntry(ActionRequest request, ActionResponse response) throws PortalException {
		long entryId = ParamUtil.getLong(request, "entryId");
		long guestbookId = ParamUtil.getLong(request, "guestbookId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				GuestbookEntry.class.getName(), request);

		try {

			response.setRenderParameter(
					"guestbookId", Long.toString(guestbookId));

			guestbookEntryLocalService.deleteGuestbookEntry(entryId);

			SessionMessages.add(request, "entryDeleted");
		}

		catch (Exception e) {
			Logger.getLogger(GuestbookWebPortlet.class.getName()).log(
					Level.SEVERE, null, e);

			SessionErrors.add(request, e.getClass().getName());
		}
	}

	@Reference
	private GuestbookEntryLocalService guestbookEntryLocalService;

	@Reference
	private GuestbookLocalService guestbookLocalService;
}

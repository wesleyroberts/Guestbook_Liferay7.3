<%@include file="../init.jsp"%>

<%
long guestbookId = Long.valueOf((Long) renderRequest
        .getAttribute("guestbookId"));
%>

<aui:nav cssClass="nav-tabs">

    <%
        List<Guestbook> guestbooks = GuestbookLocalServiceUtil.getGuestbooks(scopeGroupId);

            for (int i = 0; i < guestbooks.size(); i++) {

                Guestbook curGuestbook = (Guestbook) guestbooks.get(i);
                String cssClass = StringPool.BLANK;

                if (curGuestbook.getGuestBookId() == guestbookId) {
                    cssClass = "active";
                }

    %>

    <portlet:renderURL var="viewPageURL">
        <portlet:param name="mvcPath" value="/guestbook/view.jsp" />
        <portlet:param name="guestbookId"
            value="<%=String.valueOf(curGuestbook.getGuestBookId())%>" />
    </portlet:renderURL>


    <aui:nav-item cssClass="<%=cssClass%>" href="<%=viewPageURL%>"
        label="<%=HtmlUtil.escape(curGuestbook.getName())%>" />

    <%
                }

    %>

</aui:nav>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addEntryURL">
        <portlet:param name="mvcPath" value="/guestbook/edit_entry.jsp" />
        <portlet:param name="guestbookId"
            value="<%=String.valueOf(guestbookId)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%=GuestbookEntryLocalServiceUtil.getGuestbookEntriesCount()%>">
    <liferay-ui:search-container-results
        results="<%=GuestbookEntryLocalServiceUtil.getGuestbookEntries(scopeGroupId.longValue(),
                        guestbookId, searchContainer.getStart(),
                        searchContainer.getEnd())%>" />

        <liferay-ui:search-container-row
            className="guestbook.model.GuestbookEntry" modelVar="entry">
            "${entry}"
            <liferay-ui:search-container-column-text property="message" />

            <liferay-ui:search-container-column-text property="name" />

            <liferay-ui:search-container-column-text property="email" />

            <liferay-ui:search-container-column-text property="guestbookId" />

            <liferay-ui:search-container-column-jsp
                align="right"
                path="/guestbook/entry_actions.jsp" />

        </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

</liferay-ui:search-container>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="struts-tiles.tld" prefix="tiles" %>

<tiles:insert page="/WEB-INF/jsp/baseLayout.jsp" flush="true">
    <tiles:put name="title" value="Tiles Example" />
    <tiles:put name="header" value="/WEB-INF/jsp/header.jsp" />
    <tiles:put name="menu" value="/WEB-INF/jsp/menu.jsp" />
    <tiles:put name="body" value="/WEB-INF/jsp/body.jsp" />
    <tiles:put name="footer" value="/WEB-INF/jsp/footer.jsp" />
</tiles:insert>
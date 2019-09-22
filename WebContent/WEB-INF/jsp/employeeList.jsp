<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="struts-logic.tld" prefix="logic" %>
<%@taglib uri="struts-bean.tld" prefix="bean" %>
<html>
<head>
<title>User Details</title>
</head>
<body>
<table cellpadding="8" cellspacing="8" border="1">
    <tr>
        <th>
        	USER NAME
        </th>
        <th>
        	EMPLOYEE FIRST NAME
        </th>
        <th>
        	EMPLOYEE LAST NAME
        </th>
        <th>
        	EMPLOYEE HIRE DATE
        </th>
        <th>
        	GENDER
        </th>
        <th>
        	EMAIL
        </th>
        <th>
        	ADDRESS
        </th>
        <th>
        	CONTACT NUMBER
        </th>
    </tr>
    <logic:iterate id="data" name="EmployeeDetailsForm" property="employeeList">
        <tr>
            <td>
            	<bean:write name="data" property="userName" />
            </td>
            <td>
            	<bean:write name="data" property="employeeFirstName" />
            </td>
            <td>
            	<bean:write name="data" property="employeeLastName" />
            </td>
            <td>
            	<bean:write name="data" property="employeeHireDate" />
            </td>
            <td>
            	<bean:write name="data" property="gender" />
            </td>
            <td>
            	<bean:write name="data" property="email" />
            </td>
            <td>
            	<bean:write name="data" property="address" />
            </td>
            <td>
            	<bean:write name="data" property="contactNumber" />
            </td>
            
        </tr>
    </logic:iterate>
</table>
</body>
</html>
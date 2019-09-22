<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Data</title>
</head>
<body>
	<html:form action="/employee">
		<table>
			<tr>
				<td>USER NAME:</td>
				<td><html:text name="EmployeeForm" property="userName" /></td>
			</tr>
			<tr>
				<td>PASSWORD:</td>
				<td><html:password name="EmployeeForm" property="password" /></td>
			</tr>
			<tr>
				<td>EMPLOYEE FIRST NAME:</td>
				<td><html:text name="EmployeeForm" property="employeeFirstName" /></td>
			</tr>
			<tr>
				<td>EMPLOYEE LAST NAME:</td>
				<td><html:text name="EmployeeForm" property="employeeLastName" /></td>
			</tr>
			<tr>
				<td>EMPLOYEE HIRE DATE:</td>
				<td><html:text name="EmployeeForm" property="employeeHireDate" /></td>
			</tr>
			<tr>
				<td>GENDER:</td>
				<td><html:text name="EmployeeForm" property="gender" /></td>
			</tr>
			<tr>
				<td>EMAIL:</td>
				<td><html:text name="EmployeeForm" property="email" /></td>
			</tr>
			<tr>
				<td>ADDRESS:</td>
				<td><html:text name="EmployeeForm" property="address" /></td>
			</tr>
			<tr>
				<td>CONTACT NUMBER:</td>
				<td><html:text name="EmployeeForm" property="contactNumber" /></td>
			</tr>
			<tr>
			 <td colspan="2"><html:submit value="Add Employee" /></td>
		    </tr>
		</table>
	</html:form>
</body>
</html>
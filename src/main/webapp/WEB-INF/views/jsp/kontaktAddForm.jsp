	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<html>
	    <head>
	    </head>
	    <body>
            ${userFirstname} ${userLastname} ${saved}
	        <h3>Welcome, Enter The Employee Details</h3>
	        <form:form method="POST" action="/spring3/kontakt/addContact" modelAttribute="user">
	             <table>
	                <tr>
	                    <td><form:label path="userFirstname">Name</form:label></td>
	                    <td><form:input path="userFirstname"/></td>
	                </tr>
	                <tr>
	                    <td><form:label path="userLastname">Surname</form:label></td>
	                    <td><form:input path="userLastname"/></td>
	                </tr>
	                <tr>
	                    <td><input type="submit" value="Submit"/></td>
	                </tr>
	            </table>
	        </form:form>
	    </body>
	</html>
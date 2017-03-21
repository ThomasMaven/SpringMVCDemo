	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<html>
	    <head>
	    </head>
	    <body>
            ${saved}
	        <h3>Welcome, Enter The Employee Details</h3>
	        <form:form method="POST" action="/spring3/kontakt/addContactAndUser" modelAttribute="kontaktList">
	             <table>
	                <tr>
	                    <td><form:label path="osoba.userFirstname">Name</form:label></td>
	                    <td><form:input path="osoba.userFirstname"/></td>
	                </tr>
	                <tr>
	                    <td><form:label path="osoba.userLastname">Surname</form:label></td>
	                    <td><form:input path="osoba.userLastname"/></td>
	                </tr>
	                <tr>
	                <tr>
	                    <td><form:label path="kontakt.value">Value</form:label></td>
	                    <td><form:input path="kontakt.value"/></td>
	                </tr>
	                <tr>
	                    <td><form:label path="kontakt.typeId">TypeId</form:label></td>
	                    <td><form:input path="kontakt.typeId"/></td>
	                </tr>
	                <tr>
	                    <td><input type="submit" value="Submit"/></td>
	                </tr>
	            </table>
	        </form:form>
	    </body>
	</html>
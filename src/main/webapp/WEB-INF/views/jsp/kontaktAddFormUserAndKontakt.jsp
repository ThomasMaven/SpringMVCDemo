	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<html>
	    <head>
	    </head>
	    <body>
            ${saved}
	        <h3>Welcome, Enter The Employee Details</h3>
	        <form:form method="POST" id="UserAndKontaktForm" action="/spring3/kontakt/addContactAndUser" modelAttribute="kontaktList">
                <div id="block">
                    <form:label path="name">Name</form:label>
                    <form:input path="name"/>
                </div>
                <div id="block">
                    <form:label path="surname">Surname</form:label>
                    <form:input path="surname"/>
                </div>

                <div id="block">
                    <form:label path="contacts[0].value">Value</form:label>
                    <form:input path="contacts[0].value"/>
                </div>
                <div id="block">
                    <form:label path="contacts[0].typeId">TypeId</form:label>
                    <form:input path="contacts[0].typeId"/>
                </div>

                 <div id="additionalFields"></div>

                <input type="submit" value="Submit"/>

	        </form:form>
            <input type="button" value="Add new contact field" class="add" id="add" />
	    <script type="text/javascript"
            src="https://code.jquery.com/jquery-3.2.0.min.js"></script>
        <script type="text/javascript">
              var currentIndex = 1;
              $("#add").click(function() {
                input = '<div><input id="contacts'+currentIndex+'.value" name="contacts['+currentIndex+'].value" name="contacts['+currentIndex+'].value" value="" type="text">';
                input += '<input id="contacts'+currentIndex+'.typeId" name="contacts['+currentIndex+'].typeId" value="0" type="text"></div>';
                input = jQuery(input);
                jQuery('#additionalFields').append(input);
                currentIndex++;
              });

              $('#UserAndKontaktForm').submit(function() {
                    //Build the value of hidden field here
                    var valueSeparator = "##!##";
                    $( ".additionalValue" ).each(function( index ) {
                        var hiddenFieldValue = $('#additionalContactValues').val() + $(this).val() + valueSeparator;
                        $('#additionalContactValues').val(hiddenFieldValue);
                    });
                    $( ".additionalType" ).each(function( index ) {
                        var hiddenFieldValue = $('#additionalTypeValues').val() + $(this).val() + valueSeparator;
                        $('#additionalTypeValues').val(hiddenFieldValue);
                    });
                    alert();
              });
        </script>
	</html>
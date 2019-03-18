$(document).ready(function() {
	
	
	
    $.ajax({
        url: "http://localhost:8081/welcome"
    }).then(function(data) {
        alert(data);
    });
    
    $( "#btnSignIn" ).click(function() {
    	
    	alert($("#txtUserName").val());
    	
    	alert($("#txtPassword").val());
    	
    	var userName = $("#txtUserName").val();
    	var password = $("#txtPassword").val();
        $.ajax({
        	type: "GET",
            url: "http://localhost:8081/signIn",
            data: { 
                'userName': userName, 
                'password': password
            }
        }).then(function(data) {
            alert(data);
         
           
        });
    });
    
    
$( "#btnDept" ).click(function() {
    	
  
        $.ajax({
        	type: "GET",
            url: "http://localhost:8081/departments",
             
        }).then(function(data) {
          //  alert(data);
       /*     var i =0;
            for(i=0;i<data.length;i++){
            	
            	alert("Department ID = " + data[i].deptNo);
            	alert("Department Name = " + data[i].deptName);
            }*/
            
            
            var table = $("#tblDepartments tbody");
            $.each(data, function(idx, elem){
                table.append("<tr><td>"+elem.deptNo+"</td><td>"+elem.deptName+"</td></tr>");
            });
        });
    });
  
    
    
    
});
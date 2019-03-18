$(document).ready(function() {
	
	
	
    $.ajax({
        url: "http://localhost:8081/welcome"
    }).then(function(data) {
        alert(data);
    });
    
    $( "#btnSignIn" ).click(function() {
    	
    	alert($("#username").val());
    	
    	alert($("#password").val());
    	
    	var username = $("#username").val();
    	var password = $("#password").val();
        $.ajax({
        	type: "GET",
            url: "http://localhost:8081/signIn",
            data: { 
            	
                'username': username, 
                'password': password
            }
        }).then(function(data) {
        	$('.signIn-username').append(data.username);
            $('.signIn-password').append(data.password);
        });
        $.ajax({
            url: "http://localhost:8081/forgotPassword"
        }).then(function(data) {
            alert(data);
        });
        $.ajax({
            url: "http://localhost:8081/aboutUs"
        }).then(function(data) {
            alert(data);
        });
        $( "#btndepartments" ).click(function() {
        	
        	alert($("#firstname").val());
            alert($("#lastname").val());
            alert($("#Achievements").val());
            alert($("#contribution").val());
            alert($("#performancereport").val());
        	var firstname = $("#firstname").val();
        	var lastname = $("#lastname").val();
        	var Achievements = $("#Achievements").val();
        	var contribution = $("#contribution").val();
        	var performancereport = $("#performancereport").val();
        $.ajax({
        	type: "GET",
            url: "http://localhost:8081/departments",
            data:{
            	'firstname':firstname,
                'lastname':lastname,
            	 'Achievements':Achievements,
            	 'contribution':contribution,
            	 'performancereport':performancereport
            }
            
        }).then(function(data) {
           $('.departments-firstname').append(data.firstname);
           $('.departments-lastname').append(data.lastname);
           $('.departments-Achievements').append(data.Achievements);
           $('.departments-contribution').append(data.contribution);
           $('.departments-performancereport').append(data.contribution);
           
        });
        $.ajax({
            url: "http://localhost:8081/save"
        }).then(function(data) {
            alert(data);
        });
        
    });
    
    
    
});
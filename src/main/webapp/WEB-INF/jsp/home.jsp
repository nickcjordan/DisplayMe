<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>DisplayMe</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/mdb.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>

<%-- <%@include file="draftersTeam.jsp"%> --%>
	    
	<div class="container-fluid background-gray line-height-one">
	
		<div class="row"> 
			<%@include file="weather_forecast.jsp"%>
		</div>
	    
		<div class="row">
		
		    <div class="col left-col scroll">
		    
			  	<a class="btn btn-primary" href="/update">update</a>
			  	
				<%@include file="coins.jsp"%>
				
				<div class="dark-box left-box padded">
				    <div class="commute-text">Work commute: <b>${travelTime}</b></div>
				    <div class="commute-text">Fuel used: <b>${fuelUsed}</b> gallons</div>
				</div>
				
				<div class="dark-box left-box padded">
				    <div class="joke-header"><b>Daily Dad Joke:</b></div>
				     <div class="joke-text">${joke}</div>
				</div>
				
				<div class="dark-box left-box padded">
				    <div class="joke-header"><b>Daily Fact:</b></div>
				     <div class="joke-text">
				     	<script src="http://numbersapi.com/${date}/date?write&default=Nothing+found+for+this+day"></script>
				     </div>
				</div>
				
		    </div>
		    
			<%@include file="news.jsp"%>
				
				
		</div>
	</div>


		
	    
    <!-- JQuery -->
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="js/popper.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="js/mdb.min.js"></script>
	    
</body>
</html>


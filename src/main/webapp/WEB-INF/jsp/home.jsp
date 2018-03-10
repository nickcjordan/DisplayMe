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

<!-- <div class="list-group list-group-horizontal">
                <a href="#" class="list-group-item active">Item One</a>
                <a href="#" class="list-group-item">Item Two</a>
                <a href="#" class="list-group-item">Item Three</a>
                <a href="#" class="list-group-item">Item Four</a>
            </div> -->
	    
	<div class="container-fluid">
	
		<div class="row">
			<div class="col-lg-12">
				<div class="sideways">
				<c:forEach items="${forecastList}" var="forecast">
				
					<div class="weather">
						<img class="" src="${forecast.iconUrl}">
						<b>${forecast.temp}&deg;</b>
						<%-- <h6> ${forecast.condition} [${forecast.conditionMore}]</h6>
						<h6> ${forecast.windSpeed}  ${forecast.windDirection}</h6> --%>
						<sub>${forecast.timestamp}</sub>
					</div>
					
				</c:forEach>
				</div>
				
				
					<%-- <ul class="list-unstyled list-group list-group-horizontal">
						<li class="media weather">
								<img class="mr-1" src="${forecast.iconUrl}">
								<h5> ${forecast.temp}&deg;</h5>
								<h6> ${forecast.condition} [${forecast.conditionMore}]</h6>
								<h6> ${forecast.windSpeed}  ${forecast.windDirection}</h6>
								<h6>${forecast.timestamp}</h6>
							<div class="media-body">
								<h6> ${forecast.condition} [${forecast.conditionMore}]</h6>
								<h6> ${forecast.windSpeed}  ${forecast.windDirection}</h6>
								<h6>${forecast.timestamp}</h6>
							</div>
						</li>
					</ul> --%>
				<%-- <div class="list-group list-group-horizontal">
					<c:forEach items="${forecastList}" var="forecast">
					<div class="jumbotron weather">
						<h5> ${forecast.temp}&deg;</h5>
						<h6> ${forecast.condition} [${forecast.conditionMore}]</h6>
						<h6> ${forecast.windSpeed}  ${forecast.windDirection}</h6>
						<h6>${forecast.timestamp}</h6>
					</div>
					</c:forEach>
				</div> --%>
			</div>
		</div>
	    
		<div class="row">
		
		    <div class="col-2">
		    
			  	<a class="btn btn-primary" href="/update">update</a>
			  	
		    	<div class="jumbotron jumbotron-fluid">
				    <h6><strong>Temperature:</strong> ${currentForecast.temp}&deg;</h6>
				    <h6><strong>Sun:</strong> ${sunrise} to ${sunset}</h6>
				    <h6><strong>Wind:</strong> ${currentForecast.windSpeed} mph to the ${currentForecast.windDirection}</h6>
				    <h6><strong>Humidity:</strong> ${currentForecast.humidity}%</h6>
				    <h6><strong>Cloud Coverage:</strong> ${currentForecast.cloudiness}%</h6>
				    <h6><strong>UV Index:</strong> ${uvIndex}</h6>
				</div>
				
				<div class="jumbotron jumbotron-fluid">
				    <h5>Work commute: <strong>${travelTime}</strong></h5>
				    <h5>Fuel used: <strong>${fuelUsed}</strong> gallons</h5>
				</div>
				
				<div class="jumbotron jumbotron-fluid">
				    <h5>Dad joke of the day:</h5>
				    <h4><strong>${joke}</strong></h4>
				</div>
				
		    </div>
		    
			<c:forEach items="${news}" var="source">
				<div class="col">
					<div class="row">
						<div class="col text-center">
							<h4 class="biggy">${source.displayName}</h4>
						</div>
					</div>
					<div class="row">
						<div class="col scroll">
							
							<c:forEach items="${source.articles}" var="article">
								<ul class="list-unstyled">
									<li class="media">
									
										 <div class="media-body">
											<div class="card bg-dark text-white glowy">
											 <img class="card-img img-thumbnail darky" src="${article.urlToImage}"/>
											  <div class="card-img-overlay d-flex">
											    <h5 class="card-title mt-auto text-white"><a href="${article.url}" class="big-link"><b>${article.title}</b></a></h5>
											  </div>
											</div>
											${article.description}
										</div>
										
									</li>
								</ul>
								<br>
							</c:forEach>
						</div>
					</div>
				</div>
			</c:forEach>
				
				
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


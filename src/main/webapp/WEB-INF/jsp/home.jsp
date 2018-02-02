<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
	    
<div class="container-fluid">
	    
		<div class="row">
		    <div class="col-md-3">
		    
			  	<a class="btn btn-primary" href="/update">update</a>
			  	
		    	<div class="jumbotron jumbotron-fluid">
				  <div class="container">
				    <h5>The current temperature is <strong>${currentTemp}&deg;</strong></h5>
				    <h5>with a low of <strong>${lowTemp}&deg;</strong> and a high of <strong>${highTemp}&deg;</strong>.</h5>
				    <h5>The humidity is at <strong>${humidity}</strong></h5>
				    <h5>with <strong>${cloudCoverage}</strong> cloud coverage</h5>
				    <h5>and a <strong>${rainChance}</strong> chance of rain.</h5>
				    <h5>The sun will rise at <strong>${sunrise}</strong></h5>
				    <h5>and will set at <strong>${sunset}.</strong></h5>
				    <h5>The wind is blowing at <strong>${windSpeed}</strong> mph</h5>
				    <h5>towards the <strong>${windDirection}</strong>.</h5>
				    <h5>with a gust of <strong>${windGust}</strong> mph.</h5>
				  </div>
				</div>
				
				<div class="jumbotron jumbotron-fluid">
				  <div class="container">
				    <h4>Work commute: <strong>${travelTime}</strong></h4>
				    <h4>Fuel used: <strong>${fuelUsed}</strong> gallons</h4>
				  </div>
				</div>
				
				<div class="jumbotron jumbotron-fluid">
				  <div class="container">
				    <h4>Dad joke of the day:</h4>
				    <h3><strong>${joke}</strong></h3>
				  </div>
				</div>
				
		    </div>
		    
		    <div class="col-md-9">
				<div class="feed">
					<c:forEach items="${news}" var="source">
						<c:forEach items="${source.articles}" var="article">
							<div class="row">
								<div class="col-md-2">
				                	<a href="${article.url}"><img class="img-thumbnail" src="${article.urlToImage}"/></a>
								</div>
								<div class="col-md-10">
									<div class="card">
										<div class="card-header light-blue white-text"><strong>${source.source}</strong> ${article.author}</div>
									  	<div class="card-body">
										    <h4 class="card-title">${article.title}</h4>
										    <p>${article.description}</p>
									  	</div>
									</div>
								</div>
							</div>
							<br>
						</c:forEach>
					</c:forEach>
				

				</div>
			</div>


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


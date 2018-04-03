<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

	<div class="sideways-weather">
	<%int count = 0;%>
	<c:forEach items="${forecastList}" var="forecast">
	
		<%count++;%>
	
		<div class="weather dark-box padded-sides dark-tip" id="popover_<%=count%>" tabindex="0" role="button" data-trigger="focus">
			<div class="float-left weather-pic-box">
				<div class="full-width weather-icon"><img src="${forecast.iconUrl}"></div>
				<div class="full-width weather-text-overlay">${forecast.conditionMore}</div>
			</div>
			<div class="float-left weather-text-box">
				<div class="full-width weather-text-top">${forecast.timestamp}</div>
				<div class="full-width weather-text-middle">${forecast.dayText}</div>
				<div class="full-width weather-text-bottom">${forecast.temp}&deg;</div>
			</div>
		</div>
		
		<div id="popover-title_<%=count%>" class="hidden dark-tip"><b>${forecast.timestamp} ${forecast.dayText}, ${forecast.dateText}</b></div>
		
		<div class="float-left text-box hidden dark-tip" id="popover-content_<%=count%>">
			<div class="full-width larger-text"><b>Wind</b>: ${forecast.windSpeed} mph ${forecast.windDirection}</div>
			<div class="full-width larger-text"><b>Cloud Coverage</b>: ${forecast.cloudiness}%</div>
			<div class="full-width larger-text"><b>Humidity</b>: ${forecast.humidity}%</div>
			<div class="full-width larger-text"><b>UV Index</b>: ${uvIndex}</div>
			<div class="full-width larger-text"><b>Sun</b>: ${sunrise} to ${sunset}</div>
		</div>
		
		<script>
			$(function(){ $("#popover_<%=count%>").popover({
			    	placement: 'bottom',
			    	trigger: 'hover',
			        html : true, 
			        
			        content:	function() { return $("#popover-content_<%=count%>").html(); },
			        title: 		function() { return $("#popover-title_<%=count%>").html(); }
			    });
			});
		</script>
		
		</c:forEach>
	</div>

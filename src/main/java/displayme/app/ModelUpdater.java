package displayme.app;

import org.springframework.ui.Model;

import displayme.app.weather.WeatherUtility;

public class ModelUpdater {

	 public void updateWeatherModel(Model model) {
    	model.addAttribute("currentTemp", Data.weather.getMainInstance().getTemperature());
    	model.addAttribute("highTemp", Data.weather.getMainInstance().getMaxTemperature());
    	model.addAttribute("lowTemp", Data.weather.getMainInstance().getMinTemperature());
    	
    	model.addAttribute("humidity", Data.weather.getMainInstance().getHumidity() + "%");
    	model.addAttribute("rainChance", WeatherUtility.getRainPercentage() + "%");
    	model.addAttribute("cloudCoverage", Data.weather.getCloudsInstance().getPercentageOfClouds() + "%");
    	
    	model.addAttribute("sunrise", WeatherUtility.convertToTime(Data.weather.getSysInstance().getSunriseTime()) + " am");
    	model.addAttribute("sunset", WeatherUtility.convertToTime(Data.weather.getSysInstance().getSunsetTime()) + " pm");
    	
    	model.addAttribute("windDirection", WeatherUtility.getWindDirectionFromDegree(Data.weather.getWindInstance().getWindDegree()));
    	model.addAttribute("windGust", Data.weather.getWindInstance().getWindGust());
    	model.addAttribute("windSpeed", Data.weather.getWindInstance().getWindSpeed());
	}

	public void updateNewsModule(Model model) {
		model.addAttribute("news", Data.news);
	}

	public void updateJokeModule(Model model) {
		model.addAttribute("joke", Data.joke);
	}

	public void updateTrafficModule(Model model) {
		model.addAttribute("travelTime", ModuleUtility.getTravelTimeFromSeconds(Data.traffic.getRoute().getRealTime()));
		model.addAttribute("fuelUsed", Data.traffic.getRoute().getFuelUsed());
	}
	
}

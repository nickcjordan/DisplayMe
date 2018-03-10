package displayme.app;

import java.util.List;

import org.springframework.ui.Model;

import displayme.app.weather.WeatherUtility;
import net.aksingh.owmjapis.model.param.Weather;
import net.aksingh.owmjapis.model.param.WeatherData;

public class ModelUpdater extends Data {

	 public void updateWeatherModel(Model model) {

		model.addAttribute("currentForecast", weather.getCurrentForecast());
		model.addAttribute("forecastList", weather.getForecast());
		model.addAttribute("sunrise", WeatherUtility.convertToTime(weather.getCurrentWeather().getSystemData().getSunriseDateTime()) + " am");
		model.addAttribute("sunset",WeatherUtility.convertToTime(weather.getCurrentWeather().getSystemData().getSunsetDateTime()) + " pm");
		model.addAttribute("uvIndex", weather.getCurrentUVIndex().getValue());
		 
//    	model.addAttribute("currentTemp", WeatherUtility.convertKtoF(weather.getCurrentWeather().getMainData().getTemp()));
//    	model.addAttribute("highTemp", WeatherUtility.convertKtoF(weather.getCurrentWeather().getMainData().getTempMax()));
//    	model.addAttribute("lowTemp", WeatherUtility.convertKtoF(weather.getCurrentWeather().getMainData().getTempMin()));
    	
//    	model.addAttribute("humidity", weather.getCurrentWeather().getMainData().getHumidity());
//    	model.addAttribute("cloudCoverage", weather.getCurrentWeather().getCloudData().getCloudiness());
//    	
//    	model.addAttribute("sunrise", WeatherUtility.convertToTime(weather.getCurrentWeather().getSystemData().getSunriseDateTime()) + " am");
//    	model.addAttribute("sunset", WeatherUtility.convertToTime(weather.getCurrentWeather().getSystemData().getSunsetDateTime()) + " pm");
//    	
//    	model.addAttribute("windDirection", WeatherUtility.getWindDirectionFromDegree(weather.getCurrentWeather().getWindData().getDegree()));
//    	model.addAttribute("windSpeed", weather.getCurrentWeather().getWindData().getSpeed());
    	
    	
    	
//    	model.addAttribute("dailyWeather", weather.getHourlyWeather().getDataList()); //TODO data list
    	
//    	for (WeatherData data : weather.getHourlyWeather().getDataList()) {
//    		List<Weather> weathers = data.getWeatherList();
//    		for (Weather condition : weathers) {
//    			String info = condition.getMainInfo();
//    			System.out.println(info + " " + condition.getMoreInfo() + " " + data.getDateTimeText() + " " + data.getTempData().toJsonPretty());
//    		}
//    	}
	}

	public void updateNewsModule(Model model) {
		model.addAttribute("news", news);
	}

	public void updateJokeModule(Model model) {
		model.addAttribute("joke", joke);
	}

	public void updateTrafficModule(Model model) {
		model.addAttribute("travelTime", ModuleUtility.getTravelTimeFromSeconds(traffic.getRoute().getRealTime()));
		model.addAttribute("fuelUsed", traffic.getRoute().getFuelUsed());
	}
	
}

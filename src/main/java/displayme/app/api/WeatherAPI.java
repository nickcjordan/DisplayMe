package displayme.app.api;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

public class WeatherAPI {

	private static final String apiKey = "26a32abfe0c53348b7bbebcbdebdc4fa";
	private static final int dallas = 4684888;
	
	private CurrentWeather weather;
	
	public WeatherAPI() {
		this.weather = getWeatherData();
	}
	
    private CurrentWeather getWeatherData() {
		return (Modules.WEATHER.isactive()) ? new OpenWeatherMap(apiKey).currentWeatherByCityCode(dallas) : null;
	}

	public CurrentWeather getWeather() {
    	return weather;
    }
	
	
}

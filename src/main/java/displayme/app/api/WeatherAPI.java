package displayme.app.api;

import org.springframework.stereotype.Component;

import displayme.Log;
import displayme.app.weather.WeatherInfo;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentUVIndex;
import net.aksingh.owmjapis.model.CurrentWeather;
import net.aksingh.owmjapis.model.HourlyWeatherForecast;

@Component
public class WeatherAPI {
	
//	private static final int DALLAS = 4684888;
	private static final float LATITUDE_DALLAS = (float) 32.843252;
	private static final float LONGITUDE_DALLAS = (float) -96.763979;
	private static final String WEATHER_API_KEY = "26a32abfe0c53348b7bbebcbdebdc4fa";
	
	private OWM api;
	
	public WeatherAPI() {
		api = new OWM(WEATHER_API_KEY);
	}
	
    public WeatherInfo getWeatherData() {
		return new WeatherInfo(getCurrentWeather(), getHourlyWeather(), getCurrentUVIndex());
	}

	private HourlyWeatherForecast getHourlyWeather() {
		try { 
			return api.hourlyWeatherForecastByCoords(LATITUDE_DALLAS, LONGITUDE_DALLAS);
		} catch (APIException e) { 
			Log.err("ERROR calling weather api :: Hourly Weather :: " + e.getCode() + " :: " + e.getInfo() + " :: " + e.getMessage());
			return null;
		}
	}

	private CurrentUVIndex getCurrentUVIndex() {
		try { 
			return api.currentUVIndexByCoords(LATITUDE_DALLAS, LONGITUDE_DALLAS);
		} catch (APIException e) { 
			Log.err("ERROR calling weather api :: UV Index :: " + e.getCode() + " :: " + e.getInfo() + " :: " + e.getMessage());
			return null;
		}
	}

	private CurrentWeather getCurrentWeather() {
		try { 
			return api.currentWeatherByCoords(LATITUDE_DALLAS, LONGITUDE_DALLAS);
		} catch (APIException e) { 
			Log.err("ERROR calling weather api :: Current Weather :: " + e.getCode() + " :: " + e.getInfo() + " :: " + e.getMessage());
			return null;
		}
	}

}

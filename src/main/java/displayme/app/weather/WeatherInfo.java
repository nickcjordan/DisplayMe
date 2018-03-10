package displayme.app.weather;

import java.util.ArrayList;
import java.util.List;

import net.aksingh.owmjapis.model.CurrentUVIndex;
import net.aksingh.owmjapis.model.CurrentWeather;
import net.aksingh.owmjapis.model.HourlyWeatherForecast;
import net.aksingh.owmjapis.model.param.WeatherData;

public class WeatherInfo {
	
	private CurrentWeather currentWeather; 
	private HourlyWeatherForecast hourlyWeather;
	private CurrentUVIndex currentUVIndex;
	private List<Forecast> forecast;
	private Forecast currentForecast;
	
	public WeatherInfo(CurrentWeather currentWeather, HourlyWeatherForecast hourlyWeather, CurrentUVIndex currentUVIndex) {
		super();
		this.currentWeather = currentWeather;
		this.hourlyWeather = hourlyWeather;
		this.currentUVIndex = currentUVIndex;
		this.forecast = buildForecastList();
		this.currentForecast = buildCurrentForecast();
	}

	private List<Forecast> buildForecastList() {
		List<Forecast> list = new ArrayList<Forecast>();
		for (WeatherData data : hourlyWeather.getDataList()) {
			list.add(buildForecast(data));
		}
		return list;
	}

	private Forecast buildForecast(WeatherData data) {
		Forecast f = new Forecast();
		f.setCloudiness(data.getCloudData().getCloudiness());
		f.setCondition(data.getWeatherList().get(0).getMainInfo());
		f.setConditionMore(data.getWeatherList().get(0).getMoreInfo());
		f.setHumidity(data.getMainData().getHumidity());
		f.setTemp(WeatherUtility.convertKtoF(data.getMainData().getTemp()));
		f.setTimestamp(data.getDateTimeText());
		f.setWindDirection(WeatherUtility.getWindDirectionFromDegree(data.getWindData().getDegree()));
		f.setWindSpeed(data.getWindData().getSpeed());
		f.setIconUrl(data.getWeatherList().get(0).getIconCode());
		return f;
	}
	
	private Forecast buildCurrentForecast() {
		Forecast f = new Forecast();
		f.setCloudiness(currentWeather.getCloudData().getCloudiness());
		f.setCondition(currentWeather.getWeatherList().get(0).getMainInfo());
		f.setConditionMore(currentWeather.getWeatherList().get(0).getMoreInfo());
		f.setHumidity(currentWeather.getMainData().getHumidity());
		f.setTemp(WeatherUtility.convertKtoF(currentWeather.getMainData().getTemp()));
		f.setTimestamp(WeatherUtility.convertToTime(currentWeather.getDateTime()));
		f.setWindDirection(WeatherUtility.getWindDirectionFromDegree(currentWeather.getWindData().getDegree()));
		f.setWindSpeed(currentWeather.getWindData().getSpeed());
		return f;
	}

	public List<Forecast> getForecast() {
		return forecast;
	}

	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}

	public CurrentWeather getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(CurrentWeather currentWeather) {
		this.currentWeather = currentWeather;
	}

	public HourlyWeatherForecast getHourlyWeather() {
		return hourlyWeather;
	}

	public void setHourlyWeather(HourlyWeatherForecast hourlyWeather) {
		this.hourlyWeather = hourlyWeather;
	}

	public CurrentUVIndex getCurrentUVIndex() {
		return currentUVIndex;
	}

	public void setCurrentUVIndex(CurrentUVIndex currentUVIndex) {
		this.currentUVIndex = currentUVIndex;
	}

	public Forecast getCurrentForecast() {
		return currentForecast;
	}

	public void setCurrentForecast(Forecast currentForecast) {
		this.currentForecast = currentForecast;
	}
	
}

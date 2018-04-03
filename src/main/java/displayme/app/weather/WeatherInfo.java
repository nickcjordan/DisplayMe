package displayme.app.weather;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
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
		this.currentForecast = buildCurrentForecast();
		this.forecast = buildForecastList(currentForecast);
	}

	private List<Forecast> buildForecastList(Forecast current) {
		List<Forecast> list = new ArrayList<Forecast>();
		list.add(current);
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
		f.setWindDirection(WeatherUtility.getWindDirectionFromDegree(data.getWindData().getDegree()));
		f.setWindSpeed(data.getWindData().getSpeed());
		f.setIconUrl(data.getWeatherList().get(0).getIconCode());
		f.setTimestamp(getDateTimeFormatted(data.getDateTime()));
		f.setDateText(getDayMonth(data.getDateTime()));
		f.setDayText(getDayOfWeek(data.getDateTime()));
		return f;
	}
	
	private String getDayMonth(Date date) {
		String[] months = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Oct", "Nov", "Dec"};
		String month = months[date.getMonth()];
		return month + " " + date.getDate();
	}

	private String getDateTimeFormatted(Date date) {
		String timeText = "";
		if (date.getHours() == 0) {
			timeText = "12 am";
		} else if (date.getHours() > 12) {
			timeText =  Integer.toString(date.getHours() - 12) + " pm";
		} else {
			timeText =  Integer.toString(date.getHours()) + " am";
		}
		return timeText;
	}

	private String getDayOfWeek(Date date) {
		String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		Date now = Date.from(Instant.now());
		
		if (now.getDay() == date.getDay()) {
			return "Today";
		} else if (((now.getDay()+1) == date.getDay()) || ((now.getDay()==6)&&(date.getDay()==0))) {
			return "Tomorrow";
		} else {
			return days[date.getDay()];
		}
		
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
		f.setIconUrl(currentWeather.getWeatherList().get(0).getIconCode());
		f.setTimestamp(getDateTimeFormatted(currentWeather.getDateTime()));
		f.setDateText(getDayMonth(currentWeather.getDateTime()));
		f.setDayText(getDayOfWeek(currentWeather.getDateTime()));
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

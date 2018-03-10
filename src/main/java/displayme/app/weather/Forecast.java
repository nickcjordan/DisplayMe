package displayme.app.weather;

public class Forecast {
	
	private final String urlPrefix = "http://openweathermap.org/img/w/";
	private final String urlSuffix = ".png";
	
	private double temp;
	private int humidity;
	private int cloudiness;
	private String condition;
	private String conditionMore;
	private String timestamp;
	private double windSpeed;
	private String windDirection;
	private String iconUrl;
	
	public void setIconUrl(String iconCode) {
		this.iconUrl = urlPrefix + iconCode + urlSuffix;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getCloudiness() {
		return cloudiness;
	}
	public void setCloudiness(int cloudiness) {
		this.cloudiness = cloudiness;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getConditionMore() {
		return conditionMore;
	}
	public void setConditionMore(String conditionMore) {
		this.conditionMore = conditionMore;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(Double double1) {
		this.windSpeed = double1;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	
}

package displayme.app.weather;

import java.util.Date;

import displayme.app.Data;

public class WeatherUtility {

	
	@SuppressWarnings("deprecation")
	public static String convertToTime(Date date) {
		int hour = date.getHours();
		if (hour > 12) {
			hour = hour - 12;
		} else if (hour < 1) {
			hour = 12;
		}
		int minNum = date.getMinutes();
		String min = String.valueOf(minNum);
		if (minNum < 10) {
			min = "0" + min;
		}
		return hour + ":" + min;
	}
	
	public static Object getWindDirectionFromDegree(float windDegree) {
		if ((windDegree < 22.5) || (windDegree > 337.5)) 	{ return "North"; } 
									else if (windDegree < 67.5) 	{ return "Northeast"; } 
									else if (windDegree < 112.5) 	{ return "East"; } 
									else if (windDegree < 157.5) 	{ return "Southeast"; } 
									else if (windDegree < 202.5) 	{ return "South"; } 
									else if (windDegree < 247.5) 	{ return "Southwest"; } 
									else if (windDegree < 292.5) 	{ return "West"; } 
																		else 	{ return "Northwest"; } 
	}
	
	public static float getRainPercentage() {
		return (Data.weather.hasRainInstance()  && Data.weather.getRainInstance().hasRain()) ? Data.weather.getRainInstance().getRain() : 0;
	}
	
}

package displayme.app.weather;

import java.util.Date;

import displayme.app.Data;

public class WeatherUtility {

	
	@SuppressWarnings("deprecation")
	public static String convertToTime(Date date) {
		String suffix = "";
		int hour = date.getHours();
		if (hour > 12) {
			hour = hour - 12;
			suffix = "pm";
		} if (hour < 1) {
			hour = 12;
		} if (hour < 12){
			suffix = "am";
		}
		int minNum = date.getMinutes();
		String min = String.valueOf(minNum);
		if (minNum < 10) {
			min = "0" + min;
		}
		return hour + ":" + min + " " + suffix;
	}
	
	public static String getWindDirectionFromDegree(Double double1) {
		if ((double1 < 22.5) || (double1 > 337.5)) 	{ return "North"; } 
									else if (double1 < 67.5) 	{ return "Northeast"; } 
									else if (double1 < 112.5) 	{ return "East"; } 
									else if (double1 < 157.5) 	{ return "Southeast"; } 
									else if (double1 < 202.5) 	{ return "South"; } 
									else if (double1 < 247.5) 	{ return "Southwest"; } 
									else if (double1 < 292.5) 	{ return "West"; } 
																		else 	{ return "Northwest"; } 
	}
	
	public static float getRainPercentage() {
		return 0;
	}
	
	public static int convertKtoF(double kelvin) {
        return (int) (((kelvin - 273.0) * 9.0/5.0) + 32.0);
	}
	
}

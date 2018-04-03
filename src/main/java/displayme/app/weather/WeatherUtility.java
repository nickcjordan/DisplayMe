package displayme.app.weather;

import java.util.Date;

import displayme.model.Data;

public class WeatherUtility {

	
	@SuppressWarnings("deprecation")
	public static String convertToTime(Date date) {
		String minText = ":" + String.format("%02d", date.getMinutes());
		if (date.getHours() < 12) {
			return Integer.toString(date.getHours()) + minText + " am";
		} else {
			return  Integer.toString(date.getHours() - 12) + minText + " pm";
		}
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

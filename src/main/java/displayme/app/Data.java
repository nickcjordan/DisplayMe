package displayme.app;

import java.util.List;

import displayme.app.news.NewsAPIResponse;
import displayme.app.traffic.TrafficAPIResponse;
import net.aksingh.owmjapis.CurrentWeather;

public class Data {
	
	public static CurrentWeather weather;
	public static TrafficAPIResponse traffic;
	public static List<NewsAPIResponse> news;
	public static String joke;
	
}

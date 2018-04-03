package displayme.model;

import java.util.HashMap;
import java.util.List;

import displayme.app.crypto.CryptoInfo;
import displayme.app.crypto.Currency;
import displayme.app.news.NewsAPIResponse;
import displayme.app.traffic.TrafficAPIResponse;
import displayme.app.weather.WeatherInfo;

public class Data {
	
	public static WeatherInfo weather;
	public static TrafficAPIResponse traffic;
	public static List<NewsAPIResponse> news;
	public static String joke;
	public static CryptoInfo cryptoInfo;
	
}

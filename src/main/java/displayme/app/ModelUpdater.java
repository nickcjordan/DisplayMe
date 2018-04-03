package displayme.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.ui.Model;

import displayme.app.crypto.CryptoValueComparator;
import displayme.app.crypto.Currency;
import displayme.app.weather.WeatherUtility;
import displayme.model.Data;

public class ModelUpdater extends Data {

	 public void updateWeatherModel(Model model) {
		model.addAttribute("currentForecast", weather.getCurrentForecast());
		model.addAttribute("forecastList", weather.getForecast());
		model.addAttribute("sunrise", WeatherUtility.convertToTime(weather.getCurrentWeather().getSystemData().getSunriseDateTime()));
		model.addAttribute("sunset",WeatherUtility.convertToTime(weather.getCurrentWeather().getSystemData().getSunsetDateTime()));
		model.addAttribute("uvIndex", weather.getCurrentUVIndex().getValue());
	}
	 
	public void updateCryptoModule(Model model) {
		model.addAttribute("coins", Data.cryptoInfo.getCoins());
		model.addAttribute("coinBalance", Data.cryptoInfo.getValueSum());
	}

	public void updateNewsModule(Model model) {
		model.addAttribute("news", news);
	}

	public void updateJokeModule(Model model) {
		model.addAttribute("joke", joke);
	}

	public void updateTrafficModule(Model model) {
		model.addAttribute("travelTime", ModuleUtility.getTravelTimeFromSeconds(traffic.getRoute().getRealTime()));
		model.addAttribute("fuelUsed", traffic.getRoute().getFuelUsed());
	}
	
	public void updateModelWithAdditionalValues(Model model) {
		model.addAttribute("date", new SimpleDateFormat("MM/dd").format(new Date()));
	}
	
}

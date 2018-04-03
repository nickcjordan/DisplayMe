package displayme.app;

import org.springframework.ui.Model;

import displayme.Log;
import displayme.app.api.CryptoCompareAPI;
import displayme.app.api.JokeAPI;
import displayme.app.api.NewsAPI;
import displayme.app.api.TrafficAPI;
import displayme.app.api.WeatherAPI;
import displayme.model.Data;
import displayme.model.Modules;

public class ModuleUpdater {

	public String updateModel(Model model) {
		ModelUpdater updater = new ModelUpdater();
		  if (Modules.TRAFFIC.isactive())  	{ updater.updateTrafficModule(model); } 
		  if (Modules.WEATHER.isactive()) 	{ updater.updateWeatherModel(model); }
		  if (Modules.NEWS.isactive()) 		{ updater.updateNewsModule(model); }
		  if (Modules.JOKE.isactive()) 			{ updater.updateJokeModule(model); }
		  if (Modules.CRYPTO.isactive()) 	{ updater.updateCryptoModule(model); }
		  updater.updateModelWithAdditionalValues(model);
		return "home";
	}
	
	public void updateWeatherData() {
    	Log.info("updating weather data...");
    	Data.weather = (Modules.WEATHER.isactive()) ? new WeatherAPI().getWeatherData() : null;
    	Log.info("updated.");
    }
    
    public void updateTrafficData() {
    	Log.info("updating traffic data...");
    	Data.traffic = (Modules.TRAFFIC.isactive()) ? new TrafficAPI().getTraffic() : null;
    	Log.info("updated.");
    }

	public void updateNewsData() {
    	Log.info("updating news data...");
    	Data.news = (Modules.NEWS.isactive()) ? new NewsAPI().getNews() : null;
    	Log.info("updated.");
	}


	public void updateJokeData() {
    	Log.info("updating joke data...");
    	Data.joke = (Modules.JOKE.isactive()) ? new JokeAPI().getJoke() : null;
    	Log.info("updated.");
	}
	
	public void updateCryptoData() {
    	Log.info("updating crypto data...");
    	Data.cryptoInfo = (Modules.CRYPTO.isactive()) ? new CryptoCompareAPI().getCryptoInfo() : null;
    	Log.info("updated.");
	}

}
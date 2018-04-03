package displayme.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import displayme.app.ModuleUpdater;

@Controller
public class UpdateController {
	
	@RequestMapping(value = "/update")
	protected String update(Model model) {
		ModuleUpdater updater = new ModuleUpdater();
		updater.updateWeatherData();
		updater.updateTrafficData();
		updater.updateNewsData();
		updater.updateJokeData();
		updater.updateCryptoData();
    	return updater.updateModel(model);
	}
	
}

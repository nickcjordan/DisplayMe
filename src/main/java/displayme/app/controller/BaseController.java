package displayme.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import displayme.Log;

@Controller
public class BaseController {
	
    @RequestMapping(value = "/")
    public String init(Model model) {
    	Log.info("READY");
    	return "home";
    }
	
}

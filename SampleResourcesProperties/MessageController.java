package sysblo.controller;

import java.util.Locale;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {

	@Autowired /*** 1 ***/
	private MessageSource messageSource;

	@Autowired /*** 2 ***/
	private Properties applicationProperties;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String begin(Locale locale, Model model){

		/*** 3 ***/
		model.addAttribute("resources_message", messageSource.getMessage("Resources.Message", new String[] {"Bind"}, locale));

		/*** 4 ***/
		model.addAttribute("properties_message", applicationProperties.getProperty("Properties.Message"));

		return "ResourcesProperties";

	}

}

package sysblo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sysblo.bean.BeanSample;

@Controller
public class BeanController {

	@Autowired /*** 1 ***/
	BeanSample beanSample;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String begin(Model model){

		/*** 2 ***/
		model.addAttribute("message", beanSample.sampleMethod());

		return "BeanView";

	}
}

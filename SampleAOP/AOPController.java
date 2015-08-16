package sysblo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sysblo.bean.SampleBean;

@Controller
public class AOPController {

	@Autowired
	SampleBean sampleBean;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String begin(Model model){

		model.addAttribute("message", sampleBean.sampleAOPMethod());

		return "AOPView";

	}

}

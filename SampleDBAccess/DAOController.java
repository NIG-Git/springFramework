package sysblo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sysblo.dao.SampleDAO;

@Controller
public class DAOController {

	@Autowired
	private SampleDAO sampleDAO;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String begin(Model model){

		/*** 1 ***/
		List<Map<String, Object>> retList = sampleDAO.getAllData();

		/*** 2 ***/
		model.addAttribute("blog_name", retList.get(0).get("blog_name"));
		model.addAttribute("user_name", retList.get(0).get("user_name"));

		return "DBAccessView";

	}

}

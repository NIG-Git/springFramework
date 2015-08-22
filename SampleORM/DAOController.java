package sysblo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sysblo.dao.SampleDAO;
import sysblo.entity.SampleEntity;

@Controller
public class DAOController {

	@Autowired /*** 1 ***/
	SampleDAO<SampleEntity> sampleDAO;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String begin(Model model){

		/*** 2 ***/
		List<SampleEntity> retList = sampleDAO.getAllData();

		/*** 3 ***/
		model.addAttribute("blog_name", retList.get(0).getBlog_name());
		model.addAttribute("user_name", retList.get(0).getUser_name());

		return "ORMView";

	}

}

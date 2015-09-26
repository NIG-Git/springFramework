package sysblo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionController {

	/*** 1 ***/
	@RequestMapping(value="/", method=RequestMethod.GET)
	public void beginException1(Model model){
		throw new NullPointerException();
	}

	/*** 2 ***/
	@RequestMapping(value="/another", method=RequestMethod.GET)
	public void beginException2(Model model) {
		int num = 10 / 0;
	}

	/*** 3 ***/
	@ExceptionHandler(NullPointerException.class)
	public void exceptionHandle1(){
		System.out.println("@ExceptionHandlerでキャッチしました。");
	}

}

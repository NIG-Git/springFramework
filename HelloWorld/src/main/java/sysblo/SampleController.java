package sysblo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller /*** 1 ***/
public class SampleController{

	@RequestMapping(value = "/", method = RequestMethod.GET) /*** 2 ***/
	public String begin(){

		return "SampleView"; /*** 3 ***/

	}

}

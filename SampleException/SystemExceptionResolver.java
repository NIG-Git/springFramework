package sysblo.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/*** 1 ***/
public class SystemExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest req,
			HttpServletResponse res,
			Object object,
			Exception exception) {

		System.out.println(exception.getMessage());
		System.out.println("SystemExceptionResolverでキャッチしました。");

		ModelAndView model = new ModelAndView();

		return model;

	}

}

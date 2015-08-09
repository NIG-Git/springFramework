package SysBlo.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SampleFilterNext implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("initNext Start!");
		System.out.println("initNext END!");
	}

	/*** 1 ***/
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilterNext Start!");
		chain.doFilter(request, response);
		System.out.println("doFilterNext END!");
	}

	public void destroy() {
		System.out.println("destroyNext Start!");
		System.out.println("destroyNext END!");
	}

}

package SysBlo.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*** 1 ***/
public class SampleFilter implements Filter {

	/*** 2 ***/
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init Start!");
		System.out.println("init END!");
	}

	/*** 3 ***/
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter Start!");
		chain.doFilter(request, response);
		System.out.println("doFilter End!");
	}

	/*** 4 ***/
	public void destroy() {
		System.out.println("destroy Start!");
		System.out.println("destroy END!");
	}

}

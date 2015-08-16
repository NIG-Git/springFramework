package sysblo.aspect;

import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect /*** 1 ***/
@Service /*** 2 ***/
public class AspectSample {

	/*** 3 ***/
	@Before("execution(* sysblo.bean.SampleBeanImpl.sampleAOPMethod(..))")
	public void beforeAOP(JoinPoint joinPoint){
		System.out.println(Calendar.getInstance().getTime() + " : BeforeAOP Execute!");
	}

	/*** 4 ***/
	@After("execution(* sysblo.bean.SampleBean.sampleAOPMethod(..))")
	public void afterAOP(JoinPoint joinPoint){
		System.out.println(Calendar.getInstance().getTime() + " : afterAOP Execute!");
	}

}

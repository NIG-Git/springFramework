package sysblo.bean;

import org.springframework.stereotype.Service;

@Service
public class SampleBeanImpl implements SampleBean{

	public String sampleAOPMethod() {

		return "AOP view";

	}

}

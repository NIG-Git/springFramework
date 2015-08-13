package sysblo.bean;

import org.springframework.stereotype.Service;

@Service /*** 1 ***/
public class BeanSampleImpl implements BeanSample {

	public String sampleMethod() /*** 2 ***/ {

		return "DI Success!!";

	}

}

package com.care.bank;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextprovider implements ApplicationContextAware {
	
	public static ApplicationContext ac;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println("application 실행됩니다.");
		ac = applicationContext; //매개변수, bean들이 저장되는 공간을 알고있다.
		
	}

}

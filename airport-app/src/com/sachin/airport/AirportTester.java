package com.sachin.airport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportTester {

	public static void main(String[] args) {
		String beanConfigurationFile = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationFile);
		Airport airport = (Airport) container.getBean(Airport.class);
		airport.runWay();
		airport.maintenance();
	}
}

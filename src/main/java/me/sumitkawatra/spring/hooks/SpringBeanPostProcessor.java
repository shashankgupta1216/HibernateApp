package me.sumitkawatra.spring.hooks;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
/**
 * This Hooks Loads for every Bean Init
 * @author Sumit Kawatra
 *
 */
@Component
public class SpringBeanPostProcessor implements BeanPostProcessor {

	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SpringBeanPostProcessor | postProcessBeforeInitialization--> " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SpringBeanPostProcessor | postProcessAfterInitialization--> " + beanName);
		return bean;
	}

}

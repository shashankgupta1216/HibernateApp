package me.sumitkawatra.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBean implements BeanNameAware, ApplicationContextAware, BeanFactoryAware, InitializingBean,DisposableBean {
	private String name;

	public SpringBean() {
		super();
		System.out.println("Spring Bean Constructor.");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware --> " + beanFactory);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware --> " + applicationContext);
	}

	public void setBeanName(String beanName) {
		System.out.println("BeanNameAware --> " + beanName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SpringBean [name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean --> afterPropertiesSet");
	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean ---> destroy");
	}
}

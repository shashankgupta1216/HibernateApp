package me.sumitkawatra.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import me.sumitkawatra.beans.PrototypeBean;


@Component
public class SingletonBean {
	@Autowired
	private PrototypeBean prototypeBean;

	public SingletonBean() {
		super();
	}

	public SingletonBean(PrototypeBean prototypeBean) {
		super();
		this.prototypeBean = prototypeBean;
	}
	
	
	public PrototypeBean getPrototypeBean() {
		return createPrototypeBean();
	}

	public void setPrototypeBean(PrototypeBean prototypeBean) {
		this.prototypeBean = prototypeBean;
	}
	
	@Lookup
	public PrototypeBean createPrototypeBean(){
		return prototypeBean;
	}

}

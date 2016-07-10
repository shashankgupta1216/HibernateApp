package me.sumitkawatra.model;



public class SingletonBean {
	
	private PrototypeBean prototypeBean;
	
	public SingletonBean(PrototypeBean prototypeBean) {
		super();
		this.prototypeBean = prototypeBean;
	}

	public SingletonBean() {
		super();
	}

	public PrototypeBean getPrototypeBean() {
		return prototypeBean;
	}

	public void setPrototypeBean(PrototypeBean prototypeBean) {
		this.prototypeBean = prototypeBean;
	}
	

}

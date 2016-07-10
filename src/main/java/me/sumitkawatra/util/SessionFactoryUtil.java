package me.sumitkawatra.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static final SessionFactory sessionFactory;
	private static final ThreadLocal<Session> sessions;
	
	static {
		System.out.println("Hibernate Session Factory Loading..... Start ");
		sessions = new ThreadLocal<Session>();
		
		Configuration configuration = new Configuration().configure();
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(configuration.getProperties());
		
		sessionFactory = configuration.configure().buildSessionFactory(builder.build());
		
		System.out.println("Hibernate Session Factory Loading..... End ");
	}
	
	private SessionFactoryUtil() {
		
	}
	
	public static Session getSession() {
		Session session = sessions.get();
		if(session == null) {
			session = sessionFactory.openSession();
			sessions.set(session);
		}
		return session;
	}

	public static void closeSession() {
		Session session = sessions.get();
		
		if(session != null) {
			session.close();
			sessions.set(null);
		}		
	}
}

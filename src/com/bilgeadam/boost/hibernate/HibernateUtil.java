package com.bilgeadam.boost.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.bilgeadam.boost.model.UserEntity;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		SessionFactory factory = null;
		try {
			Configuration config = new Configuration(); // creating instance

			config.addAnnotatedClass(UserEntity.class);  // "register" creating

			factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		
		} catch (Exception ex) {
			ex.getMessage();
		}
		return factory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}

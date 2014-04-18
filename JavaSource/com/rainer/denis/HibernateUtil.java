package com.rainer.denis;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory session = buildSessionFactory();

	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		try {
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				return cfg.buildSessionFactory();
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Erro!!/n"+ e);
			throw new ExceptionInInitializerError();
		}
	
	}

	public static SessionFactory getSession() {
		return session;
	}
}
    
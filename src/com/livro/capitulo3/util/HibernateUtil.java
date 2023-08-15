package com.livro.capitulo3.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactoryAnnotation = buildSessionFactoryAnnotation();
	
	private static SessionFactory buildSessionFactoryAnnotation() {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch (Throwable e) {
			System.err.println("Criação inicial do objeto SessionFactory falhou. Erro: "+ e.getMessage());
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactoryAnnotation() {
		return sessionFactoryAnnotation;
	}
}

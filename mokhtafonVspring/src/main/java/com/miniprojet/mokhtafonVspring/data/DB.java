package com.miniprojet.mokhtafonVspring.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.miniprojet.mokhtafonVspring.model.Article;
import com.miniprojet.mokhtafonVspring.model.Personne;

public class DB implements IDAO {

	private static SessionFactory sessionFactory;
	static Session sessionObj;

	public static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		// configuration.addAnnotatedClass(com.miniprojet.mokhtafonVspring.model.Article.class);
		configuration.addAnnotatedClass(com.miniprojet.mokhtafonVspring.model.Personne.class);
		// configuration.addAnnotatedClass(com.miniprojet.mokhtafonVspring.model.Article.class);
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}

	@Override
	public Personne getUserByEmail(String email) {
	      Personne findStudentObj = null;
	      	        try {
	      	            sessionObj = buildSessionFactory().openSession();
	      	            sessionObj.beginTransaction();
	      	            findStudentObj = (Personne) sessionObj.load(Personne.class, email);
	      	        } catch(Exception sqlException) {
	      	            if(null != sessionObj.getTransaction()) {
	      	                sessionObj.getTransaction().rollback();
	      	            }
	      	            sqlException.printStackTrace();
	      	        } 
	      	        return findStudentObj;
			}

	@Override

	public List<Article> getArticlesOfUser(String Email) {
		List Articles = new ArrayList();
		try {
			// Getting Session Object From SessionFactory
			sessionObj = buildSessionFactory().openSession();
			// Getting Transaction Object From Session Object
			sessionObj.beginTransaction();
			TypedQuery<Article> query = sessionObj.createQuery("Select * FROM Article where email='" + Email + "'");
			Articles = query.getResultList();
			// Articles = sessionObj.createQuery("Select * FROM Article where
			// email='"+Email+"'").list();
		} catch (Exception sqlException) {
			if (null != sessionObj.getTransaction()) {
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if (sessionObj != null) {
				sessionObj.close();
			}
		}
		return Articles;
	}

	@Override
	public void addArticle(Article a) {
		try {
			sessionObj = buildSessionFactory().openSession();
			sessionObj.beginTransaction();
			sessionObj.save(a);
			sessionObj.getTransaction().commit();
		} catch (Exception sqlException) {
			if (null != sessionObj.getTransaction()) {
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if (sessionObj != null) {
				sessionObj.close();
			}
		}

	}

	@Override
	public void addUser(Personne p) {
		try {
			sessionObj = buildSessionFactory().openSession();
			sessionObj.beginTransaction();
			sessionObj.save(p);
			sessionObj.getTransaction().commit();

		} catch (Exception sqlException) {
			if (null != sessionObj.getTransaction()) {

				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if (sessionObj != null) {
				sessionObj.close();
			}
		}
	}

}

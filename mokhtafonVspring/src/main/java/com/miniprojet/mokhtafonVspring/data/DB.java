package com.miniprojet.mokhtafonVspring.data;

import java.util.List;

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
	private static ServiceRegistry serviceRegistry;
	static Session sessionObj;

	public static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}

	/*public static void createRecord() {
		try {
			sessionObj = buildSessionFactory().openSession();
			sessionObj.beginTransaction();
			sessionObj.save(studentObj);
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
	}*/

	@Override
	public Personne checkLogin(String email, String userPassword) {

		/*
		 * Personne p; SessionFactory sessionFactory = new
		 * AnnotationConfiguration().configure().buildSessionFactory(); Session
		 * session = sessionFactory.openSession(); ServiceRegistry reg= new
		 * ServiceRegistryBuilder().applySettings(con.getProperties()).
		 * buildServiceRegistry(); SessionFactory
		 * sf=con.buildSessionFactory(reg); Session s=sf.openSession();
		 * Transaction tx=s.beginTransaction();
		 */
		return null;
	}

	@Override
	public List<Article> getArticlesOfUser(String Email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addArticle(Article a) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(a);
		s.flush();
		tx.commit();
		s.close();

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

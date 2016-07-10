package me.sumitkawatra.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.dataobject.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;

	public ArticleDaoImpl() {
		super();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Article article) {
		Session session = getSessionFactory().openSession();

		session.beginTransaction();
		session.save(article);
		session.getTransaction().commit();
		session.close();

	}

	public Article getById(int id) {
		Article article = null;

		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		article = (Article) session.get(Article.class, id);
		session.getTransaction().commit();
		session.close();
		return article;
	}

}

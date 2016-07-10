package me.sumitkawatra.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.dataobject.Article;

@Repository
public class ArticleDaoImpl2 extends HibernateDaoSupport implements ArticleDao {
	
	@Autowired
	public ArticleDaoImpl2(SessionFactory sessionFactory) {
		super();
		System.out.println("Got It --- > " +sessionFactory);
		super.setSessionFactory(sessionFactory);
	}

	public void save(Article article) {
		
		getHibernateTemplate().getSessionFactory();		
		getHibernateTemplate().save(article);
		
	}

	public Article getById(int id) {
		Article article = getHibernateTemplate().get(Article.class, id);
		return article;
	}

}

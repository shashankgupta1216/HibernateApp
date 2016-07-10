package me.sumitkawatra.dataobject.demo;

import org.hibernate.Session;

import me.sumitkawatra.dataobject.Article;
import me.sumitkawatra.util.SessionFactoryUtil;

public class Demo1 {
	
	public static void main(String[] args) {
		Article article = getArticle();
		
		Session session = SessionFactoryUtil.getSession();
		
		session.beginTransaction();
		session.save(article);
		session.getTransaction().commit();
		
		SessionFactoryUtil.closeSession();
		
		
	}
	
	private static Article getArticle() {
		Article article = new Article();
		
		article.setId(1);
		article.setContributor("Sumit Kawatra");
		article.setTitle("Java Developer Manual");
		article.setBody(new StringBuffer("Gabru the Crew"));
		
		return article;
	}	

}
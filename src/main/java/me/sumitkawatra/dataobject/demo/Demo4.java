package me.sumitkawatra.dataobject.demo;

import me.sumitkawatra.dao.ArticleDao;
import me.sumitkawatra.dataobject.Article;
import me.sumitkawatra.util.ApplicationContextUtil;

public class Demo4 {
	
	public static void main(String[] args) {
		ArticleDao dao = (ArticleDao) ApplicationContextUtil.getContext().getBean("articleDaoImpl2");
		
		dao.save(getArticle());
		Article article = dao.getById(222);
		System.out.println(article);
		System.out.println("Done");
		ApplicationContextUtil.closeContext();
	}
	
	private static Article getArticle() {
		Article article = new Article();
		
		article.setId(222);
		article.setContributor("Dheeraj Kawatra");
		article.setTitle("HTML is the new way..");
		article.setBody(new StringBuffer("Gabru the Crew"));
		
		return article;
	}

}

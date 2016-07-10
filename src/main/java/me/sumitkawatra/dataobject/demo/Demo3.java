package me.sumitkawatra.dataobject.demo;


import me.sumitkawatra.dao.ArticleDao;
import me.sumitkawatra.dataobject.Article;
import me.sumitkawatra.util.ApplicationContextUtil;

public class Demo3 {
	
	public static void main(String[] args) {
		ArticleDao dao = (ArticleDao) ApplicationContextUtil.getContext().getBean("articleDaoImpl");
		
		dao.save(getArticle());
		Article article = dao.getById(400);
		System.out.println(article);
		System.out.println("Done");
		ApplicationContextUtil.closeContext();
		
	}
	
	private static Article getArticle() {
		Article article = new Article();
		
		article.setId(402);
		article.setContributor("Sumit Kawatra");
		article.setTitle("Java Developer woth Mongo DB");
		article.setBody(new StringBuffer("Gabru the Crew"));
		
		return article;
	}

}

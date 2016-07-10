package me.sumitkawatra.dao;

import me.sumitkawatra.dataobject.Article;

public interface ArticleDao {

	public abstract void save(Article article);

	public abstract Article getById(int id);

}

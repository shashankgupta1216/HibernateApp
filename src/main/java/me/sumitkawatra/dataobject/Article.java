package me.sumitkawatra.dataobject;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Sumit Kawatra
 *
 */
/**
 * @author Sumit Kawatra
 *
 */
@Entity
public class Article {
	
	@Id
	private int id;
	private String title;
	private StringBuffer body;
	private String contributor;

	public Article() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public StringBuffer getBody() {
		return body;
	}

	public void setBody(StringBuffer body) {
		this.body = body;
	}

	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + ", contributor=" + contributor + "]";
	}

}

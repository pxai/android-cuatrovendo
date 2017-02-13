/**
 * 
 */
package io.pello.android.cuatrovendo;

/**
 * @author PELLO_ALTADILL
 *
 */
public class ArticlePost extends Article {
	private Article article;
	
	public ArticlePost (Article article) {
		this.article = article;
		article.setUser(((User) article.getUser()).getId());
	}
}

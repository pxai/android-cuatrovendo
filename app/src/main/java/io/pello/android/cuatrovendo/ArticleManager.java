/**
 * 
 */
package io.pello.android.cuatrovendo;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author PELLO_ALTADILL
 * Manages interaction between user and api calls
 */
public class ArticleManager {
	private String url;

	private ArticleApiClient articleApiClient; 
	
	/**
	 * constructor, inits articleApiClient
	 */
	public ArticleManager (String url) {
		this.url = url;
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl(this.url)
			    .addConverterFactory(GsonConverterFactory.create())
			    .build();	
	
		articleApiClient = retrofit.create(ArticleApiClient.class);
	}
	
	/**
	 * uses retrofit API client to get articles
	 */
	public List<Article> getArticles() {
		Call<List<Article>> articlesApiCall = 
				articleApiClient.articles();
		List<Article> articles = null;
		
		try {
			articles = articlesApiCall.execute().body();
			// System.out.println(articlesApiCall.execute().message());
			 
		} catch (IOException e) {
			System.err.println("Error calling articles API");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		
		return articles;
	}
	
	

	/**
	 * uses retrofit API client to get one article by id
	 * @param id
	 * @return
	 */
	public Article getArticle(Long id) {
		Call<Article> articleApiCall = articleApiClient.article(id);
		Article article = null;
		
		try {
			 article = articleApiCall.execute().body();
		} catch (IOException e) {
			System.err.println("Error calling article API");
			e.printStackTrace();
		} 
		
		return article;
	}

	/**
	 * uses retrofit API client to create a new article
	 * @param article
	 * @return
	 */
	public boolean createArticle(Article article) {
		Call<Void> articleApiCall = articleApiClient.create(new ArticlePost(article));//.create(article);
		boolean result = false;
		
		try {
			result = articleApiCall.execute().isSuccessful();
		} catch (IOException e) {
			System.err.println("Error calling article API");
			e.printStackTrace();
		} 
		
		return result;
	}

	/**
	 * uses retrofit API client to update an article
	 * @param article
	 * @return
	 */
	public boolean updateArticle(Article article) {
		Call<Void> articleApiCall = articleApiClient.update(article);
		boolean result = false;
		
		try {
			result = articleApiCall.execute().isSuccessful();
		} catch (IOException e) {
			System.err.println("Error calling article API");
			e.printStackTrace();
		} 
		
		return result;
	}
	
	/**
	 * uses retrofit API client to delete article by id
	 * @param id
	 * @return
	 */
	public boolean deleteArticle(Long id) {
		Call<Void> articleApiCall = articleApiClient.delete(id);
		boolean result = false;
		
		try {
			result = articleApiCall.execute().isSuccessful();
		} catch (IOException e) {
			System.err.println("Error calling article API");
			e.printStackTrace();
		} 
		
		return result;
	}
}

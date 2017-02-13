/**
 * 
 */
package io.pello.android.cuatrovendo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * @author PELLO_ALTADILL
 */
public interface ArticleApiClient {
	
	@Headers("Accept: application/json")
	@GET("/2dam-project-multisite/web/app_dev.php/admin/api/article")
    Call<List<Article>> articles();
	
	@Headers("Accept: application/json")
	@GET("/2dam-project-multisite/web/app_dev.php/admin/api/article/detail/{id}")
    Call<Article> article(@Path("id") Long id);
	
	@Headers("Accept: application/json")
	@POST("/2dam-project-multisite/web/app_dev.php/admin/api/article/create")
    Call<Void> create(@Body ArticlePost article);
	
	@Headers("Accept: application/json")
	@PUT("/2dam-project-multisite/web/app_dev.php/admin/api/article/update")
    Call<Void> update(@Body ArticlePost article);
	
	@DELETE("/2dam-project-multisite/web/app_dev.php/admin/api/article/delete/{id}")
    Call<Void> delete(@Path("id") Long id);
}

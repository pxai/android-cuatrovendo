package io.pello.android.cuatrovendo;

import org.json.JSONArray;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Uses WebRequest to make reguests to the backend
 * Created by PELLO_ALTADILL on 22/01/2017.
 */
public class BackendAccess {
    private WebRequest webRequest;
    private static final String GET_LAST_URL = "http://bizgen.co/web/admin/api/task/";
    private static final String CREATE_URL = "http://bizgen.co/web/admin/api/task/create";

    public BackendAccess () {
        webRequest = new WebRequest();
    }

    /**
     * getLast tasks from backend, parse JSON
     * @param idBackend
     * @return List of tasks
     */
    public List<Article> getLast (int idBackend) {
        List<Article> tasks = new ArrayList<Article>();
        DateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

        if (webRequest.get(GET_LAST_URL+idBackend)) {
            System.out.println("OK Total: " + webRequest.getResponseString());
        } else {
            System.err.println("Error: " + webRequest.getExceptionMessage());
        }

        try {
            //JSONObject jsonResponse = new JSONObject(webRequest.getResponseString());
            JSONArray jsonArticles = new JSONArray(webRequest.getResponseString());
            for (int i = 0; i < jsonArticles.length(); i++) {
                Article article = new Article();
                System.out.println(jsonArticles.getJSONObject(i).getString("task"));
                article.setIdBackend(jsonArticles.getJSONObject(i).getInt("id"));
                article.setName(jsonArticles.getJSONObject(i).getString("task"));
                article.setName(jsonArticles.getJSONObject(i).getString("task"));
                article.setPrice((float)jsonArticles.getJSONObject(i).getDouble("price"));

                tasks.add(article);
            }
        } catch (Exception e) {
            System.err.println("Exception parsing data: " + e.getMessage());
        } finally {
            return tasks;
        }

    }

    /**
     * inserts a new Article in backend
     * @param article
     * @return
     */
    public Integer insertArticle (Article article) {

        String json = "{\"task\":{\"id\":1,\"name\":\""+article.getName()+"\",\"id_frontend\":\""+article.getId()+"\",\"latitude\":6,\"longitude\":1,\"open\":1}}";
        try {
            if (webRequest.postJson(CREATE_URL, json)) {
                System.out.println("OK POST: " + webRequest.getResponseString() + "\n" + webRequest.getResponseCode());
            } else {
                System.err.println("Error: " + webRequest.getExceptionMessage() + "\n" + webRequest.getResponseCode());
            }
        } catch (Exception e) {
            System.err.println("Error inserting Article: " + e.getMessage());
        }
        return 0;
    }
}

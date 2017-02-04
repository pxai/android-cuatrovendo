package io.pello.android.cuatrovendo;

import java.util.Date;

/**
 * Created by PELLO_ALTADILL on 22/01/2017.
 */

public class Article {
    private Integer id;
    private Integer idBackend;
    private String name;
    private String description;
    private Date publishDate;
    private Integer latitude;
    private Integer longitude;
    private Integer idSeller;
    private Integer isRead;

    public Article () {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdBackend() {
        return idBackend;
    }

    public void setIdBackend(Integer idBackend) {
        this.idBackend = idBackend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Integer idSeller) {
        this.idSeller = idSeller;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }
}
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
    private Float price;
    private Date publishDate;
    private Float latitude;
    private Float longitude;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
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

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", idBackend=" + idBackend +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", idSeller=" + idSeller +
                ", isRead=" + isRead +
                '}';
    }
}

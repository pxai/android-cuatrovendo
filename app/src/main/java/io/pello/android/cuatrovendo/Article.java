package io.pello.android.cuatrovendo;

import java.util.Date;

/**
 * Created by PELLO_ALTADILL on 22/01/2017.
 */

public class Article {
    private Long id;
    private Long idBackend;
    private String name;
    private String description;
    private Float price;
    private Date publishDate;
    private Float latitude;
    private Float longitude;
    private Object user;
    private Integer isRead;

    public Article () {

    }

    
    
    public Article(Long id, String name, String description, Float price, Float latitude, Float longitude,  User user) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.latitude = latitude;
		this.longitude = longitude;
		this.user = user;
	}



	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdBackend() {
        return idBackend;
    }

    public void setIdBackend(Long idBackend) {
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




    public Object getUser() {
		return user;
	}



	public void setUser(Object user) {
		this.user = user;
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
                ", user=" + user +
                ", isRead=" + isRead +
                '}';
    }
}

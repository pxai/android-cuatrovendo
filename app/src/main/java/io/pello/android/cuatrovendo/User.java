/**
 * 
 */
package io.pello.android.cuatrovendo;

/**
 * @author PELLO_ALTADILL
 * Simple POJO representing an item
 */
public class User {
	private Long id;
	private String idouath;
	private String username;
	private String email;

	
	public User() {
	}


	public User(Long id, String idouath, String username, String email) {
		this.id = id;
		this.idouath = idouath;
		this.username = username;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIdouath() {
		return idouath;
	}


	public void setIdouath(String idouath) {
		this.idouath = idouath;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", idouath=" + idouath + ", username=" + username + ", email=" + email + "]";
	}

	
	
	
	
}

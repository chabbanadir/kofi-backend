package com.kofi.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    public User(String imgprofil, String imgcover, String category, String email, String password, String name,String aboutus,
			String token) {
		super();
		this.imgprofil = imgprofil;
		this.imgcover = imgcover;
		this.category = category;
		this.email = email;
		this.password = password;
		this.name = name;
		this.token = token;
		this.aboutus = aboutus;
	}

    public String getAboutus() {
    	return aboutus;
    }
    
	public String getImgprofil() {
		return imgprofil;
	}

	public String getImgcover() {
		return imgcover;
	}

	public String getCategory() {
		return category;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getToken() {
		return token;
	}

	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}
	
	public void setImgprofil(String imgprofil) {
		this.imgprofil = imgprofil;
	}

	public void setImgcover(String imgcover) {
		this.imgcover = imgcover;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(nullable = true)
    private String imgprofil;

    @Column(nullable = true)
    private String imgcover;

    @Column(nullable = true)
    private String category;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true)
    private String aboutus;
    
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String token;

    public User() {}



}

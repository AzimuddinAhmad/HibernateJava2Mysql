package com.gl.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column (name="f_name")
	private String f_name;
	@Column (name="l_name")
	private String l_name;
	@Column (name="email")
	private String email;
	
	public Teacher () {
		
	}

	public Teacher(String f_name, String l_name, String email) {
		super();
		
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private String getF_name() {
		return f_name;
	}

	private void setF_name(String f_name) {
		this.f_name = f_name;
	}

	private String getL_name() {
		return l_name;
	}

	private void setL_name(String l_name) {
		this.l_name = l_name;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

}

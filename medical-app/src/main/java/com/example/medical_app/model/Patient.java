package com.example.medical_app.model;
import jakarta.persistence.*;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private int age;
	private String disease;
	
	public Patient() {}
	
	//getter
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDisease() {
		return disease;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
}
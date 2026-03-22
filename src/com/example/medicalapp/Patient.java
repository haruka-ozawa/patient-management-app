package com.example.medicalapp;

public class Patient {
	int id;
	String name;
	int age;
	String disease;
	
	public Patient(int id, String name, int age, String disease) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}
	
	public void showInfo() {
		System.out.println("ID: " + id);
		System.out.println("名前: " + name);
		System.out.println("年齢: " + age);
		System.out.println("疾患: " + disease);
	}
}

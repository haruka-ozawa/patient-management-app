package com.example.medicalapp;
import java.util.ArrayList;

public class PatientManager {
	ArrayList<Patient> patients = new ArrayList<>();
	
	public void addPatient(Patient p) {
		patients.add(p);
		System.out.println("患者の登録が完了しました");
	}
	
	public boolean exists(int id) {
		for(Patient p: patients) {
			if(p.id == id) {
				return true;
			}
		}
		return false;
	}
	
	public void showAllPatients() {
		System.out.println("-----患者一覧-----");
		for(Patient p: patients) {
			p.showInfo();
			System.out.println("------");
		}
	}
	
	public void searchPatient(int id) {
		for(Patient p: patients) {
			
			if(p.id == id) {
				System.out.println("患者が見つかりました");
				System.out.println("-----検索結果-----");
				p.showInfo();
				return;
			}
		}
		
		System.out.println("患者が見つかりません");
	}
	
	public void showElderlyPatients() {
		for(Patient p: patients) {
			if(p.age >= 65) {
				p.showInfo();
			}
		}
	}
	
	public void removePatient(int id) {
		for (int i = 0; i < patients.size(); i++) {
			if (patients.get(i).id == id) {
				int removedNum = patients.get(i).id;
				patients.remove(i);
				System.out.println("id" + removedNum + "の患者を削除しました。");
				return;
			}
		}
	}
}

package com.example.medicalapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PatientManager manager = new PatientManager();
		
		Patient p1 = new Patient(1, "田中", 65, "腰痛");
		Patient p2 = new Patient(2, "佐藤", 72, "変形性膝関節症");
		Patient p3 = new Patient(3, "鈴木", 55, "肩関節周囲炎");
		Patient p4 = new Patient(4, "小澤", 80, "変形性股関節症");
		
		manager.addPatient(p1);
		manager.addPatient(p2);
		manager.addPatient(p3);
		manager.addPatient(p4);
		
		while(true) {
			System.out.println("=== メニュー ===");
			System.out.println("1: 患者検索");
			System.out.println("2: 患者一覧");
			System.out.println("3: 患者追加");
			System.out.println("4: 患者削除");
			System.out.println("5: 終了");
			System.out.println("番号を入力してください");
			
			int choice = scanner.nextInt();
			switch (choice) {
			
				case 1: System.out.println("検索idを入力してください");
						int searchNum = scanner.nextInt();
						manager.searchPatient(searchNum);
						break;
						
				case 2: manager.showAllPatients();
						break;
						
				case 3: int id;
						while(true) {
							System.out.println("登録したい患者のidを入力してください");
							id = scanner.nextInt();
							scanner.nextLine();
							if (manager.exists(id)) {
								System.out.println("このIDは既に登録されています。別のIDを登録してください。");
							} else {
								break;
							}
						}
						
						System.out.println("登録したい患者の名前を入力してください");
						String name = scanner.nextLine();
						
						System.out.println("登録したい患者の年齢を入力してください");
						int age = scanner.nextInt();
						scanner.nextLine();
						
						System.out.println("登録したい患者の病名を入力してください");
						String disease = scanner.nextLine();
						
						Patient p = new Patient(id, name, age, disease);
						manager.addPatient(p);
						
						break;
				
				case 4: System.out.println("削除したい患者のidを入力してください");
						int removeNum = scanner.nextInt();
						manager.removePatient(removeNum);
						break;
						
				case 5: System.out.println("操作を終了します");
						scanner.close();
						return;
						
				default: System.out.println("正しい番号を入力してください");
			}
		}
	}
	
}

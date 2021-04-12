package ch5;

import java.util.Scanner;

public class StudentEx3 {
	public static void main(String[] args) {
		
		Student stuArr[]=new Student[3];
		
		for(int i=0;i<stuArr.length;i++) {
			stuArr[i]=new Student();			
		}

		
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0;i<stuArr.length;i++) {
//			System.out.printf("[%d] 학생 정보 입력\n",i);
//			System.out.print("id : ");
//			stuArr[i].id = sc.nextLine();
//			System.out.print("addr : ");
//			stuArr[i].addr = sc.nextLine();
//			System.out.print("mobile : ");
//			stuArr[i].mobile = sc.nextLine();
//			System.out.print("name : ");
//			stuArr[i].name = sc.nextLine();
//			System.out.println();
//		}
		int i=1;
		for(Student stu:stuArr) {
			System.out.printf("[%d] 학생 정보 입력\n",i++);
			System.out.print("id : ");
			stu.id = sc.nextLine();
			System.out.print("addr : ");
			stu.addr = sc.nextLine();
			System.out.print("mobile : ");
			stu.mobile = sc.nextLine();
			System.out.print("name : ");
			stu.name = sc.nextLine();
			System.out.println();			
		}
		
		//정보 확인
//		for(int i=0;i<stuArr.length;i++) {
//			System.out.printf("[%d] 학생 정보\n",i);
//			System.out.println("아이디 : "+stuArr[i].id);
//			System.out.println("이름 : "+stuArr[i].name);
//			System.out.println("주소 : "+stuArr[i].addr);
//			System.out.println("전화번호 : "+stuArr[i].mobile);
//		}
		
		i=1;
		for(Student stu:stuArr) {
			System.out.printf("[%d] 학생 정보\n",i++);
			System.out.println("아이디 : "+stu.id);
			System.out.println("이름 : "+stu.name);
			System.out.println("주소 : "+stu.addr);
			System.out.println("전화번호 : "+stu.mobile);
		}
		
		
	}
}


















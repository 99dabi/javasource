package shop;

import java.util.Scanner;

public class Myshop implements IShop {

	private String title;
	Scanner sc= new Scanner(System.in);
 Product[] carts=new Product[5];
	Product[] product=new Product[10];
	String selUser;
	User[] users=new User[2];

	@Override
	public void setTitle(String str) {
		//System.out.println("쇼핑몰 제목");
		this.title=str;

	}

	@Override
	public void genUser() {
		//user 2명 생성
//		User user1= new User("김길동",PayType.CARD);
//		User user2= new User("김길동",PayType.CASH);
//		//비 효율적이므로 배열을 사용함
		users[0]= new User("김길동",PayType.CARD);
		users[1]= new User("홍숙희",PayType.CASH);
		
		

	}

	@Override
	public void genProduct() {
		product[0]= new CellPhon("갤럭시 20" , 10000, "KT");
		product[1]= new CellPhon("갤럭시 21" , 8000, "LG");
		product[2]= new CellPhon("갤럭시 10" , 7000, "U+");
		product[3]= new CellPhon("갤럭시 9" , 6000, "KT");
		product[4]= new CellPhon("갤럭시 8" , 5000, "KT");
		product[5]= new SmartTV("스마트 TV 1", 5000,"2048");
		product[6]= new SmartTV("스마트 TV 2", 5000, "1024");
		product[7]= new SmartTV("스마트 TV 3", 5000, "2048");
		product[8]= new SmartTV("스마트 TV 4", 5000, "1024");
		product[9]= new SmartTV("스마트 TV 5", 5000, "512");
	}

	@Override
	public void start() {
		System.out.println(title+ " 메인화면 - 계정선택");
		System.out.println("=============================");
		boolean run= true;
	
		int i=0;
		for(User user:users) {
		System.out.printf("[%d]%s(%s)\n",i++,user.getName(),user.getPaytype());
		}
		System.out.print("[x]종료\n선택 : ");
		String nameU=sc.nextLine();
		System.out.println("###"+nameU+"번 선택###");
		switch (nameU) {
		case "0":case "1":
			selUser= nameU;
			productList();
			break;
		case "x":case"X":
			System.out.println(title+"종료");

			break;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요. ");
			start();
			}
		}
		
	
	public void productList() {
		System.out.println("MyShop : 상품 목록 - 상품 선택");
		System.out.println("=================================");
		int i=0;
		for(Product p:product) {
			System.out.printf("[%d]",i++);
			p.printDetail();
		}
		System.out.print("[h]메인화면\n[c]체크아웃 \n선택 : ");
		String input;
		input= sc.nextLine();
		int num;
		//input =>h =>메인화면 보여주기
//		if(input=="h") {
//			start();
//		}
//		//		=>c => checkOut() 메소드를 호출
//		else if(input == "c") {
//			checkOut(null);
//		}
//		//		=>상품번호 => 선택된 상품을 장바구니(carts) 담기 / 상폼 목록 보여주기
//		else{
//			for(int j =0;j<carts.length;j++) {
//				if(carts[j]==null) {
//					System.out.println(carts[j]);
//					num=Integer.parseInt(input);
//					carts[j]=product[num];
//					break;
//				}
//			}
//			for(int j =0;j<carts.length;j++) {
//				if(carts!=null) {
//					System.out.print(" 상품명 : "+carts[i].getPname()+" 상품가격 : "+carts[i].getPrice());
//					}else {
//						break;
//					}
//				}
//		}
	
		switch(input) {
		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		case "0":case "1":case "2":case "3":case "4":case "5":case "6":case "7":case "8":case "9":
			//선택한 상품을 장바구니에 담기
			for(i =0;i<carts.length;i++) {
				if(carts[i]==null) {
					carts[i]=product[Integer.parseInt(input)];
					break;
				}
			}
			//장바구니 출력하기
			
//			for(int j =0;j<carts.length;j++) {
//				if(carts!=null) {
//					System.out.printf(" 상품명 : "+carts[j].getPname()+" ("+carts[j].getPrice()+")");
//					}else {
//						break;
//					}
//				}
			
			productList();
			break;
		default : 
			System.out.println("\n번호를 확인해 주세요");
			break;
			
		}
		
		
		
		
	}
		
	
	public void checkOut() {
		System.out.println("MyShop : 체크아웃");
		System.out.println("=================================");
		int sum=0;		
		
		for(int i =0;i<carts.length;i++) {
			if(carts==null) {
				break;
				}else {
					System.out.print(" 상품명 : "+carts[i].getPname()+" 상품가격 : "+carts[i].getPrice());
					sum+=carts[i].getPrice();
					System.out.println(" 결재금액 : "+sum);
				}
			}
		
		
		System.out.println("=================================");
		System.out.println(" 결제 방법 : "+users[Integer.parseInt(selUser)].getPaytype());
		System.out.println(" 합계 : "+sum+" 원 입니다.");
		//input =>p : 이전 화면 => 상품목록 보여주기
				//		=>q : 결재완료 되었습니다. 메세지 출력후 종료	
				//		=>이외 다른 입력 : checkOut 호출
		System.out.println("[p]이전, [q]결제 완료\n선택 : ");
		String choice=sc.nextLine();
		System.out.println("###"+choice+"선택##");
		System.out.println("=================================");
		if(choice=="p") {
			System.out.println("이전으로 >> ");
			productList();
			//checkOut(users);
		}else if(choice=="q") {
			System.out.println("결제 완료");
		}else {
			checkOut();
		}
	}
}

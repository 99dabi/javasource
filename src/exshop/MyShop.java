package exshop;

import java.util.Scanner;

public class MyShop implements IShop {
	
	private String title;
	
	Scanner sc = new Scanner(System.in);
	
	//장바구니
	Product[] carts = new Product[5];
	//제품 생성
	Product[] products = new Product[5];
	
	User[] users=new User[2];
	
	//선택된 user값 담기
	String selUser;	

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {		
		//user 2명 생성
//		User user1 = new User("홍길동", PayType.CARD);
//		User user2 = new User("성춘향", PayType.CASH);
//		
//		users[0] = user1;
//		users[1] = user2;		
		
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);		
	}
	

	@Override
	public void genProduct() {
		// 제품 생성
//		CellPhone[] phones = new CellPhone[3];
//		CellPhone cellphone1 = new CellPhone("갤럭시", 1000000, "SKT");
//		CellPhone cellphone2 = new CellPhone("갤럭시", 1000000, "SKT");
//		CellPhone cellphone3 = new CellPhone("갤럭시", 1000000, "SKT");
//		phones[0]=cellphone1;
//		phones[1]=cellphone2;
//		phones[2]=cellphone3;
//		
//		SmartTV[] tv = new SmartTV[2];
//		SmartTV smartTV1 = new SmartTV("삼성울트라HD",2500000, "4K");
//		SmartTV smartTV2 = new SmartTV("삼성울트라HD",2500000, "4K");
//		tv[0]=smartTV1;
//		tv[1]=smartTV2;
		
		
//		Product pro1 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro2 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro3 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro4 = new SmartTV("삼성울트라HD",2500000, "4K");
//		Product pro5 = new SmartTV("삼성울트라HD",2500000, "4K");
		products[0] = new CellPhone("갤럭시", 1000000, "SKT");
		products[1] = new CellPhone("LGX-500", 800000, "KT");
		products[2] = new CellPhone("아이폰12", 1200000, "LG");
		products[3] = new SmartTV("삼성울트라HD",2500000, "4K");
		products[4] = new SmartTV("LG스마트",1400000, "1080p");		
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("============================");
		
//		for(int i=0;i<users.length;i++) {
//			System.out.printf("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());
//		}
		
		int i=0;
		for(User user:users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
		System.out.println("[X] 종료");
		System.out.print("선택 : ");
		//user를 입력할 수 있도록 코드 작성
		String input = sc.nextLine();
		
		switch (input) {
		case "0":case "1":
			//사용자가 0,1 번을 입력했다면		
			System.out.println("## "+input+" 선택 ##");
			selUser = input;
			productList();
			break;
		case "X":case "x":
			//X를 입력했다면 프로그램 종료
			System.out.println(title + " 을 종료합니다.");
			break;
		default:
			//메뉴가 제시하는 값 외의 다른 값을 입력했다면
			//메뉴를 확인해 주세요 메세지 출력한 후
			//다시 메뉴화면이 보여지도록 하기
			System.out.println("\n메뉴를 확인해 주세요\n");
			start();
			break;
		}		
	}
	
	public void productList() {
		//판매중인 상품 출력하기
		System.out.println(title + " : 상품목록 - 상품 선택");
		System.out.println("============================");
		
		int i=0;
		for(Product p:products) {
			System.out.printf("[%d]",i++);
			p.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String input = sc.nextLine();
		
		switch (input) {
		case "h":
			//input => h => 메인화면 보여주기
			start();
			break;
		case "c":
			//checkOut() 메소드를 호출
			checkOut();
			break;
		case "0":case "1":case "2":case "3":case "4":
			//선택된 상품을 장바구니(carts) 담기 
			for(i=0;i<carts.length;i++) {
				if(carts[i]==null) {
					carts[i]=products[Integer.parseInt(input)];
					break;
				}
			}			
			// 상품 목록 보여주기
			productList();
			break;	
		default:
			System.out.println("\n번호를 확인해 주세요\n");
			// 상품 목록 보여주기
			productList();
			break;
		}		
	}
	
	public void checkOut() {
		// 장바구니 출력하기
		System.out.println(title + " : 체크아웃");
		System.out.println("============================");
		
		int i=0;
		int sum = 0;
		for(Product cart:carts) {
			if(cart!=null) {
				System.out.printf("[%d] %s (%d)\n",i++,cart.getPname(),cart.getPrice());
				sum += cart.getPrice();
			}
		}
		
		System.out.println("============================");
		System.out.println("결제방법 : "+users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : "+sum);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String input = sc.nextLine();
		
		
		switch (input) {
		case "p":
			// input => p : 이전화면 => 상품 목록 보여주기
			productList();
			break;
		case "q":
			//q : 결제완료 되었습니다. 메세지 출력한 후 종료
			System.out.println("결제 완료 되었습니다.");
			break;
		default:
			checkOut();//다른 입력 : checkOut 호출
			break;
		}
		
	}
}





















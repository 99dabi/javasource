package ch7;

public class BonusPointAccountEx {
	public static void main(String[] args) {
		BonusPointAccount bonusePoint = new BonusPointAccount("555-333","홍길동",10000,100);
		bonusePoint.deposit(500);
		System.out.println(bonusePoint.getBalance()+","+bonusePoint.getBonusPoint());
	}
}

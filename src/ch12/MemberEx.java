package ch12;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("감자");
		Member member2 = new Member("감자");
		System.out.println(member1.equals(member2));
	}
}

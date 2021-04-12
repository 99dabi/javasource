package ch4;

public class ArrayEx9 {

	public static void main(String[] args) {
		// 1~45를 가지고 있는 카드 배열을 생성
		int card[]= new int[45];
		
		for(int i=0;i<card.length;i++) {
			card[i]=i+1;	
		}
		for(int no:card) {
			System.out.print("no."+no+" ");
		}
		System.out.println();
		//카드 섞기
		int temp=0;
		for(int i=0; i<card.length;i++) {
			//무작위 위치 추출
			int pos=(int)(Math.random()*45);
			temp=card[pos];
			card[pos]=card[i];
			card[i]=temp;
		}
		for(int no:card) {
			System.out.print("no."+no+" ");
		}
	}

}

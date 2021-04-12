package ch2;

//논리연산자 &&(and), ||(or), ^(xor), !(not)
//&	 ,	|       하나짜리도 허용

//&& : and
//true && true =>true
//true && false =>false

//|| : or
//true || true =>true
//true || flases =>true

//^ : 두개가 서로 다름
//true ^ true =>flase
//true ^ flases =>true
//flase ^ flase => flase

//! : 반대로
public class LogicalOperEx1 {
public static void main(String[] args) {
int charCode ='A';

if((charCode>=65) && (charCode<=90)){
System.out.println("대문자");
}
if(!(charCode<48) && !(charCode>57)) {
System.out.println("0~9숫자");
}
int value=6;
if((value%2==0) || (value%3==0)) {
System.out.println("2혹은 3의 배수");
}

}
}


import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("500 이하의 자연수를 입력하세요.");
		int sum = 0;
		int a = s.nextInt();
		for(int i=1;i<=a;i++){
			if(i%3==0){
				if(i%2!=0){
					System.out.println(i);
					sum += i;
					
				}
			}
		}
		System.out.println("1~"+20+"까지 3의 배수이면서 홀수인 수의 합은 "+sum+"입니다.");
	}
}

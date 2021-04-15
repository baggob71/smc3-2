import java.util.Scanner;
import java.util.Random;
public class number {

	public static void main(String[] args) {
		
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
		Scanner s = new Scanner(System.in); //스캐너
		int num = s.nextInt(); 
		int a,b = 0; //변수 생성
		
		Random random = new Random();
		for (int i=0;i<=9;i++) {
			a = random.nextInt(50)+1; //랜덤함수
			System.out.print(a+" "); //랜덤숫자 생성
			if (a==num) {
				b=1;
			}
		}
		
		if(b==1){
			System.out.println("\n당첨! 일치하는 숫자가 있습니다."); //결과 출력
		}
		else {
			System.out.println("\n아쉽군요! 일치하는 숫자가 없습니다."); //결과 출력
		}
		

	}
}
	

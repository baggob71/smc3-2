import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
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
		System.out.println("1~"+20+"���� 3�� ����̸鼭 Ȧ���� ���� ���� "+sum+"�Դϴ�.");
	}
}

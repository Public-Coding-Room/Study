package STUDYGP;

import java.io.InputStream;
import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
	
		System.out.println("정수 값 입력: ");
		
		
		Scanner scanner = new Scanner (System.in);
		int inputnumber = scanner.nextInt();
		// 키보드 입력값을받는 변수 선언 
		
		int num = inputnumber;
		// 반복문 안에서 사용하기 한 변수 선언 
		int count = 0;
		// 반복수를 확인하기 위한 변수 선언 (반복문 밖에서 0으로 포맷)
		
		while (num > 0 & num < 100) { // 입력 받은 값의 범위 설정 후 해당 범위값이 들어오면 반복문 시
			
			int i;
			
			i = num/10 + num%10; // 입력받은 값의 10의 자리와 1의 자리를 서로 더한 값을 temp 변수로 지정 
			num = num%10*10 + i%10; // 입력 받은 값의 1의 자리에 10을 곱한값과 temp 값의 자리를 서로 더한값을 num 에 대입
			count += 1; // 반복을 완료 후 count 를 1 추가
			
			
			if (num == inputnumber) { // 만약 앞선 반복문에서 만들어진 num 값이 입력 받은 값과 같아지면 반복문 탈
				break;
			}
			
		}
		System.out.println("입력값은 : " + num);
		System.out.println("반복수는 : " + count);
	
	}
}

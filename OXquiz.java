package STUDYGP;

import java.util.*;

public class OXquiz {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner (System.in);
				
				int n = sc.nextInt(); // 케이스 수
				
				// 반복문 안에서는 입력받은 케이스 수 (n) 개의 문자열을 입력 받아야 하고, 입력 받은 케이스의 각각 총점을 구해야한다.
				for (int i = 0; i<n; i++) {
					int cnt = 0; // 추후에 연속된 O 의 갯수를 세기위한 변수
					int sum = 0; // 추후에 연속된 O 가 나올 때마다, 1 씩 증가하게 될 변수
					
					String m = sc.next(); // 입력받은 케이스 수 만큼 문자열 입력받기
					m = m.toLowerCase(); // 입력받은 케이스를 전부 소문자로 변환 시
					
					
					for (int j = 0; j<m.length(); j++) { // 입력받은 문자열의 j번 째  인덱스 값 추출
						if (m.charAt(j) == 'o') { // 만약 문자열의 j 번째 문자가 'o'라면,
							cnt ++;  // j번째 인덱스 값이 'o' 일 때 cnt 에 +1;
							sum += cnt; //  j번째 인덱스 값이 'o' 일 때 sum 에 cnt 를 더하기 
							
						} else {
							cnt = 0;
							
						}

					}
			System.out.println(sum);
		}
				
	}
}

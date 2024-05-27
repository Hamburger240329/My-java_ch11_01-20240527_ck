package com.gam1142.exer01;

public class SystemTimeTest {
	public static void main(String[] args) {
		
		long a = System.nanoTime();  // 현재시간을 나누단위 1/1000000000 초 - 10억 - 10^9
		long b = System.currentTimeMillis();  // 현재시간을 1/1000초
		
//		System.out.println(a);
//		System.out.println(b);

		long t1 = System.currentTimeMillis();  // start time
		
		int sum = 0;
		for(int i=1;i<=100000000;i++) { // 1 ~ 100000000 까지의 합 - 1000만
			sum = sum + i;
			
		}
		
		long t2 = System.currentTimeMillis();  // end time
				
		System.out.print(t2 - t1); // 1 ~ 10000000 까지의 합을 구하는데 걸린 시간

	}
}

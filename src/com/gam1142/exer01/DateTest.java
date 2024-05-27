package com.gam1142.exer01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		
		String strNow1 = now.toString();
		
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM일 dd일 mm분 ss초");
		String strNow2 = sdf.format(now);
		
		System.out.println(strNow2);
		
		// Calendar now2 = new Calendar(); // 추상클래스이므로 인스턴스 생성 불가 -> 에러 발생 - new 연산자 사용불가
		Calendar now2 = Calendar.getInstance(); // 인스턴스 생성
				
		int year = now2.get(Calendar.YEAR);
		System.out.println(year);
//		int momth = now2.get(Calendar.MONTH);
		int momth = now2.get(Calendar.MONTH)+1;
		System.out.println(momth);
		int day = now2.get(Calendar.DAY_OF_MONTH); 
		System.out.println(day);
		
		int week = now2.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		int ampm = now2.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		
	}

}

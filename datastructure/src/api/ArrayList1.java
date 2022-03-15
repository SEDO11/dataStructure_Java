package api;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10); //추가
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		
		numbers.add(1, 50); // 1번 인덱스에 값 50 저장
		System.out.println(numbers);
		
		numbers.remove(2); //인덱스를 통해 해당 위치의 값 제거
		System.out.println(numbers);
		
		int resultGet = numbers.get(3); //인덱스를 통해 해당 위치의 값 가져오기
		System.out.println(resultGet); 
		
		int resultSize = numbers.size(); // 현재 리스트의 크기를 구함
		System.out.println(resultSize); 
		System.out.println();
		
		Iterator<Integer> it = numbers.iterator(); // Iterator = 인터페이스이다., 인터페이스의 객체를 it 변수에 저장
		while(it.hasNext()) { //hasNext = 가져올 다음 값이 있는지 없는지 확인하는 메소드
			int value = (int) it.next(); // 변수에 값 저장
			if(value == 30) { // 가져온 값이 30일 경우 해당 엘리멘트 제거
				it.remove();
			}
			System.out.println(value); 
		}
		System.out.println();
		
		for(int value: numbers) { // 순차적으로 value에 저장
			System.out.println(value);
		}
	}
}

package list.linkedlist.Test;

public class Main {

	public static void main(String[] args) {
		Arrays numbers = new Arrays(); // 클래스 객체 선언, 인스턴스화
		
		// 맨 마지막에 값을 추가
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		//원하는 index 위치에 값 추가
		numbers.add(1, 15);
		
		//맨 처음 index 위치에 값 추가
		numbers.addFirst(5);
		numbers.print(); // 출력
		
		// 값 삭제
		System.out.println("삭제된 Object 값: " + numbers.remove(1)); // 원하는 위치의 index 값 삭제
		System.out.println("삭제된 Object 값: " + numbers.removeFirst()); //맨 처음 index 값 삭제
		System.out.println("삭제된 Object 값: " + numbers.removeLast()); // 맨 마지막 index 값 삭제
		numbers.print(); // 출력
		
		// 원하는 index 값 가져오기
		int num = 1; // index 1의 값 가져오기
		System.out.println("인덱스 "+num+"의 값: " + numbers.get(num));
		
		System.out.println("Object의 크기: " + numbers.size());
		
		int num2 = 20;
		System.out.println(num2 + ": " + numbers.indexOf(num2));
	}

}

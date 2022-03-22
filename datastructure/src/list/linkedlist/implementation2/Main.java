package list.linkedlist.implementation2;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10); // 0번째 배열에 저장
		numbers.addLast(20); // 1번째에 저장
		numbers.addLast(30); // 2번째에 저장
		numbers.addLast(40); // 3번째에 저장
		numbers.addLast(20); // 4번째에 저장
		System.out.println(numbers);
		
//		numbers.addFirst(5); // 첫번째 배열 값에 해당 숫자를 저장하고 원래 있던 값들을 한 칸씩 뒤로 이동
//		numbers.add(1, 15); // 원하는 인덱스에 값 저장하고 원래 있던 값들을 한 칸씩 뒤로 이동
//		System.out.println(numbers);
		
		
//		System.out.println("삭제된 값: "+ numbers.remove(1)); // 해당 위치의 인덱스 값 제거하고 뒤에 있는 값들을 앞으로 이동
//		System.out.println(numbers.removeFirst()); // 맨 첫번째 배열 값 제거
//		System.out.println(numbers.removeLast()); // 맨 마지막 배열 값 제거
//		System.out.println(numbers);
		
//		System.out.println(numbers.get(0)); // 0번째 인덱스 가져오기
//		System.out.println(numbers.get(1)); // 1번째 인덱스 가져오기
//		System.out.println(numbers.get(2)); // 2번째 인덱스 가져오기
//		System.out.println(numbers.get(3)); // 3번째 인덱스 가져오기
		
		System.out.println(numbers.sizeOf()); // 현재 배열의 값의 개수 가져와 출력
		
		System.out.println(numbers.indexOf(0)); // 배열안에 해당 값이 있으면 몇 번째 인덱스에 있는지 출력
		
	}

}

package list.linkedlist.implementation2;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10); // 0번째 배열에 저장
		numbers.addLast(20); // 1번째에 저장
		numbers.addLast(30); // 2번째에 저장
		numbers.addLast(40); // 3번째에 저장
//		System.out.println(numbers);
		
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
		
//		System.out.println(numbers.size()); // 현재 배열의 값의 개수 가져와 출력
		
//		System.out.println(numbers.indexOf(0)); // 배열안에 해당 값이 있으면 몇 번째 인덱스에 있는지 출력
		
//		for(int i=0; i<numbers.sizeOf(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
		
		//iterator
		// 위의 for문 보다 이렇게 쓰는 걸 더 권장 한다.
		// ArrayList.ListIterator는 ArrayList 클래스 안에 있는 ListIterator 클래스
		// ListIterator는 데이터 타입, listIterator()는 메소드
		ArrayList.ListIterator li = numbers.listIterator();
		
		// next, hasNext
		// ASC 방식으로 출력, 오름차순
		System.out.println("next: 리스트 값 오름차순 출력");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		
		// previous, hasPrevious
		// DESC 방식으로 출력, 내림차순
		System.out.println("Previous: 리스트 값 내림차순 출력");
		while(li.hasPrevious()) {
			System.out.println(li.Previous());
		}
		System.out.println();
		
		// add, remove랑 같이 쓸 경우 실행 안됨
		System.out.println("add: 해당 값이 나올 때 그 다음위치에 값 추가");
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.add(35);
			}
		}
		System.out.println(numbers);
		System.out.println();
		
		// remove
		System.out.println("remove: 해당 값이 나올 때 값 제거");
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.remove();
			}
		}
		System.out.println(numbers);
		System.out.println();
	}

}

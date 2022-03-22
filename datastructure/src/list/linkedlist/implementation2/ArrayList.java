package list.linkedlist.implementation2;

public class ArrayList {
	private int size = 0; // 몇 개의 데이터가 ArrayList에 들어 있는가
	private Object[] elementData = new Object[100]; //100개의 고정된 크기를 가짐
	
	public void addLast(Object elementData) { // 배열에 값 추가
		this.elementData[this.size] = elementData;
		this.size++;
	}
	
	public void add(int index, Object elementData) { //원하는 인덱스 위치에 값 추가
		for(int i= this.size; i >index; i--) {
			this.elementData[i] = this.elementData[i-1];
		}
		this.elementData[index] = elementData;
		this.size++;
	}
	
	public void addFirst(Object elementData) { // 0번째(맨 처음) 인덱스에 값 저장
		add(0, elementData); //add 메소드 참조
	}
	
	public Object remove(int index) { // 해당 인덱스 위치의 값을 제거하고 뒤의 값들을 앞으로 이동
		Object removed = this.elementData[index];
		for(int i= index+1; i <=this.size-1; i++) {
			this.elementData[i-1] = this.elementData[i];
		}
		this.size--;
		this.elementData[this.size] = null; //맨 마지막 값 null로 초기화
		return removed;
	}
	
	public String toString() { // 배열 전체 인덱스, 값 출력
		String result = "[";
		for(int i=0; i<this.size; i++) {
			result += this.elementData[i];
			if(i < this.size-1) { // 끝자리가 아니면 , 를 붙힌다
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
	
	public Object removeFirst() { // 첫 번째 값 제거
		return remove(0); // remove 메소드 참조
	}
	
	public Object removeLast() { // 마지막 값 제거
		return remove(size-1); // remove 메소드 참조
	}
	
	public Object get(int index) { //원하는 위치의 배열 값 내보내기
		return this.elementData[index];
	}
	
	public int sizeOf() { // 현재 배열의 값 개수 보내기
		return this.size;
	}
	
	public String indexOf(Object value) { // 입력된 값이 어느 인덱스 위치에 있는지 확인하는 메소드
		String result = "";
		for(int i= 0; i < this.size; i++) {
			if(value.equals(this.elementData[i])) { //배열은 참조 타입 이므로 equals로 같은지 다른지 확인
				result += "index: " + i +"\t";
			}
		}
		if(result.equals("")) {
			result = "해당값은 존재하지 않습니다.";
		}
		return result;
	}
	
//	여기까지가 16강
	
	
}

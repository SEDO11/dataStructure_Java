package list.linkedlist.Test;

public class Arrays {
	private int size = 0;
	private Object[] elementData = new Object[100];

	// 끝에다가 데이터 추가
	public void addLast(Object elementData) {
		this.elementData[size] = elementData;
		this.size++;
	}

	// 원하는 index위치에 값 추가
	public void add(int index, Object elementData) {
		for (int i = this.size; i > index; i--) {
			this.elementData[i] = this.elementData[i-1];
		}
		this.elementData[index] = elementData;
		this.size++;
	}
	
	// 처음 index에 값 추가
	public void addFirst(Object elementData) {
		add(0, elementData); // add 메소드 상속
	}
	
	//삭제
	public Object remove(int index) {
		Object removed = this.elementData[index];
		for (int i = index+1; i < this.size; i++) {
			this.elementData[i-1] = this.elementData[i];
		}
		this.size--;
		this.elementData[this.size] = null;
		return removed;
	}
	
	// 맨 앞의 오브젝트 값 제거
	public Object removeFirst() {
		return remove(0);
	}
	
	// 맨 뒤의 오브젝트 값 제거
	public Object removeLast() {
		return remove(this.size-1);
	}
	
	// 해당 index의 값 가져오기
	public Object get(int index) {
		return this.elementData[index];
	}
	
	// Object의 크기 가져오기
	public int size() {
		return this.size;
	}
	
	// 입력된 값이 몇 번째 index 인지 구하기
	public String indexOf(Object elementData) {
		String result = "";
		for(int i=0; i<this.size; i++) { // Object 내에 입력된 값이 존재 할 경우
			if(elementData.equals(this.elementData[i])) {
				result += i + "번째 index에 있습니다.";
			}
		}
		if(result.equals("")) { // 값이 존재 하지 않을 경우
			result = "해당 값은 존재 하지 않습니다.";
		}
		return result;
	}

	// 출력
	public void print() {
		String str = "[";
		for (int i = 0; i < this.size; i++) {
			str += this.elementData[i];
			if(i < this.size-1) {
				str += ", ";
			}
			
		}
		str += "]";
		System.out.println(str);
	}
}

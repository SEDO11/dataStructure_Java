package list.linkedlist.Test;

public class Arrays {
	private int size = 0;
	private Object[] elementData = new Object[100];

	// �����ٰ� ������ �߰�
	public void addLast(Object elementData) {
		this.elementData[size] = elementData;
		this.size++;
	}

	// ���ϴ� index��ġ�� �� �߰�
	public void add(int index, Object elementData) {
		for (int i = this.size; i > index; i--) {
			this.elementData[i] = this.elementData[i-1];
		}
		this.elementData[index] = elementData;
		this.size++;
	}
	
	// ó�� index�� �� �߰�
	public void addFirst(Object elementData) {
		add(0, elementData); // add �޼ҵ� ���
	}
	
	//����
	public Object remove(int index) {
		Object removed = this.elementData[index];
		for (int i = index+1; i < this.size; i++) {
			this.elementData[i-1] = this.elementData[i];
		}
		this.size--;
		this.elementData[this.size] = null;
		return removed;
	}
	
	// �� ���� ������Ʈ �� ����
	public Object removeFirst() {
		return remove(0);
	}
	
	// �� ���� ������Ʈ �� ����
	public Object removeLast() {
		return remove(this.size-1);
	}
	
	// �ش� index�� �� ��������
	public Object get(int index) {
		return this.elementData[index];
	}
	
	// Object�� ũ�� ��������
	public int size() {
		return this.size;
	}
	
	// �Էµ� ���� �� ��° index ���� ���ϱ�
	public String indexOf(Object elementData) {
		String result = "";
		for(int i=0; i<this.size; i++) { // Object ���� �Էµ� ���� ���� �� ���
			if(elementData.equals(this.elementData[i])) {
				result += i + "��° index�� �ֽ��ϴ�.";
			}
		}
		if(result.equals("")) { // ���� ���� ���� ���� ���
			result = "�ش� ���� ���� ���� �ʽ��ϴ�.";
		}
		return result;
	}

	// ���
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

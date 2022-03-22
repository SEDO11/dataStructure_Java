package list.linkedlist.implementation2;

public class ArrayList {
	private int size = 0; // �� ���� �����Ͱ� ArrayList�� ��� �ִ°�
	private Object[] elementData = new Object[100]; //100���� ������ ũ�⸦ ����
	
	public void addLast(Object elementData) { // �迭�� �� �߰�
		this.elementData[this.size] = elementData;
		this.size++;
	}
	
	public void add(int index, Object elementData) { //���ϴ� �ε��� ��ġ�� �� �߰�
		for(int i= this.size; i >index; i--) {
			this.elementData[i] = this.elementData[i-1];
		}
		this.elementData[index] = elementData;
		this.size++;
	}
	
	public void addFirst(Object elementData) { // 0��°(�� ó��) �ε����� �� ����
		add(0, elementData); //add �޼ҵ� ����
	}
	
	public Object remove(int index) { // �ش� �ε��� ��ġ�� ���� �����ϰ� ���� ������ ������ �̵�
		Object removed = this.elementData[index];
		for(int i= index+1; i <=this.size-1; i++) {
			this.elementData[i-1] = this.elementData[i];
		}
		this.size--;
		this.elementData[this.size] = null; //�� ������ �� null�� �ʱ�ȭ
		return removed;
	}
	
	public String toString() { // �迭 ��ü �ε���, �� ���
		String result = "[";
		for(int i=0; i<this.size; i++) {
			result += this.elementData[i];
			if(i < this.size-1) { // ���ڸ��� �ƴϸ� , �� ������
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
	
	public Object removeFirst() { // ù ��° �� ����
		return remove(0); // remove �޼ҵ� ����
	}
	
	public Object removeLast() { // ������ �� ����
		return remove(size-1); // remove �޼ҵ� ����
	}
	
	public Object get(int index) { //���ϴ� ��ġ�� �迭 �� ��������
		return this.elementData[index];
	}
	
	public int sizeOf() { // ���� �迭�� �� ���� ������
		return this.size;
	}
	
	public String indexOf(Object value) { // �Էµ� ���� ��� �ε��� ��ġ�� �ִ��� Ȯ���ϴ� �޼ҵ�
		String result = "";
		for(int i= 0; i < this.size; i++) {
			if(value.equals(this.elementData[i])) { //�迭�� ���� Ÿ�� �̹Ƿ� equals�� ������ �ٸ��� Ȯ��
				result += "index: " + i +"\t";
			}
		}
		if(result.equals("")) {
			result = "�ش簪�� �������� �ʽ��ϴ�.";
		}
		return result;
	}
	
//	��������� 16��
	
	
}

package list.linkedlist.Test;

public class Main {

	public static void main(String[] args) {
		Arrays numbers = new Arrays(); // Ŭ���� ��ü ����, �ν��Ͻ�ȭ
		
		// �� �������� ���� �߰�
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		//���ϴ� index ��ġ�� �� �߰�
		numbers.add(1, 15);
		
		//�� ó�� index ��ġ�� �� �߰�
		numbers.addFirst(5);
		numbers.print(); // ���
		
		// �� ����
		System.out.println("������ Object ��: " + numbers.remove(1)); // ���ϴ� ��ġ�� index �� ����
		System.out.println("������ Object ��: " + numbers.removeFirst()); //�� ó�� index �� ����
		System.out.println("������ Object ��: " + numbers.removeLast()); // �� ������ index �� ����
		numbers.print(); // ���
		
		// ���ϴ� index �� ��������
		int num = 1; // index 1�� �� ��������
		System.out.println("�ε��� "+num+"�� ��: " + numbers.get(num));
		
		System.out.println("Object�� ũ��: " + numbers.size());
		
		int num2 = 20;
		System.out.println(num2 + ": " + numbers.indexOf(num2));
	}

}

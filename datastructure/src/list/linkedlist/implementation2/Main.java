package list.linkedlist.implementation2;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10); // 0��° �迭�� ����
		numbers.addLast(20); // 1��°�� ����
		numbers.addLast(30); // 2��°�� ����
		numbers.addLast(40); // 3��°�� ����
		numbers.addLast(20); // 4��°�� ����
		System.out.println(numbers);
		
//		numbers.addFirst(5); // ù��° �迭 ���� �ش� ���ڸ� �����ϰ� ���� �ִ� ������ �� ĭ�� �ڷ� �̵�
//		numbers.add(1, 15); // ���ϴ� �ε����� �� �����ϰ� ���� �ִ� ������ �� ĭ�� �ڷ� �̵�
//		System.out.println(numbers);
		
		
//		System.out.println("������ ��: "+ numbers.remove(1)); // �ش� ��ġ�� �ε��� �� �����ϰ� �ڿ� �ִ� ������ ������ �̵�
//		System.out.println(numbers.removeFirst()); // �� ù��° �迭 �� ����
//		System.out.println(numbers.removeLast()); // �� ������ �迭 �� ����
//		System.out.println(numbers);
		
//		System.out.println(numbers.get(0)); // 0��° �ε��� ��������
//		System.out.println(numbers.get(1)); // 1��° �ε��� ��������
//		System.out.println(numbers.get(2)); // 2��° �ε��� ��������
//		System.out.println(numbers.get(3)); // 3��° �ε��� ��������
		
		System.out.println(numbers.sizeOf()); // ���� �迭�� ���� ���� ������ ���
		
		System.out.println(numbers.indexOf(0)); // �迭�ȿ� �ش� ���� ������ �� ��° �ε����� �ִ��� ���
		
	}

}
package api;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10); //�߰�
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		
		numbers.add(1, 50); // 1�� �ε����� �� 50 ����
		System.out.println(numbers);
		
		numbers.remove(2); //�ε����� ���� �ش� ��ġ�� �� ����
		System.out.println(numbers);
		
		int resultGet = numbers.get(3); //�ε����� ���� �ش� ��ġ�� �� ��������
		System.out.println(resultGet); 
		
		int resultSize = numbers.size(); // ���� ����Ʈ�� ũ�⸦ ����
		System.out.println(resultSize); 
		System.out.println();
		
		Iterator<Integer> it = numbers.iterator(); // Iterator = �������̽��̴�., �������̽��� ��ü�� it ������ ����
		while(it.hasNext()) { //hasNext = ������ ���� ���� �ִ��� ������ Ȯ���ϴ� �޼ҵ�
			int value = (int) it.next(); // ������ �� ����
			if(value == 30) { // ������ ���� 30�� ��� �ش� ������Ʈ ����
				it.remove();
			}
			System.out.println(value); 
		}
		System.out.println();
		
		for(int value: numbers) { // ���������� value�� ����
			System.out.println(value);
		}
	}
}

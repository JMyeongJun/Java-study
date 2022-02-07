package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// ����(buffer) : �����͸� ��Ƽ� �����ϴ� �ӽ� ����
// - ����� �ӵ��� �����ϴ� ȿ���� ���� ���ؼ� ����Ѵ�

// ex) A -> B�� ���� 10���� �ű��
// 1. ����x -> 1���� 10�� �ű��
// 2. ����o -> 10���� �ٱ���(= buffer)�� ��Ƽ� 1���� �ű��

public class Ex03 {
	public static void main(String[] args) {
		
		try {
			// 1. ��� ��Ʈ��(= ���)�� ����
			FileWriter fw = new FileWriter("����.txt");
		
			// 2. ���۸� �����Ѵ�
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("����� ���۸� Ȱ���� �����\n");
			bw.write("���� ��� ���̴� ���� ������\n");
			bw.write("�뷮�� ū ����¿� ū ����� �ӵ� ���̸� ���δ�~");
			
			bw.close();
			
			System.out.println("����� �Ϸ�~");
		
		} catch(IOException e) {
			System.err.println("���� : " + e.getMessage());
			
		}
	}
}

package _interface;

// �������̽��� ��� Ư¡)
// 1. �ʵ�� �ڵ����� public static final �Ӽ��� ������
// 2. �޼���� �ڵ����� public abstract �Ӽ��� �����ȴ�

// ��, ��� ����� �߻�ȭ �Ǿ����� -> �����Ȱ� �ϳ��� ����

@FunctionalInterface
public interface USB {
	String type = "CŸ��";
	
	// interface�� �޼��尡 �ϳ��� �ִ� ����
	// '�Լ��� �������̽�'��� �Ѵ�
	void run();
}

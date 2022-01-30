package object;

import java.util.Scanner;

class Account {
	private String id, pw, nick;
	
	Account(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	
	Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	Account login(Account[] db) {	// this = user
		for (Account acc : db) {
			if (acc.equals(this)) {
				return acc;
			}
		}
		
		return null;
	}
	
	String getNick() {
		return nick;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}
	
}

public class Quiz2 {
	
	
	public static void main(String[] args) {
		Account[] db = new Account[] {
				new Account("test1", "1", "�׽�Ʈ1"),
				new Account("itbank", "it", "�ƹ�"),
				new Account("root", "qwe@123", "������")
		};
		
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		// �α��� ���μ����� �����Ѵ�
		// 1. ����ڿ��� id, pw�� �Է� �޴´�
		// 2. ���� ������ Account ��ü�� �����Ѵ�
		
		System.out.print("ID : ");
		id = sc.next();
		
		System.out.print("PW : ");
		pw = sc.next();
		
		Account user = new Account(id, pw);
		
		// 3. �Է� ���� ������ db �迭�� ��ġ�ϴ� ������ ������
		// �α��� ���� -> '�г���'�� ȯ���մϴ� �� ���
		// �α��� ���� -> �ش� ������ �������� �ʽ��ϴ�
		
		user = user.login(db);
		
		if (user != null) {
			// �α��� ����
			System.out.println(user.getNick() + "�� ȯ���մϴ�");
		}
		else {
			// �α��� ����
			System.out.println("��ġ�ϴ� ������ �������� �ʽ��ϴ�");
		}
		
		sc.close();
	}
}

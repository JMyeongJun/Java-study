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
				new Account("test1", "1", "테스트1"),
				new Account("itbank", "it", "아뱅"),
				new Account("root", "qwe@123", "관리자")
		};
		
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		// 로그인 프로세스를 구현한다
		// 1. 사용자에게 id, pw를 입력 받는다
		// 2. 받은 정보로 Account 객체를 생성한다
		
		System.out.print("ID : ");
		id = sc.next();
		
		System.out.print("PW : ");
		pw = sc.next();
		
		Account user = new Account(id, pw);
		
		// 3. 입력 받은 정보와 db 배열에 일치하는 계정이 있으면
		// 로그인 성공 -> '닉네임'님 환영합니다 를 출력
		// 로그인 실패 -> 해당 계정은 존재하지 않습니다
		
		user = user.login(db);
		
		if (user != null) {
			// 로그인 성공
			System.out.println(user.getNick() + "님 환영합니다");
		}
		else {
			// 로그인 실패
			System.out.println("일치하는 계정이 존재하지 않습니다");
		}
		
		sc.close();
	}
}

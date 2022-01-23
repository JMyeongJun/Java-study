package array;

class Airplain {
	// ½Â°´ÀÇ ÁÂ¼® -> »ç¶÷ÀÇ ¹è¿­
	Person[] sits = new Person[5];
	
	void takeOn(Person p) {
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] == null) {
				sits[i] = p;
				
				System.out.println(p.getName() + "(ÀÌ)°¡ Å¾½Â~");
				return;
			}
		}
		
		System.out.println("ºó ÁÂ¼®ÀÌ ¾ø½À´Ï´Ù!!!");
	}
	
	void list() {
		System.out.println("\nÁÂ¼® ÇöÈ²)");
		
		for (int i = 0; i < sits.length; i++) {
			System.out.print(i + 1 + "ÁÂ¼® : ");
			
			if (sits[i] != null) {
				sits[i].showInfo();
			}
			else {
				System.out.println("-- ºóÁÂ¼® -- ");
			}
		}
	}
}

public class Quiz {
	public static void main(String[] args) {
		Person p1 = new Person("È«±æµ¿", 22);
		Person p2 = new Person("±è±æµ¿", 27);
		Person p3 = new Person("¹Ú±æµ¿", 15);
		Person p4 = new Person("°í±æµ¿", 37);
		
		Airplain air = new Airplain();
		
		air.takeOn(p1);		// ºñÇà±â¿¡ »ç¶÷ÀÌ Å¾½ÂÇÏ´Â ¸Þ¼­µå
		air.takeOn(p2);		// ÁÂ¼®(= ¹è¿­) ³²´Â Ä­(= null)ÀÌ ÀÖÀ¸¸é
		air.takeOn(p3);		// ÇØ´ç ½Â°´À» Âø¼®(= ÀúÀå) ½ÃÅ²´Ù
		air.takeOn(p4);
							// ´Ü, ÁÂ¼®ÀÌ ¾øÀÌ¸é Å¾½Â ºÒ°¡´É
		
		air.list();			// Å¾½ÂÁßÀÎ ½Â°´À» ¸ðµÎ Ãâ·Â
		
		
		
		
	}
}

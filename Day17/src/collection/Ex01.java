package collection;

import java.util.ArrayList;

// 컬렉션 : 모음, 묶음
// 프레임 워크 : 정형화된 도구. 빠른 개발 위한 틀이 잡힌 도구들을 의미

// 컬렉션 프레임 워크 : 자바에서 제공하는 자료구조 및 알고리즘을 의미

// 종류)
// 1. List	: 순서o, 중복o
// 2. Set	: 순서x, 중복x
// 3. Map	: key와 value의 한쌍의 구조 (= key는 중복x, value는 중복o)

public class Ex01 {
	public static void main(String[] args) {
		// List는 interface로 구현되어 있지 않다
		
		// 이를 실제 구현한 대표적인 클래스는
		// 1. ArrayList
		// 2. LinkedList
		// 3. Vector
		
		// Array VS ArrayList
		// 1. Array : 사용시 크기를 미리 지정하고 사용해야 한다, 기능이 없다 -> 불편
		// 2. ArrayList : 그 배열에 기능을 추가해서 만든 형태
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);		// add(데이터) : 리스트 가장 뒤에 데이터를 추가
		list.add(30);
		list.add(20);
		
		System.out.println("list = " + list);
		System.out.println("list의 크기 : " + list.size() + "\n");
		
		System.out.println("list[0] = " + list.get(0));
		// ArrayList는 클래스 -> 따라서 모든 기능은 메서드로 작성되어 있음을 주의 한다
		
		list.add(1, 15);	// add(index, 데이터) : 지정 위치에 데이터를 추가. 기존 데이터는 뒤로 밀려남
		System.out.println("list = " + list);
		
		list.set(2, 40);	// set(index, 데이터) : 지정 위치를 덮어씀
		System.out.println("list = " + list);
		
		list.sort(null);	// sort(Comparator) : 지정 비교 기준으로 정렬. null을 주면 Comparable로 비교
		System.out.println("list = " + list);
		
		int n = list.remove(2);		// remove(index) : 지정 위치를 제거
		System.out.println("list = " + list);
		System.out.println("제거한 값  = " + n + "\n");
		
		list.clear();		// clear() : 요소를 모두 제거
		System.out.println("list = " + list);
		
		
	}
}

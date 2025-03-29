package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {

	public static void main(String[] args) {
			
		LinkedList<Student> list = new LinkedList<Student>();
		
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = sc.nextLine();
		
		Student temp = null;
		for(Student st : list) {
			if(st.getName().equals(searchName)) {
				temp = st;
				break;
			}
		}
		
		if(temp != null) {
			list.remove(list.indexOf(temp));
			System.out.println("[검색되었습니다]\n[삭제후 정보출력]");
			for(Student st : list) {
				System.out.println(st);
			}
		} else {
			System.out.println("검색결과가 없습니다.");
		}
		
		sc.close();
		
	}

}

//1. 학생정보들을 저장하고, 학생이름으로
// 검색했을때 학번을 출력하는 프로그램 작성.
//
//    Student 클래스 생성
//
//String name, no를 가짐 (이름과 학번)
//
//학생들을 ArrayList에 저장1
//
//검색을 하겠느냐 y
//종료하고싶으면 n
//
//학생이름이있는경우 그학생의 학번을 저장
//학생이름이 없으면, 없는 학생이름이라고 출력
//
//태그
// while, flag, ArrayList, foreach

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Student {
	
	private String no;
	private String name;
	
	Student(String no,String name){
		this.no=no;
		this.name=name;
	}
	
	public String name() {
		return name;
	}
	
	public String no() {
		return no;
	}
	
	public void setNo(String a) {
		no = a;
	}


	
}



public class algorithm_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Student> l =  new ArrayList();
		List history = new ArrayList();
		
		while(true) { 
			System.out.println("1. 학생 입력\n2. 학생 검색");
			String input = sc.nextLine();
			
			switch(input) {
			case "1" :
				System.out.println("학생의 이름과 학번을 입력하시오.\n예시: 방성일,970424");
				String[] inputinfo = sc.nextLine().split(",");
				Student s = new Student(inputinfo[1],inputinfo[0]);
				l.add(s);
				
				continue;
			case "2" :
				System.out.println("학생의 이름을 검색하세요.");
				String inputname = sc.nextLine();
				
				for (Student i : l) {
					if (inputname.equals(i.name())) {
						if(i.no() != null) {
						System.out.println("학생의 학번은" + i.no());
						history.add(i.no());
						continue;
						}else {
							System.out.println("학생의 학번을 입력하세요");
							String noinput = sc.nextLine();
							i.setNo(noinput);
							continue;
						}
					}
				}
					System.out.println("존재하지 않는 학생입니다");
					continue;
				}
				
			}
		}

	}



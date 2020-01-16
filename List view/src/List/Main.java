package List;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int type;
		
		System.out.println("입력할 명단을 고르시오. 전화번호정보(1) 학생정보(2) 사원정보(3) 종료(0)");
		type = scan.nextInt();
		
		if(type != 0) {
		
			int inputNumber;
			System.out.print(type + "입력 수 : ");
			inputNumber = scan.nextInt();
			System.out.println("\n" + type + " 입력\n");
			
			if(type == 1) {
				
				Phone_info[] pi = new Phone_info[inputNumber];
				
				for(int i = 0; i < pi.length; i++) {
					pi[i] = new Phone_info();
					System.out.println("Num " + (i + 1) + " : 이름, 전화번호, 주소");
					pi[i].insert(scan.next(), scan.next(), scan.next());
				}
				
				for(int i = 0; i < pi.length; i++) {
					pi[i].print();
				}
			}
			
			else if(type == 2) {
				
				Student_info[] si = new Student_info[inputNumber];
				
				for(int i = 0; i < si.length; i++) {
					si[i] = new Student_info();
					System.out.println("Num " + (i + 1) + " : 이름, 전화번호, 주소, 학번");
					si[i].insert(scan.next(), scan.next(), scan.next(), scan.nextInt());
				}
				
				for(int i = 0; i < si.length; i++) {
					si[i].print();
				}
			}
			
			else if(type == 3) {
				
				Worker_info[] wi = new Worker_info[inputNumber];
				
				for(int i = 0; i < wi.length; i++) {
					wi[i] = new Worker_info();
					System.out.println("Num " + (i + 1) + " : 이름, 전화번호, 주소, 부서, 직책");
					wi[i].insert(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
				}
				
				for(int i = 0; i < wi.length; i++) {
					wi[i].print();
				}
			}
			
			else {
				System.out.println("명단 타입을 잘못입력하셨습니다");
			}
		}
		
		else if(type == 0) {
			System.out.println("종료");
		}
	}
}

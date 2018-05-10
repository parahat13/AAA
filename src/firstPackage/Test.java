package firstPackage;

import java.util.Scanner;

public class Test {

//	public static void main(String[] args) {
//
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//
//		if (str1 == str2) {
//			System.out.println("== gives True");
//		} else {
//			System.out.println("== gives False");
//		}
//		
//		//===========================================
//		
//		//str2=str1;
//		if(str1.equals(str2)) {
//					System.out.println(" Equal Values");
//				}else {
//					System.out.println("Different  Values");
//				}
//
//
//	
//	}

	
	static int a = 0;
	int b = 5;

	public void foo() {
		while (b > 0) {
			b--;
			a++;
		}
	}

	public static void main(String[] args) {
		Test p1 = new Test();
		p1.foo();
		Test p2 = new Test();
		p2.foo();

		System.out.println(p1.a + " " + p2.a);
	}
}

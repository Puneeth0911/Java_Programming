package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program_1 {
	public static void main(String[] args) {
//		String s[]= {"hii", "hello", "Bye"};
////		System.out.println(s[0]);  //hii
//		System.out.print("[");
//		for(int i=0;i<s.length;i++) {
//			System.out.print(s[i]);
//			if(i!=s.length-1)
//				System.out.print(", ");
//		}
//		System.out.print("]");
////		Output: [hii, hello, Bye]
//		//System.out.println(s[5]);  //ArrayIndexOutOfBoundsException
//		System.out.println();
//		for(String str:s) {
//			System.out.print(str+", ");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(s));
//		
//		System.out.println("-------------------");
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println(Arrays.toString(a));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		Student s[]=new Student[size];
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter id, name, course, percentage: ");
			s[i]=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		}
		System.out.println(Arrays.toString(s));
		sc.close();
	}
}
class Student {
	int id;
	String name;
	String course;
	double percentage;
	public Student(int id, String name, String course, double percentage) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "id: "+id+", name: "+name+", course: "+course+", percentage: "+percentage;
	}
}


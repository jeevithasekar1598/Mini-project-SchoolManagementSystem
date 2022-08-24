package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Add Student data");
			new StudentAddData().addData();
			break;
		case 2:
			System.out.println("delete Student data");
			new StudentAddData().deleteData();
			break;
		case 3:
		
			new StudentAddData().exit();
			
		}		
		System.out.println("=========Teacher===========");
		Teacher t1=new Teacher(101,"Jeevi",60000);
		Teacher t2=new Teacher(102,"Bala",45000);
		Teacher t3=new Teacher(103,"Maha",19000);
		ArrayList<Teacher> list1=new ArrayList<Teacher>();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		for(Teacher t:list1)
		{
			System.out.println(t);
		}
		sc.close();		
	}
}

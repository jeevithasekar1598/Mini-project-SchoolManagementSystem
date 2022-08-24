package schoolmanagementsystem;

import java.util.ArrayList;

public class StudentAddData {

	public void addData()
	{
		System.out.println("=========Student===========");
		Student s1=new Student(101,"jani","CDM",150,8000);
		Student s2=new Student(102,"Jeevitha","Chennai",250,9000);
		Student s3=new Student(103,"Balajee","Bhuvanagiri",160,5000);
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Student s:list)
		{
			System.out.println(s);
		}			
	}
	public void deleteData()
	{
		Student s1=new Student(101,"jani","CDM",150,8000);
		ArrayList<Student> list=new ArrayList<Student>();
		System.out.println(list);
	}
	public void exit()
	{
		System.out.println("exit");
	}
}


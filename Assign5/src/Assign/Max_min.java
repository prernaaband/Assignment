package Assign;
import java.util.ArrayList;
import java.util.List;

public class Max_min {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1>data=new ArrayList<>();//Creating list of Student and adding the data.
		
		data.add(new Student1(1001,"Jack",22,65));
		data.add(new Student1(1002,"Lisa",19,96));
		data.add(new Student1(1003,"Rose",20,78));
		data.add(new Student1(1004,"Jennie",21,60));
		data.add(new Student1(1005,"Charlie",15,86));
		//add condition for result using stream() & print it
		
		Student1 s1=data.stream().max((m1,m2)->m1.getMarks()>m2.getMarks()?1:-1).get();    //For mini. Numbers.
		System.out.println("Maximum Marks:-"+s1.getName()+" "+s1.getMarks());
		
		Student1 s2=data.stream().min((m1,m2)->m1.getMarks()>m2.getMarks()?1:-1).get();    //For max Numbers.
		System.out.println("Minimum marks:-"+s2.getName()+" "+s2.getMarks());
		
			}

		}
		
		class Student1
		{
			
		private int id;
		private String name;
		private int age;
		private int marks;
		
		public int getId() {                 //Using Getter Setter Method.
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public Student1(int id, String name, int age, int marks) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.marks = marks;
		}
	}


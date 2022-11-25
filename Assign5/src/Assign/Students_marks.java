package Assign;
import java.util.ArrayList;
import java.util.List;

public class Students_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student>data=new ArrayList<>();//Creating list of Student and adding the data.

data.add(new Student(101,"Lisa",20,79));
data.add(new Student(102,"Rose",18,67));
data.add(new Student(103,"Jack",19,55));
data.add(new Student(104,"Jennie",21,73));
data.add(new Student(105,"James",20,45));
data.add(new Student(106,"John",22,56));
data.add(new Student(106,"Jisoo",20,66));

//Print marks.
System.out.println("Print all Students Marks");
data.stream().forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
//Add condition for result using stream() & print it.
System.out.println("Print Students marks whos marks between 60 to 80");
data.stream().filter(s->s.getMarks()<80 && s.getMarks()>60).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
	}

}

class Student
{
	
private int id;
private String name;
private int age;
private int marks;
//Using getter setter method here.
public int getId() {
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
//Declaring constructor with the fields.
public Student(int id, String name, int age, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.marks = marks;
}


}

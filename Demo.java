package oops;

class Pen {
	String color;
	String type;  //ball point or gel pen
	
	public void write() {
		System.out.println("Writing Something");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
	
}

class Student {
	String name;
	int age;
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	
	Student(){
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
//		Pen pen1 = new Pen();
//		pen1.color = "Blue";
//		pen1.type = "Ballpoint";
//		
//		Pen pen2 = new Pen();
//		pen2.color = "Black";
//		pen2.type = "Gel";
//		
//		pen1.printColor();
//		pen2.printColor();
		
		Student s1 = new Student();
		s1.name ="nakul";
		s1.age = 22;
		
		Student s2 = new Student(s1);
		
		
		s1.info();
	}

}
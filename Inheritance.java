class Box{
	int width,height,depth;
	Box(int width,int height,int depth){
		this.depth=depth;
		this.width=width;
		this.height=height;
		
	}
	public int volume() {
		return depth*height*width;
	}
}
class calculator{
	static int powint(int n1,int n2) {
		return (int)Math.pow(n1,n2);
	}
	static double powdou(double n1,double n2) {
		return Math.pow(n1, n2);
	}
}
 
class Animal{
	void eat() {
		System.out.println("eat");
	}
	void sleep() {
		System.out.println("sleep");
	}
}
class bird extends Animal{
	void fly() {
		System.out.println("fly");
	}
	
}
class person{
	String name;
	person(String name){
		this.name=name;
	}
	String getname() {
		return name;
	}
	void setname(String name) {
		this.name=name;
	}
	
}
class Employee extends person{
	Employee(String name) {
		super(name);
		
	}
	double salary;
	int year;
	String insuranceNumber;
}
class person1{
	String name;
	int dob;
	person1(String n,int dob){
		this.name=n;
		this.dob=dob;
	}
}
class Teacher extends person1{
	int sal;
	String sub;

	Teacher(String n, int dob,int sal,String sub) {
		super(n, dob);
		
	}
	
}
class Student extends person1{
	String clgName;
	int year;

	Student(String n, int dob,String clgName,int year) {
		super(n, dob);
		
	}
	
}





public class Inheritance {

	public static void main(String[] args) {
        Animal a=new Animal();
        bird b=new bird();
        b.eat();
        b.sleep();
        b.fly();
        a.eat();
        a.sleep();
        Employee e=new Employee("john");
        System.out.println("Name:"+e.getname());
        e.setname("jane");
        System.out.println("Name:"+e.getname());
        Box b1=new Box(3, 4, 2);
        System.out.println(b1.volume());
        calculator c1=new calculator();
        System.out.println(c1.powint(5,2));
        System.out.println(c1.powdou(5,2));


	}

}

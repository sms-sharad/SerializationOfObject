import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
private int id;
private String name;
private int age;

public Student(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}

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

public static void main(String[] args) throws IOException, ClassNotFoundException {
	Object obj=null;
	Student sharad=new Student(1, "Sharad", 23);
	Student jalindar=new Student(4, "jalindar", 34);
	Student prashant=new Student(1, "prashant", 33);
	
	
	FileOutputStream fout=new FileOutputStream("stud.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(sharad);
	out.writeObject(jalindar);
	out.writeObject(prashant);
	System.out.println("done.!");
			 
	
	FileInputStream fin=new FileInputStream("stud.txt");
	ObjectInputStream in=new ObjectInputStream(fin);  
	while((obj = in.readObject())!=null)
	{
		  Student stud=(Student) obj;
	   
		   System.out.println(stud.toString());
		   
		  /*System.out.println("ID:"+stud.getId());
		  System.out.println("Name:"+stud.getName());
		  System.out.println("Age:"+stud.getAge());
		  */
	}
}
}


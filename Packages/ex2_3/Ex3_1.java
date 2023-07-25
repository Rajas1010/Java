import java.util.*;
class Student{
	public String create(){
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the registration no.:");
	public int reg=inp.nextInt();
	System.out.println("Enter the name:");
	public String name=inp.next();
	System.out.println("Enter the branch:");
	public String dept=inp.next();
	return dept;
	}
}
class CSE extends Student{
	void cse(){
		create();
	int tot;
	System.out.println("Enter the marks for:");
	String sub[]={"Computer network","Data Structure","Testing"};
	int []a=new int[3];
	for(int i=0;i<3;i++){
		System.out.println(sub[i]);
		a[i]=inp.next();
		if(i==2)
			tot=a[i]+a[i-1]+a[i-2];
	}
	System.out.println("The register no. is "+reg+"The name is "+name+"The department is "+dept);
	for(int i=0;i<3;i++)
		System.out.println("Mark for "+sub[i]+"is "+a[i]);
	System.out.println("Total is :"+tot+"and the average is "+tot/3);
	}
}
class ECE extends Student{
	
	void ece(){
		int tot;
	System.out.println("Enter the marks for:");
	String sub[]={"Electronic Circuits","Circuit Analysis","Analog Communication"};
	int []a=new int[3];
	for(int i=0;i<3;i++){
		System.out.println(sub[i]);
		a[i]=inp.next();
		if(i==2)
			tot=a[i]+a[i-1]+a[i-2];
	}
	System.out.println("The register no. is "+reg+"The name is "+name+"The department is "+dept);
	for(int i=0;i<3;i++)
		System.out.println("Mark for "+sub[i]+"is "+a[i]);
	System.out.println("Total is :"+tot+"and the average is "+tot/3);
	}
}
public class Ex3_1{
	public static void main(String args[]){
		Student s=new Student();
		String d=s.create();
		if (d=="CSE"){
			CSE c=new CSE();
		c.cse();
		}
		else{
			ECE e=new ECE();
			e.ece();
		}
	}
}

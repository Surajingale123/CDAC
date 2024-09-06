
import java.util.Scanner;

class Employee{
	
	int empid;
	String name;
	String address;
	
	
	void givedata() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter name");
        name = sc.nextLine();
        
		System.out.print("Enter Employee id");
		empid = sc.nextInt(); 
		
		sc.nextLine(); 
		//System.out.println();
		
        System.out.print("Enter Address");
        address=sc.nextLine();
        
        System.out.println();
       
        
	}
	
	void showdata() {
		
		System.out.println ("Your Employee id is "+ empid);
		System.out.println ("Your name is "+ name);
		System.out.println ("Your Address is  "+ address);
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		
		Employee E1= new Employee();
		
		E1.givedata();
		E1.showdata();
		
        Employee E2= new Employee();
		
		E2.givedata();
		E2.showdata();
		
	}

}

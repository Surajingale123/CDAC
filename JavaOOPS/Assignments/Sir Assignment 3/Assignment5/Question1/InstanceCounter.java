package org.q1;

public class InstanceCounter {

	static int count =0;
	
	public InstanceCounter() {
		
		System.out.println("Constructor call ");
		count++;
		
	}

	public static void main(String[] args) {
		
     InstanceCounter c1 =new InstanceCounter();
     InstanceCounter c2 =new InstanceCounter();
     InstanceCounter c3 =new InstanceCounter();
     InstanceCounter c4 =new InstanceCounter();
     
     System.out.println(count);
	}

}

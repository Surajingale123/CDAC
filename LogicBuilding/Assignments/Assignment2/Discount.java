class Discount{
	 
	 public static void main(String args[]){
		 
		 
		 int price=700;
		 double Total;
		 bool membership= true;
		 
		 if(price>1000){
			 if (membership==true){
				 Total=price * 0.25;
				 System.out.println(Total);
			 }
			 else{
				 Total= price*0.2;
				 System.out.println(Total);
				 }
		 }
		 else if(price>500 && price <999){
			  if (membership==true){
				 Total=price * 0.15;
				 System.out.println(Total);
			 }
			 else{
				 Total= price*0.10;
				 System.out.println(Total);
				 }
		 }
		 else if (price <500){
			  if (membership==true){
				 Total=price * 0.10;
				 System.out.println(Total);
			 }
			 else{
				 Total= price*0.05;
				 System.out.println(Total);
		 }
		 
		 
					
		 }
		 
	 }
}
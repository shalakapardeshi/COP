import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    Employee[] emp = new Employee[5];
	    emp[0] = new Employee(1001,"shalaka","pune",20000);
	    emp[1] = new Employee(1002, "megha","nashik",3000);
	    emp[2] = new Employee(1003, "ansh", "dhule",25000);
	    emp[3] = new Employee(1004, "shivani", "nagar",35000);
	    emp[4] = new Employee(1005, "sneha","jalna",18000);
	   
	 

	    System.out.println("--- for each loop---");
	    System.out.println("Original Employee details: ");
	    for(Employee e : emp)
	    {
	     e.displayInfo();
	     System.out.println("-------------------------");
	    }
	    System.out.println("--- for loop---");
	    System.out.println("Original Employee details: ");
	    for(int i=0;i<5;i++)
	    {
	    	Employee e= emp[i];
	    	e.displayInfo();
	    	System.out.println("------------------------");
	    }
	    
	   for(int j=0;j<5;j++)
	   {
		   Employee e1=emp[j];
		   if(e1.getSal()<20000)
		    e1.displayInfo();
		   
		   
	   }
	  
	   
	    
		 
		
		 
	}

}

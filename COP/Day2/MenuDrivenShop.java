import java.util.Scanner;

public class MenuDrivenShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,Total;
		boolean flag=true;
		int PenPrice=10,PencilPrice=5,NotebookPrice=20,BottlePrice=30,ColorboxPrice=50;
		Total=0;
        Scanner sc = new Scanner(System.in);
		System.out.println("Items available in the shops are");
		System.out.println("1:Pen 2:Pencil 3:Notebook 4:Bottle 5:Colorbox");
		while (flag) {
		System.out.print("Enter your Choice: ");
		
		choice=sc.nextInt();
		
		{
		switch(choice){
			case 1: System.out.print("Enter the quantity of the pen you want ");
			        int QuantPen=sc.nextInt();
			        Total+=QuantPen*PenPrice;
			        break;
			case 2: System.out.print("Enter the quantity of the pencil you want ");
	                int QuantPencil=sc.nextInt();
	                Total+=QuantPencil*PencilPrice;
	                break;
			case 3: System.out.print("Enter the quantity of the notebook you want ");
	                int QuantNotebook=sc.nextInt();
	                Total+=QuantNotebook*NotebookPrice;
	                break;
		    case 4: System.out.print("Enter the quantity of the bootle you want ");
	                int QuantBottle=sc.nextInt();
	                Total+=QuantBottle*BottlePrice;
	                break;
			case 5: System.out.print("Enter the quantity of the colorbox you want ");
	                int QuantColorbox=sc.nextInt();
	                Total+=QuantColorbox*ColorboxPrice;
	                break;
			       
		  default : flag=false;
			  System.out.println("Total total bill is"+Total);
			
				
		
		}
		
		}
	}

	}

}


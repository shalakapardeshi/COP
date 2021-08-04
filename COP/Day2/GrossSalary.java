import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int HRA,DA;
				float da,hra;
				float BasicSalary;
				float GrossSalary;
				Scanner sc= new Scanner(System.in);
				System.out.println("enter the basic salary of an employee");
				BasicSalary= sc.nextFloat();
				if(BasicSalary<=10000)
				{
					HRA=20;
					DA=80;
				}
				else if (BasicSalary<=20000)
				{
					HRA=25;
					DA=90;
				}
				else
				{
					HRA=30;
					DA=95;
				}
				da=BasicSalary*DA/100;
				hra=BasicSalary*HRA/100;
				GrossSalary=BasicSalary+hra+da;
				System.out.println("the gross salary of an employee is "+GrossSalary);
				sc.close();

			}

		}

		
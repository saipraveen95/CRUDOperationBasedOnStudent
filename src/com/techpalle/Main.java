
		package com.techpalle;

		import java.util.Scanner;

		public class Main {

			public static void main(String[] args) 
			{
				System.out.println("WELCOME!!!!");
				do {
				System.out.println("Press 1-to create table\nPress 2-to insert a row into table\n"
						+ "Press 3-to update the row\nPress 4-to delete the row\nPress 5-to exit");
				System.out.println("Enter number:");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				switch(num)
				{
				case 1:
					CrudOperations.create();
					System.out.println("Table created succesfully!!!");
					break;
				case 2:
					System.out.println("Enter id no: ");
					int no=sc.nextInt();
					System.out.println("Enter name: ");
					sc.nextLine();
					String name= sc.nextLine();
					System.out.println("Enter Salary: ");
					int sal=sc.nextInt();
					CrudOperations.insert(no, name, sal);
					System.out.println("Inserted succesfully!!!");
		           break;
				case 3:
					System.out.println("Enter id no: ");
					int eno=sc.nextInt();
					System.out.println("Enter salary to update: ");
					int esal=sc.nextInt();
					CrudOperations.update(eno, esal);
					System.out.println("Updated succesfully!!!");
		            break;
				case 4:
					System.out.println("Enter id no: ");
					int dno=sc.nextInt();
					CrudOperations.delete(dno);
					System.out.println("Deleted Succesfully");
					break;
				case 5:
					System.out.println("Thank you!!!");
				    return;
				default:
					System.out.println("Invalid Number");
					break;
					
				}
			  }while(true);
			}

			

	}



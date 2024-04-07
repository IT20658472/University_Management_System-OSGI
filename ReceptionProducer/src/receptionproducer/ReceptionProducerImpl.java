package receptionproducer;

import java.util.ArrayList;
import java.util.Scanner;

public class ReceptionProducerImpl implements ReceptionProducer{
	
	Scanner sc = new Scanner (System.in);
	

	String  rreceptionId, rreceptionName, rsalary, rdegree, rdegreeAmount;
	
	static ArrayList<Reception> rreception = new ArrayList<Reception>();

	@Override
	public void RegisterReception() {
		
		System.out.println("**************************************************************************");
		System.out.println("**************Welcome to Reception Registration Panel**********************");
		System.out.println("**************************************************************************");
		System.out.println();
		
		
		System.out.print("Are You A New Receptionist (y|Y or n|N)?: ");
		String input = sc.next();
		System.out.println();

		while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y")) {
			System.out.println("If you wish to end your proccess and leave the system, type exit");	
			
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
			
			System.out.print("Enter  ID: ");
			rreceptionId = sc.next();
			
			System.out.print("Enter Your Name : ");
			rreceptionName = sc.next();
			
			System.out.print("Enter Your Salary : ");
			rsalary = sc.next();
			
			System.out.print("Enter Degree Name: ");  // this reception have this degree details thats one
			rdegree = sc.next();
					
			System.out.print("Enter Degree Amount : ");
			rdegreeAmount = sc.next();
			
		
			
			rreception.add(new Reception(rreceptionId, rreceptionName, rsalary, rdegree, rdegreeAmount));
			
			System.out.println();
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Do You Want To Add Another Reception (y|Y or n|N)?: ");
			input = sc.next();
			System.out.println();
		}
		
	}

	@Override
	public void UpdateReception(Reception reception) {
		
		System.out.print("Do You Want To Update Reception Details (y|Y or n|N)?: ");
		String input = sc.next();
		System.out.println("--------------------------------------------------------------------------");

		while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y")) {
			
			if (rreception.contains(reception)) {
				
				System.out.print("What Do You Want To Edit(Name:1, Salary:2, Degree Name:3, Degree Amount:4)?: ");
				int editDetails = sc.nextInt();
				
				if(editDetails ==1) {
					System.out.print("Enter Name: ");
					rreceptionName = sc.next();
				}
				
				else if(editDetails == 2){
					System.out.print("Enter Salary: ");
					rsalary = sc.next();
				}
				else if(editDetails == 3){
					System.out.print("Enter Degree Name: ");
					 rdegree = sc.next();
				}
				else if(editDetails == 4){
					System.out.print("Enter Degree Amount: ");
					rdegreeAmount = sc.next();
				}
				
				else {
					System.out.println("You Entered Invalid Number");
				}
				System.out.println("--------------------------------------------------------------------------");
				rreception.set(rreception.indexOf(reception), new Reception(rreceptionId, rreceptionName, rsalary,  rdegree, rdegreeAmount));

			} else if (rreception.size() == 0) {
				System.out.println("No record added yet!");
			} else {
				System.out.println("Invalid Lecturer NIC!");
			}
			System.out.print("Do You Want To Update Another Reception(y|Y or n|N)?: ");
			input = sc.next();
		}
		
		
		 
	}
	public void DeleteReception (String receptionId) {
	
		System.out.print("Are You Sure; Do You Want To Delete This Reception (y|Y or n|N)?: ");
		String input = sc.next();

		while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y")) {
			if (rreception.size() != 0) {
				int j = 0;
				for (int i = 0; i < rreception.size(); i++) {
					if (rreception.get(i).getReceptionId() == rreceptionId) {
						String deleteReceptionId = rreception.get(i).getReceptionId();
						rreception.remove(i);
						System.out.println("reception :" + deleteReceptionId + " Is Deleted Successfully");
						break;
					}
					j++;
				}
			} else {
				System.out.println("No record added yet!");
			}
			
			System.out.print("Do You Want To Delete Another Reception (y|Y or n|N)?: ");
			input = sc.next();
		}
		
	}
	
	

	@Override
	public void DisplayReceptionList() {
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------Display Reception Details-----------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println();
		
		for (Reception office : rreception) {
			System.out.println("--------------------------Reception Details-------------------------------");
			System.out.println("Reception ID     : " + office.getReceptionId());
			System.out.println("Reception Name   : " + office.getReceptionName());
			System.out.println("Reception Salary : " + office.getSalary());
			System.out.println("Degree Name      : " + office.getDegree());
			System.out.println("Degree Amount    : " + office.getDegreeAmount());
			
			System.out.println("--------------------------------------------------------------------------");
		}
		
	}

	@Override
	public Reception getReceptionById(String receptionId) {
		for (Reception reception : rreception) {
			if (reception.getReceptionId() == rreceptionId) {
				return reception;
			}
		}
		
		return null;
	}




}

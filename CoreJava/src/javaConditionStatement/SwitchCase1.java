package javaConditionStatement;

public class SwitchCase1 {

	public static void main(String[] args) {
	int monthNumber = 8;
		
		switch (monthNumber) {
	case 1: System.out.println("January");
	      break;
	
	case 2:System.out.println("February");
	      break;//break will break the execution of switch case and control will go out of switch body
	
	case 3:System.out.println("March");
	       break;
	
	case 4:System.out.println("April");
	       break;
	
	case 5:System.out.println("May");
	       break;
	
	case 6:System.out.println("June");
	       break;
	
	case 7:System.out.println("July");
	       break;
	
	case 8:System.out.println("August");
	       
	
	case 9:System.out.println("September");
	       break;
	
	case 10:System.out.println("October");
	       break;
	
	case 11:System.out.println("November");
	       break;
	
	case 12:System.out.println("December");
	       break;
	       
	default : System.err.println("Please enter valid month number");
	       break;
	 //here err is used because it is used to dislay error message which will be printed in red colour       
	}
	
	}
}
//print the calender month based on month number
//here case 8 & case 9 will get printed as there is no break after case 8
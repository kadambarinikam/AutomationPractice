package oopsEncapsulation;

class Bank{
// private variables and methods can be accessed within the same class only	
	private int accNum = 123;
	private double accBalance = 42536.56;
	private String name = "Spruha" ;
	static String bankName = "ABC Bank";
	
// always ensure that getter and setter method should be public	
	 public int getAccNum() {
		 return accNum;
	 }
	 
	public double getAccBalance() {
		return accBalance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public void setName(String name) {
		this.name = name;
		
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Bank obj = new Bank();
		 //System.out.println(obj.accNum);
		 //System.out.println(obj.accBalance);
		 //System.out.println(obj.name);
	    System.out.println(Bank.bankName);
	    
		System.out.println(obj.getAccNum());
		System.out.println(obj.getAccBalance());
		System.out.println(obj.getName());
		
		obj.setAccNum(45678);
		obj.setAccBalance(654376326);
		obj.setName("Spruha Bachhav");
		
		System.out.println("*****************");
		System.out.println(obj.getAccNum());
		System.out.println(obj.getAccBalance());
		System.out.println(obj.getName());
	}

}

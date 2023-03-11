package encapsulation;

public class Bank {

	
	int accountNumber= 12345678;
	private int pinNumber = 1234;
	private double balance = 150000;
	
	public void drawMoney (int acctNo, int pinNo, int amount) {
		
		if (acctNo == accountNumber && pinNo == pinNumber) {
			
			if (amount <= balance) {
			balance = balance - amount;
			System.out.println(" Amount withdrawn " + amount);
			} else {
				System.out.println("Insufficient Balance");
			}
		}else {
			System.out.println("Invalid Credentials");
		}
	}

	public void updatePin(int acctNo, int oldPin, int newPin) {
		if (acctNo == accountNumber && oldPin == pinNumber) {
			pinNumber = newPin;
			System.out.println("Pin is updated");
		}else {
			System.out.println("Invalid Credentials");
		}
		
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	
}

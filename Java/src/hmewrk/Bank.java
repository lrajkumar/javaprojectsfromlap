package hmewrk;

public abstract class Bank {
	int balance = 0;

    abstract void deposit(int amount);

	abstract void withdraw(int amount);

	void printBalance() {
	    System.out.println(balance);
	}
}

class HdfcBank extends Bank {

	@Override
	void deposit(int amount) {
		// TODO Auto-generated method stub
	}

	@Override
	void withdraw(int amount) {
		// TODO Auto-generated method stub
		
	}

	

}


class CanaraBank extends Bank {

	void deposit(int amount) {
        balance = balance + amount - 5;
    }

    void withdraw(int amount) {
        balance = balance - amount - 2;
    }

}
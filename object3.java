class Account{
	int acc_no;
	String name;
	float amount;
	void insert(int a,String n,float amt){
	acc_no = a;
	name = n;
	amount = amt;
	}
	void deposite(float amt){
		amount = amount+amt;
		System.out.println(amt+"deposite");
	}
	void withdraw(float amt){
		if(amount < amt){
			System.out.println("insufficient balance");
		}
		else{
			amount = amount-amt;
			System.out.println(amt+"withdraw");
		}
	}
	void checkBalance(){
		System.out.println("Balance is:"+amount);
	}
	void display(){
		System.out.println(acc_no+" "+name+" "+amount);
	}
}
	class TestAccount{
		public static void main(String[] args){
			Account a1 = new Account();
			a1.insert(12345,"charan",25000);
			a1.display();
			a1.checkBalance();
			a1.deposite(2000);
			a1.checkBalance();
			a1.withdraw(27000);
			//a1.withdraw(28000);
			a1.checkBalance();
		}
	}

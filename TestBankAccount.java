import java.util.Scanner;
class TestBankAccount
{
	long accountno;
        long balance;
        long monthlyfee;

	Scanner s = new Scanner(System.in);
	void getData(long accountno,long monthlyfee, long balance)
	{
		System.out.print("Enter accountno:");
		accountno = s.nextLong();
		System.out.print("Enter monthly fee:");
		monthlyfee = s.nextLong();
		System.out.print("Enter balance:");
		balance = s.nextLong();
	}

	void deduction(long monthlyfee, long balance)
	{
		balance = balance - monthlyfee;
		System.out.println("New Balance :" + balance);
	}

	void showValues(long accountno, long monthlyfee, long balance)
	{
		System.out.println("accountno:" + accountno);
		System.out.println("Old balance:" + balance);
		deduction(monthlyfee, balance);
	}

	public static void main(String [] args)
	{
		long accountno;
                long balance;
                long monthlyfee;
		TestBankAccount b1 = new TestBankAccount();
		TestBankAccount b2 = new TestBankAccount();
		TestBankAccount b3 = new TestBankAccount();
		b1.getData(b1.accountno, b1.monthlyfee, b1.balance);
		System.out.println(b1.accountno);
		b1.showValues(b1.accountno, b1.monthlyfee, b1.balance);
	}
}

import java.util.ArrayList;

public class Transaction {
	private Member payer ;
	private String description ;
	private float amount ;
	private ArrayList<Member> expenseMembers ;
	
	public Transaction(Member payer,String text, float amount,ArrayList<Member> members) {
		this.amount = amount;
		this.description = text ;
		this.expenseMembers = members ;
		this.payer = payer;
	}
	
	public void splitExpense() {
		float splitAmount = amount/expenseMembers.size() ;
		//reduce balance of payer since he paid for the transaction
		payer.reduceToBalance(splitAmount);
		for(Member m: expenseMembers) {
			m.addToBalance(splitAmount);
		}
	}
}

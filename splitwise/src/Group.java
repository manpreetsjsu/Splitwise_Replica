import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Group {

	private String name;
	// private ArrayList<Member> memberList ;
	private HashMap<Integer, Member> memberList;

	public Group(String name) {
		this.name = name;
		memberList = new HashMap<>();

	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void addMember(Member m) {
		if (memberList.containsKey(m.getName().hashCode()))
			return;
		memberList.putIfAbsent(m.getName().hashCode(), m);
	}

	public Collection<Member> getMembers() {
		return this.memberList.values();
	}

	public HashMap<Integer, Member> getMemberListMap() {
		return this.memberList;
	}

	public void deleteMember(int key) {
		memberList.remove(key);
	}

	/*
	 * This function combine and simplify debts of Each member of the group
	 */
	public void simplifyGroupDebts() {

		for (Member debter : this.getMembers()) {

			for (Map.Entry<Member, Double> lender : debter.getOweList().entrySet()) {
				// get moneyOwed Bob [debter] -> Alice [lender]
				Member lenderPerson = lender.getKey();
				double debterOwesToLender = lender.getValue();
				// get moneyOwed Alice [lender] -> Bob [debter]
				double lenderOwesToDebter = lenderPerson.getOweList().get(debter) != null
						? lenderPerson.getOweList().get(debter)
						: 0;

				if (lenderOwesToDebter > debterOwesToLender) {
					lenderPerson.modifySimplfiedDebtList(debter, lenderOwesToDebter - debterOwesToLender);
					// System.out.println(lenderPerson.getName() + " -> " + debter.getName() + " ->
					// " + (lenderOwesToDebter - debterOwesToLender));
					debter.modifySimplfiedDebtList(lenderPerson, 0);
					// System.out.println(debter.getName() + " -> " + lenderPerson.getName() + " ->
					// " + 0);

				} else if (lenderOwesToDebter < debterOwesToLender) {
					debter.modifySimplfiedDebtList(lenderPerson, debterOwesToLender - lenderOwesToDebter);
					// System.out.println(debter.getName() + " -> " + lenderPerson.getName() + " ->
					// " + (debterOwesToLender - lenderOwesToDebter));
					lenderPerson.modifySimplfiedDebtList(debter, 0);
					// System.out.println(lenderPerson.getName() + " -> " + debter.getName() + " ->
					// " + 0);
				}

				else if (lenderOwesToDebter == debterOwesToLender) {
					// System.out.println("Balancing Out balances");
					debter.modifySimplfiedDebtList(lenderPerson, 0);
					lenderPerson.modifySimplfiedDebtList(debter, 0);
				}

			}
		}
	}

}

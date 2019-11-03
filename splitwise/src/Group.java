import java.util.ArrayList;

public class Group {
	
	private String name;
	private ArrayList<Member> memberList ;
	
	public Group(String name) {
		this.name = name;
		memberList= new ArrayList<>();
	}
	
	public String getName() {
		return this.name ;
	}
	public void addMember(Member m) {
		memberList.add(m);
	}
	
	public ArrayList<Member> getMembers(){
		return this.memberList;
	}
	
	public void deleteMember(Member m) {
		for(int index=0; index<memberList.size(); index++) {
			if(memberList.get(index) == m)
				memberList.remove(index);
		}
	}
	
}

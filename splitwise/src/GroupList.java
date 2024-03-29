import java.util.Collection;
import java.util.HashMap;

public class GroupList {
	// Integer is the hashCode of the GroupName i.e. group.getName().hashCode()
	private HashMap<Integer, Group> groupList;

	public GroupList() {
		groupList = new HashMap<>();
	}

	public void addGroup(Group newGroup) {
		// if same group name exists, just return
		if (groupList.containsKey(newGroup.hashCode())) {
			return;
		}
		groupList.put(newGroup.getName().hashCode(), newGroup);
	}

	public Collection<Group> getGroupList() {
		return this.groupList.values();
	}

	public void deleteGroup(int key) {
		groupList.remove(key);
	}
}

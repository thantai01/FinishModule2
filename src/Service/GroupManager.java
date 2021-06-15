package Service;

import Model.Find;
import Model.Group;
import Model.Manager;

import java.util.ArrayList;
import java.util.List;

public class GroupManager implements Manager<Group>, Find<Group> {
    private List<Group> groupManager = null;

    public GroupManager() {
        groupManager = new ArrayList<>();
    }

    public List<Group> getGroupManager() {
        return groupManager;
    }

    public void setGroupManager(List<Group> groupManager) {
        this.groupManager = groupManager;
    }

    @Override
    public String toString() {
        return "GroupManager{" + groupManager + '}';
    }

    @Override
    public void add(Group group) {
        groupManager.add(group);
    }

    @Override
    public void display() {
        System.out.println(groupManager);
    }

    @Override
    public void edit(String groupName, Group group) {
        int groupIndex = findIndex(groupName);
        if(findIndex(groupName)==-1) {
            System.out.println("Contact not found");
        } else groupManager.set(groupIndex,group);
    }

    @Override
    public int findIndex(String groupName) {
        for (int i = 0; i < groupManager.size(); i++) {
            if (groupManager.get(i).getName().equals(groupName)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findByPhoneNums(String phoneNums) {

    }

    @Override
    public void findByName(String groupName) {
        for(Group group: groupManager) {
            if(groupName.equals(group.getName())) {
                System.out.println(group + "\n");
            }
        }
    }
}
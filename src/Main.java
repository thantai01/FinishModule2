import Service.GroupManager;
import View.MainMenu;

public class Main {
    public static void main(String[] args) {
        GroupManager phone = new GroupManager();
        MainMenu.intro();
        MainMenu.mainAction(phone);
    }
}

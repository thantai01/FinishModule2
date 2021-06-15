package Model;

public interface Manager <T>{
    void add(T t);
    void display();
    void edit(String phoneNum,T t);
    int findIndex(String phoneNum);
}

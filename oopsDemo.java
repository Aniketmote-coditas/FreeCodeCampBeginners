import java.util.*;
class User11 {
    String name;
    int salary;
    ArrayList<Book1> books= new ArrayList<Book1>();
    User11(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void incrementSal(){
        salary+=2000;
    }
    void borrow(Book1 book){
        this.books.add(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", books=" + books +
                '}';
    }
}
class Book1 {
    String bName;
    String athorName;
    Book1(String bName,String athorName){
        this.bName = bName;
        this.athorName = athorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", athorName='" + athorName + '\'' +
                '}';
    }
}
public class oopsDemo {
    public static void main(String[] args) {
        Book1 book1 = new Book1("java", "Aniket");
        User11 user1 = new User11("mukesh", 8990);
        user1.borrow(book1);
        System.out.println(user1);
    }
}

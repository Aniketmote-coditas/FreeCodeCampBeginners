import java.util.*;
class User1{
    public String name;
    int salary;
    ArrayList<Book> books= new ArrayList<Book>();
    void incrementSal(){
        salary+=2000;
    }
    void borrow(Book book){
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
class Book {
    String bName;
    String athorName;

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", athorName='" + athorName + '\'' +
                '}';
    }
}
public class oops {

    public static void main(String[] args) {
        User1 user =new User1();
        user.name = "Aniket";
        System.out.println(user.name);
        user.salary=36879;
        System.out.println(user.salary);
        user.incrementSal();
        Book book=new Book();
        book.bName="JAVA";
        book.athorName="Aniket";
        user.borrow(book);
        System.out.println(user.salary);
        System.out.println(user);
    }
}

import java.util.Scanner;

public class swich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int number1 =Integer.parseInt( sc.nextLine());
        int number2 =Integer.parseInt( sc.nextLine());
        System.out.println("Enter one operation");
        String operation = sc.nextLine();
        switch (operation){
            case "sum":
                System.out.println(number1+number2);
                break;
            case "sub":
                System.out.println(number1-number2);
                break;
            case "mul":
                System.out.println(number1*number2);
                break;
            case "div":
                System.out.println(number1/number2);
            default:
                System.out.println("Wrong operations");
        }
    }
}

import java.util.Scanner;

public class Conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1= sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println(num1);
        System.out.println(num2);

        String op = sc.nextLine();
        if(op.equals("sum")){
            System.out.println(num1+num2);
        }else if(op.equals("sub")){
            System.out.println(num1-num2);
        }else if(op.equals("mul")){
            System.out.println(num1*num2);
        }else if(op.equals("div")){
            System.out.println(num1/num2);
        }else{
            System.out.printf("%s is not supportive",op);
        }

    }
}

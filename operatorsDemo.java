public class operatorsDemo {
    public static void main(String[] args) {
        int number1=12;
        int number2=24;

        System.out.println(number2+number1);
        System.out.println(number2-number1);
        System.out.println(number2*number1);
        System.out.println(number2/number1);
        System.out.println(number2%number1);

        number2 +=number1;
        System.out.println(number2);
        number2 /=number1;
        System.out.println(number2);
        number2 -=number1;
        System.out.println(number2);
        number2 %=number1;
        System.out.println(number2);


        int num1=12;
        int num2=15;
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1<=num2);



        int age=25;
        boolean b=false;
        System.out.println(age >=18 && age<=40);
        System.out.println(age >=18 || age<=40);
        System.out.println(!b);

        int score=0;
        score++;
        System.out.println(score);
        score--;
        System.out.println(score);

        int score1=40;
        ++score1;
        System.out.println(score);
        --score1;
        System.out.println(score);
    }
}

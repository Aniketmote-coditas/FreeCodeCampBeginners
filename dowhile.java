public class dowhile {
    public static void main(String[] args) {
        int number = 10;
        int multiplier = 2;
        do{
            System.out.println(number+" * "+multiplier+" = "+number*multiplier);
            multiplier++;
        }while(multiplier <= 20);
    }
}

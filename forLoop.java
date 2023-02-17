public class forLoop{
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        int arr[]={55,34,2,31,8,50,12,40,60,78,90};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("Print table");
        int n=2;
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++) {
                System.out.println(i + " * " + j + " = " + j* i);
            }
        }
    }
}

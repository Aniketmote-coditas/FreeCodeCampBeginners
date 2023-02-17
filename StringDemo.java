public class StringDemo {
    public static void main(String[] args) {
        String name = "aniket mote";
        System.out.println(name);

        String newName = new String("Aniket mote");
        System.out.println(newName);

        String data1="abc";
        String data2 = "abc";
        System.out.println(data2==data1);

        String dataname1 = new String("Aniket");
        String dataName = new String("Aniket");
        System.out.println(dataName==dataname1);
        System.out.println(dataName.equals(dataname1));

        String name1 = "Aniket";
        String surname = "mote";
        System.out.println("my name is "+name1+surname);


        String formaat = String.format("my name is %s %s",name1,surname);
        System.out.println(formaat);

        String fr = "mukesh";
        System.out.println(fr.toUpperCase());

        String temp = "the sky is blue";
        System.out.println(temp.replace("blue","red"));
    }
}

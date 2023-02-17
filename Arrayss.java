import java.util.Arrays;
public class Arrayss {
    public static void main(String[] args) {
        char vowel[] = new char[5];
        vowel[0]='a';
        vowel[1]='e';
        vowel[2]='i';
        vowel[3]='o';
        vowel[4]='u';
        System.out.println(Arrays.toString(vowel));
        char vowels[] = {'i','o','u','a','e'};
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
        int fIndex = Arrays.binarySearch(vowels,1,4,'i');
        System.out.println(fIndex);
        fIndex = Arrays.binarySearch(vowels,1,4,'b');
        System.out.println(fIndex);
        //Arrays.fill(vowels,'x');
        System.out.println(Arrays.toString(vowels));
        char v[] = vowels;
        Arrays.fill(vowels,'y');
        char y[] = Arrays.copyOfRange(vowels,2,4);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.equals(v,vowels));
    }
}

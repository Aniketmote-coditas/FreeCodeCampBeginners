import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> examScore = new HashMap<String , Integer>();
        examScore.put("HIS",89);
        examScore.put("jav",98);
        examScore.put("D",91);
        examScore.put("Acc",65);
        System.out.println(examScore.toString());
        System.out.println(examScore.get("jav"));
        examScore.putIfAbsent("HIS",90);
        System.out.println(examScore.toString());
        //System.out.println(examScore.get("Soft"));
        //examScore.clear();
        examScore.remove("DS");
        System.out.println(examScore.containsKey("jav"));
        System.out.println(examScore.containsValue(98));
        System.out.println(examScore.isEmpty());
        examScore.forEach((subjects ,score)->{
            System.out.println(subjects +"-"+score);
        });
    }
}

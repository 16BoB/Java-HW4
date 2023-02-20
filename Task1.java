import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList <Integer> ld = new LinkedList<>();
        ld.add(3);
        ld.add(8);
        ld.add(7);
        System.out.println(ld);
        System.out.println(reversList(ld));
        
    }
    public static LinkedList<Integer> reversList(LinkedList<Integer> list) {
        int temp = 0;
        int len = list.size() - 1;
            for (int i = 0; i < list.size()/2; i++) {
                temp = (int)list.get(i);
                list.set(i, (int)list.get(len - i));
                list.set(len - i, temp);
            }
            return list;
    } 
}
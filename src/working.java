import java.util.ArrayList;

public class working {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hiii!");
        list.add("good morning");
        list.add("how u");

        System.out.println(list);

        ArrayList list2 = new ArrayList();
        list2.add("eww");

        System.out.println(list2);
        System.out.println(list.equals(list2));
    }
}

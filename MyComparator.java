import java.util.*;

public class MyComparator {
    public int compareList(List<Integer> list, List<Integer> otherlist) {
        if (list.size() < otherlist.size()) {
            return -1;
        } else if (list.size() > otherlist.size()) {
            return 1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < otherlist.get(i)) {
                return -1;
            } else if (list.get(i) > otherlist.get(i)) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MyComparator comparator = new MyComparator();
        List<Integer> list = List.of(1,2,3,4);
        List<Integer> otherlist = List.of(1,2,3,5);
        int result = comparator.compareList(list, otherlist);
        System.out.println(result);
    }
}

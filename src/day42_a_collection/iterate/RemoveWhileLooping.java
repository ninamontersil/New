package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list);

        //1 - Remove with tradition loop
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            if (list.get(i) < 6) {
                list.remove(i);

                System.out.println(list);

                /* elem: 2,3,5,6,12,54,23,65,3,6
                index: 0 1 2 3 4 5 6 7 8 9
                i=0;

                 */
            }
        }
    }
}

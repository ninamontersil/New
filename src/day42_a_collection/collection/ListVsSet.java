package day42_a_collection.collection;

import java.util.*;

public class ListVsSet {

    public static void main(String[] args) {

        /* difference between list and set
        List interface
        -insertion order is kept
        allows null
        allows duplicates

        Set interface
        insertion order deppends on which class it is
        -Hashset: random order
        linkedhashset: insertion order
        Treeset : sorted order
        - for allowing null depends on which class it is
        -Hashset: random order
        linkedhashset: alllows null
        Treeset : does not allow null

         */

        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(-5);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(4);
        list.add(null);
        System.out.println(list);


        System.out.println("_______________________");
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(-5);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(4);
        set.add(null);
        System.out.println(set);

        System.out.println("_______________________");

        // q: how can we get each element from the set

        // A: we can loop through and get each element

        for (Integer each : set) {
            System.out.println(each);

        }

        System.out.println("_______________________");

        //same thing can be applied to list as well
        for (Integer each : list) {
            System.out.println(each);

        }
        System.out.println();
        // q: can you sort the hashset?
        set.remove(null);
        System.out.println(set);
        Set<Integer> sorted = new TreeSet<>(set);
        System.out.println(sorted);

        System.out.println();
        //q: Can we remove duplicates?
        System.out.println(list);
        Set<Integer> noDupList = new HashSet<>(list);
        System.out.println(noDupList);

        System.out.println();
        //q: Can we remove duplicates?
        list.remove(null);
        System.out.println(list);
        Set<Integer> noDupAndSortList = new TreeSet<>(list);
        System.out.println(noDupList);

        System.out.println("___________________");
        String str = " vjdfdgfjsfdgfjjrgfdg;";

        //get the letter from each(remove duplicate)
        str.split("");
        Arrays.asList(str.split("")); // convertin arrays into Collection type so it can be used with collections
        Set <String> set1 = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println(str);
        System.out.println(set1);




}
}
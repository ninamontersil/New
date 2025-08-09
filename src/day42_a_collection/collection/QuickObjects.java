package day42_a_collection.collection;

import java.util.PriorityQueue;

public class QuickObjects {

    public static void main(String[] args) {

        /* priorityqueues
        -random order
        allows dupes
        does not allow null
        fifo: first in first out


        .add(elem); . offer();
        .removed(elem) > poll ();
        .get() > (peak);
         */

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2);
        //priorityQueue.add(null);

        System.out.println(priorityQueue);

        priorityQueue.offer(30);
        System.out.println(priorityQueue);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);

        System.out.println();
        priorityQueue.poll(); // fifo first in first out
        System.out.println(priorityQueue);
        priorityQueue.poll(); // fifo first in first out
        System.out.println(priorityQueue);
        priorityQueue.poll(); // fifo first in first out
        System.out.println(priorityQueue);
        priorityQueue.poll(); // fifo first in first out
        System.out.println(priorityQueue);
        priorityQueue.poll(); // fifo first in first out
        System.out.println(priorityQueue);
        priorityQueue.poll(); // fifo first in first out
        System.out.println(priorityQueue);

        System.out.println("_______________________");



    }


}

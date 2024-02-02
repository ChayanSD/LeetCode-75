package queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCall {
    Queue<Integer> queue;

    public NumberOfRecentCall() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        NumberOfRecentCall numberOfRecentCall = new NumberOfRecentCall();
        System.out.println(numberOfRecentCall.ping(100));
    }
}

//Leetcode 933
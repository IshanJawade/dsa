package leetcode.hard;

import java.util.*;

class MedianFinder {
    Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());   // max-heap
    Queue<Integer> min = new PriorityQueue<>(); 
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        // first and second addition
        if(max.size() == 0){
            max.offer(num);
        } else if(min.size() == 0) {
            if(num < max.peek()) {
                int temp = max.poll();
                max.offer(num);
                min.offer(temp);
            } else {
                min.offer(num);
            }
        }

        // if both have same number of elements
        if(max.size() == min.size()) {
            if(num > max.peek() && num < min.peek()) {
                int temp = max.poll();
                max.offer(num);
                min.offer(temp);
            } else if (num > min.peak()) {
                int temp = min.poll();
                min.offer(num);
                max.offer(temp);
            }
        } else if(max.size() > min.size()) {
            if(num < max.peek()) {
                int temp = max.poll();
                min.offer(temp);
                max.offer(num);
            } else if(num > min.peak()){
                max.offer(min.poll());
                min.offer(num);
            }
        }
    }
    
    public double findMedian() {
        if(max.size() == min.size()) {
            double mid = (max.peek() + min.peek())/2; 
        } else {
            double mid = min.peek();
        }
        return mid;
    }
}


    public static void main(String[] args) {
        
    }
}

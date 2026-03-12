package STACK_QUEUE;
import java.util.*;

/* PATTERN QUESTIONS IN STACK AND QUEUE

 MONOTONIC STACK
 1. Next Greater Element I,II
 2. Daily Temperature
 3. 132 Pattern
 4. Stock span problem
 5. largest Rectangle in Histogram
 6. Trapping Rain Water

 Approach is loop through array from end to start and while stack is not empty and top of stack is less than or equal to current element pop the stack
 if stack is empty then next greater element is -1 else it is top of stack
 push current element to stack

 STACK FOR EXPRESSION & VALIDATION
 1. Valid Parentheses
 2. Duplicate Parentheses
 3. Min stack
 4. Remove all adjacent duplicates in a string
 5. Evaluate Reverse Polish Notation
 6. Basic Calculator i ii
 7. Minimum Add to make paranthesis Valid

 Approach is  Traverse the input and if opening bracket push to stack
 if closing bracket then check if top of stack is opening bracket if yes then pop else return false
 in the end if stack is empty return true else false


 QUEUE AND DEQUE FOR SLIDING WINDOW PROBLEMS
 1. Sliding window maximum
 2. First negative integer in every window of size k
 3. Moving average from data stream
 4. Max consecutive ones III



 Approach is use deque to store indices of useful elements for each window
 for each element remove elements not in current window and remove smaller elements from back of deque
 the front of deque is the maximum for current window


 STACK AND QUEUE SIMULATION PROBLEMS
 1. Design a stack using queues
 2. Design a queue using stacks
 3. Implement Stack using Linked List
 4. Design a Stack with Increment Operation
 5. LRU Cache
 6. Recent Counter
 7. Asteroid Collision
 8. Decode String

 Approach is use two stacks or two queues to simulate the other data structure.

 ** When you see problem involving nested structures or parantheses or html tags think immediately of stack **
 */

public class Pattern_Question {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] nge = nextGreaterElement(arr);
        for (int i : nge) {
            System.out.print(i + " ");
        }
    }

    private static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return nge;
    }

    // Asteroid Collision
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

}


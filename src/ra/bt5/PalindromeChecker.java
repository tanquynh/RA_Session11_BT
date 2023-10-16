package ra.bt5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi muốn kiểm tra Palindrome: ");
        String palindromeText = sc.nextLine();
        for (int i = 0; i < palindromeText.length(); i++) {
            stack.push(String.valueOf(palindromeText.toLowerCase().charAt(i)));
            queue.offer(String.valueOf(palindromeText.toLowerCase().charAt(i)));
        }
        boolean flag = true;
        for (int i = 0; i < palindromeText.length(); i++) {
            if(stack.pop().equals(queue.poll())) {
                flag = false;
            }
        }
        if(flag) {
            System.out.println("Chuỗi nhập vào không phải là một Palindrome");
        }
        else {
            System.out.println("Chuỗi nhập vào là một Palindrome");
        }
    }
}

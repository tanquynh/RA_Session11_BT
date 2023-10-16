package ra.bt4;

import java.util.Scanner;
import java.util.Stack;

public class TextReversion {
    public static void main(String[] args) {
        Stack<String> textStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng từ: ");
        int numberOfWord = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfWord; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            textStack.push(sc.nextLine());
        }
        System.out.println("Văn bản đảo ngược là: ");
        int stackSize = textStack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(textStack.pop() + " ") ;
        }

    }
}

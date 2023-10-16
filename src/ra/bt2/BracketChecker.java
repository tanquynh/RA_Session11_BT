package ra.bt2;

import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String inputText = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputText.length(); i++){
            char c = inputText.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Không có cặp ngoặc");
                    return;
                }
                char openBrackket = stack.pop();
                if(!isMatch(openBrackket, c)){
                    System.out.println("Không có cặp ngoặc");
                    return;
                }
            }
        }
    }
    public static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}

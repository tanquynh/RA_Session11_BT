package ra.bt1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        String[] input = {"car", "truck", "motor", "bicycle", "airplane", "rocket", "spaceship", "train"};

        Queue<String> queue = new LinkedList<>();

        for (String item: input){
            queue.offer(item);
        }

        System.out.print("Các phần tử hiện nằm trong Queue:");
        while (!queue.isEmpty()){
            String element = queue.poll();
            System.out.print(element + " ");
        }

    }
}

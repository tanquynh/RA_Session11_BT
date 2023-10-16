package ra.bt3;

public class Queue implements Solution {
    Node front;
    Node rear;

    @Override
    public void enQueue(Integer inputData) {
        Node newNode = new Node(inputData);

        if (front == null) {
            this.front = this.rear = newNode;
            this.rear.setLink(newNode);
        } else {
            this.rear.setLink(newNode);
            this.rear = newNode;
            newNode.setLink(front);
        }
    }

    @Override
    public Integer deQueue() {
        if (this.front == null){
            return null;
        }
        int data = this.front.getData();
        if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.getLink();
            this.rear.setLink(this.front);
        }
        return data;
    }

    @Override
    public void displayQueue() {
        if(front == null) {
            System.out.println("Queue is empty");
            return;
        };
        Node temp = front;
        do {
            System.out.println(temp.getData() + " ");
            temp = temp.getLink();
        } while(temp != null);
    }
}

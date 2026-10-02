package LinkedList;

public class BasicTraversal {

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    static boolean searchElement(Node head, int target){
        Node current = head;

        while(current != null){

            if(current.data == target){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = null;
        Node curr = null;
        for(int i = 1; i <= 5; i++){
            Node pointer = new Node(i);

            if(head == null){
                head = pointer;
                curr = head;
            }else{

                curr.next = pointer;
                curr = curr.next;
            }
        }

        System.out.println(searchElement(head,4));
    }
}

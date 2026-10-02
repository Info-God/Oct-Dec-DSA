package LinkedList;

public class SearchElement {
        static class Node{
            int data;
            LinkedList.BasicTraversal.Node next;

            Node(int d){
                data = d;
                next = null;
            }
        }

        public static void main(String[] args) {
            LinkedList.BasicTraversal.Node head = null;
            LinkedList.BasicTraversal.Node curr = null;
            for(int i = 1; i <= 5; i++){
                LinkedList.BasicTraversal.Node pointer = new LinkedList.BasicTraversal.Node(i);

                if(head == null){
                    head = pointer;
                    curr = head;
                }else{

                    curr.next = pointer;
                    curr = curr.next;
                }
            }
            curr = head;
            while(curr != null){
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
    }



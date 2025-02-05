package Linked_List;
import java.util.*;

class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode back;
    DoublyNode(int data1, DoublyNode next1, DoublyNode back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    DoublyNode(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DoublyLinkedList {
    public static DoublyNode arraytoDoublyLL(int[] arr) {
        DoublyNode head = new DoublyNode(arr[0]);
        DoublyNode prev = head;
        for(int i = 1 ; i < arr.length; i++) {
            DoublyNode temp = new DoublyNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void print(DoublyNode head) {
       while(head != null) {
           System.out.print(head.data+ " ");
           head = head.next;
       }
       System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        DoublyNode head = arraytoDoublyLL(arr);
        print(head);
    }
}


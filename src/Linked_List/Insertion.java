package Linked_List;
import java.util.*;

public class Insertion {
    int data;
    Node next;
    Insertion(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    public static Node insertHead(Node head, int el) {
        Node temp = new Node(el);
        temp.next = head;
        return temp;
    }
    public static Node insertTail(Node head, int el) {
        Node temp = head;
        Node insert = new Node(el);
        if(head == null) {
            return new Node(el);
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(el);
        return head;
    }
    public static Node insertKthePosition(Node head, int k, int el) {
        if(head == null) {
            if(k==1) return new Node(el);
        }
        else return null;
        if(k == 1) {
            Node temp = new Node(el);
            temp.next = head;
            return temp;
        }
        Node temp = head;
        int cnt = 0;
        while(temp != null) {
            cnt++;
            if(cnt == k - 1) {
                Node element = new Node(el);
                element = temp.next;
                temp.next = element;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node insertElementAtPosition(Node head, int val, int el) {
        if(head == null) {
            return null;
        }
        if(head.data == val) {
            Node temp = new Node(el);
            temp.next = head;
            return temp;
        }
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) {
                Node element = new Node(el);
                element = temp.next;
                temp.next = element;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}

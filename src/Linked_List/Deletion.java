package Linked_List;
import java.util.*;

public class Deletion{
    int data;
    Node next;
    Deletion(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    public static Node deleteHead(Node head) {
        Node temp = head;
        head = head.next;
        return head;
    }
    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static Node deletekthelement(Node head, int k) {
        if(head == null) return null;
        if(k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            cnt++;
            if(cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node deleteelement(Node head, int value) {
        if(head == null) return null;
        if(head.data == value) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null)
            if(temp.data == value) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        return head;
    }

}

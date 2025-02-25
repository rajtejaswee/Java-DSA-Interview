package Trees;
import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class PostOrder {
    //PostOrder: Left + Right + Root;
    //Recursion Approach
    public static void postOrderRecursion(TreeNode root) {
        if(root == null) return;
        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.println(root.data);
    }
    //Iterative Approach
    public static void postOrderIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        TreeNode curr = root;
        st1.add(root);
        while(!st1.isEmpty()) {
            curr = st1.pop();
            st2.push(curr);
            if(curr.right != null) {
                st1.push(curr.right);
            }
            if(curr.left != null) {
                st1.push(curr.left);
            }
        }
        while(!st2.isEmpty()) {
            curr = st2.pop();
            list.add(curr.data);
        }
     }
}

package Trees;
import java.util.*;

public class LevelOrder {
    //Level Order Traversal : Breadth First Search
    public static void levelOrderTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0; i < levelNum; i++) {
                if(root.left != null) {
                    queue.offer(root.left);
                }
                if(root.right != null) {
                    queue.offer(root.right);
                }
            }
            queue.poll();
            sublist.add(root.data);
        }
    }
}

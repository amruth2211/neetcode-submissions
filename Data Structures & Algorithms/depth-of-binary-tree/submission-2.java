/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        //Recursive DFS
        // if(root == null) {
        //     return 0;
        // }

        // return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        //BFS
        //BFS is mainly we do it by using the queue. Where we first initilize and then offer the first element to the queue. and using the FIFO we keep on adding the next elements and take the elements which added first element check to that and add to the queue and the next elemtnt and common proceed till the common ciondition satsifies if finding anything or the till the end here
    Queue<TreeNode> q = new ArrayDeque<>();
        if(root != null){
            q.offer(root);
        }
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i< size; i++){
                TreeNode current = q.poll();
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            level++;
        }
        return level;
    }
}

package tree;
import java.util.*;
class TreeNode{
    int val = 0;
    TreeNode left = null,right = null;
//    TreeNode(){
//        this.val = 0;
//    }
    TreeNode(int val){
        this.val = val;
    }
}
public class Tree {
    public static void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t = 0;
        TreeNode root = null,temp = null,x = null;
        Queue<TreeNode> queue = new LinkedList<>();
        root = new TreeNode(arr[0]);
        queue.offer(root);
        while(t<n){
            int c = queue.size();
            while(c-- > 0){
                x = queue.poll();
                if(t+1 < n  && x.left == null){
                    x.left = new TreeNode(arr[t+1]);
                }
                if(t+2 < n && x.right == null){
                    x.right = new TreeNode(arr[t+2]);
                }
                t+=2;
                if(x.left != null)
                queue.offer(x.left);
                if(x.right != null)
                queue.offer(x.right);
            }
        }
        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(root);
    }   
}

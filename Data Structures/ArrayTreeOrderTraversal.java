package tree;
import java.util.*;
public class ArrayTreeOrderTraversal {
    public static void preorder(int[] arr,int n,int curr){
        if(curr >= n) return;
        System.out.print(arr[curr]+" ");
        preorder(arr,n,(2*curr)+1);
        preorder(arr,n,(2*curr)+2);
    }
    public static void postorder(int[] arr,int n,int curr){
        if(curr >= n) return;
        postorder(arr,n,(2*curr)+1);
        postorder(arr,n,(2*curr)+2);
        System.out.print(arr[curr]+" ");
    }
    public static void inorder(int[] arr,int n,int curr){
        if(curr >= n) return;
        inorder(arr,n,(2*curr)+1);
        System.out.print(arr[curr]+" ");
        inorder(arr,n,(2*curr)+2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int curr = 0;
        System.out.print("Preorder : ");
        preorder(arr,n,curr);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(arr,n,curr);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(arr,n,curr);
    }   
}

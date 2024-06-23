import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Purpose: Implement a binary search tree
public class BST {
    private Integer val;
    private BST left;
    private BST right;
    private BST root;
    private int size = 0;


    public BST insert(int val){
        boolean isThePlace = false;
        if(root == null){
            root = new BST();
            root.val = val;
            root.left = new BST();
            root.right = new BST();
            this.size++;
            return this;
        }
        else{
            BST temp = root;
            while(!isThePlace){
                if(temp!=null && temp.val!=null && val>=temp.val){
                    temp = temp.right;
                }
                else if(temp!=null && temp.val!=null && val<temp.val){
                    temp = temp.left;
                }
                else{
                    temp.val = val;
                    temp.left = new BST();
                    temp.right = new BST();
                    isThePlace = true;
                }
            }
        }
        return this;
    }

    public void BFS(){
        List<List<Integer>> list = new LinkedList<>();
        Queue<BST> q = new LinkedList<>();
        Queue<BST> tmp = new LinkedList<>();
        q.add(this.root);
        while(q.size()>0){
            BST temp = q.poll();
            if(q.size()>0 && temp.val!=null){
                System.out.print(temp.val+",");
            }
            else if(temp.val!=null){
                System.out.print(temp.val);
            }
            if(temp.left!=null){
                tmp.add(temp.left);
            }
            if(temp.right!=null){
                tmp.add(temp.right);
            }
            if(q.size()<=0){
                while(tmp.size()>0){
                    q.add(tmp.poll());
                }
                System.out.println();
            }
        }
    }


}

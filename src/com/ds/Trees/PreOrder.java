package com.ds.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

    public void preOrderUsingRecusrion(BinaryTreeNode root){
        if(root!=null){
            System.out.print(root.data);
            preOrderUsingRecusrion(root.left);
            preOrderUsingRecusrion(root.right);
        }
    }

    public void inOrderusingRecusrsion(BinaryTreeNode root){
        if(root!=null){
            inOrderusingRecusrsion(root.left);
            System.out.print(root.data);
            inOrderusingRecusrsion(root.right);
        }
    }
    public List<Integer> preOrderIterative(BinaryTreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            BinaryTreeNode tmp = s.pop();
            res.add(tmp.getData());
            if(tmp.right!=null){
                s.push(tmp.right);
            }
            if(tmp.left!=null){
                s.push(tmp.left);
            }
        }
        return res;
    }

    public List<Integer> inOrderIterative(BinaryTreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> s = new Stack<>();
        BinaryTreeNode current = root;
        boolean done= false;
        while(!done){
            if(current!=null){
                s.push(current);
                current = current.left;
            }else{
                if(s.empty()){
                    done=true;
                }else{
                    BinaryTreeNode node = s.pop();
                    list.add(node.data);
                    current = current.right;
                }
            }
        }
        return list;
    }

    public List<Integer> postOrderIterative(BinaryTreeNode root){
        if(root==null)
        { return  null;
        }
        Stack<BinaryTreeNode> s1 = new Stack<>();
        Stack<BinaryTreeNode> s2 = new Stack<>();
        List<Integer> res = new ArrayList<>();
        s1.push(root);
        BinaryTreeNode node=null;
        while(!s1.isEmpty()){
            node = s1.pop();
            s2.push(node);
            if(node.left!=null){
                s1.push(node.left);
            }
            if(node.right!=null){
                s1.push(node.right);
            }
        }
        while(!s2.isEmpty()){
            BinaryTreeNode node1  = s2.pop();
            res.add(node1.data);
        }
        return res;
    }

    public BinaryTreeNode constructBST(BinaryTreeNode root , int ele){
        if(root!=null){
            return root = new BinaryTreeNode(ele);
        }
        if(root.data>ele){
            constructBST(root.left, ele);
        }else{
            constructBST(root.right, ele);
        }
        return root;
    }



    public int KthSmallElement(BinaryTreeNode root , int k){
        // First way using iterative methodlogy
        // In order traversal and store all in a lst and then search k-1 in a list will give you

        // other way of doing is using recursion
        return solve(root, k);
    }
    public static int solve(BinaryTreeNode root, int k){
        if(root==null){
            return 0;
        }
        int left = solve(root.left, k);
        if(left>0){
            return left;
        }
        k=k-1;
        if(k==0){
            return root.data;
        }
        int right = solve(root.right,k);
        return right;
    }


     public int maxInBinary(BinaryTreeNode root){
         int max = Integer.MAX_VALUE;
        if(root!=null){
            int leftMax = maxInBinary(root.left);
            int rightMax = maxInBinary(root.right);
            if(leftMax > rightMax){
                max = leftMax;
            }else{
                max = rightMax;
            }
            if(root.data>max){
                max = root.data;
            }
        }
        return  max;
     }




}

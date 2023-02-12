package dataStructure.binaryTree;

import java.util.HashSet;
import java.util.Set;

public class BST {


    private Node createNode(int data) {
        return new Node(data);
    }

    public Node add(Node node, int data) {

        if (node == null) {
            return createNode(data);
        } else {
            if (data < node.data) {
                node.left = add(node.left, data);
            } else {
                node.right = add(node.right, data);
            }
        }

        return node;
    }


    public Node delete(Node node, int value) {

        if (node == null) {
            return null;
        }
        if (value < node.data) {
            node.left = delete(node.left, value);
        } else if (value > node.data) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null || node.right == null) {
                Node tmp = null;
                tmp = node.left == null ? node.right : node.left;

                if (tmp == null) {
                    return null;
                } else {
                    return tmp;
                }

            } else {

                Node succesor = getSuccesor(node);
            }

        }

        return node;

    }

    private Node getSuccesor(Node node) {
        if (node == null)
            return null;
        Node temp = node.right;
        while (temp != null) {
            temp = temp.left;
        }

        return temp;

    }

    public void inOrder(Node node) {

        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " , ");
        inOrder(node.right);
    }


    public void preOrder(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.data + " , ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {

        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data + " , ");
    }

    public boolean ifExist(Node node, int val) {

        boolean ifpresent = false;

        if (node == null)
            return ifpresent;

        while (node != null) {

            if (val < node.data)
                node = node.left;
            else if (val > node.data)
                node = node.right;
            else {
                if (val == node.data) {
                    ifpresent = true;
                    break;
                } else
                    return false;
            }

        }
        return ifpresent;

    }


    public Node getParentNode(Node node, int val) {

        if (node == null) {
            return null;
        }

        Node parentNode = null;

        while (node != null) {

            if (val < node.data) {
                parentNode = node;
                node = node.left;
            } else if (val > node.data) {
                parentNode = node;
                node = node.right;
            } else {
                break;
            }

        }

        return node != null ? parentNode : null;

    }

    public Node getSiblingNode(Node node, int val) {

        if (node == null || node.data == val) {
            return null;
        }

        Node parentNode = null;

        while (node != null) {

            if (val < node.data) {
                parentNode = node;
                node = node.left;
            } else if (val > node.data) {
                parentNode = node;
                node = node.right;
            } else {
                break;
            }

        }

        if (parentNode.left != null && val == parentNode.left.data) {
            return node != null ? parentNode.right : null;
        } else if (parentNode.right != null && val == parentNode.right.data) {
            return node != null ? parentNode.left : null;
        } else
            return null;


    }

    public Node inOrderSuccessor(Node node, int k) {

        if (node == null)
            return null;


        while (node != null) {

            if (k < node.data) {
                node = node.left;

            } else if (k > node.data) {
                node = node.right;
            } else if (node.data == k) {
                break;
            } else
                return null;
        }

        if (node != null && node.right != null)
            return node.right;
        else
            return null;

    }


    public int getDifferenceOfOddANdEven(Node node) {

        if (node == null)
            return 0;

        return node.data - getDifferenceOfOddANdEven(node.left) - getDifferenceOfOddANdEven(node.right);


    }

    public int getMaxValueNode(Node node) {

        if (node == null)
            return 0;

        while (node.right != null) {
            node = node.right;
        }
        return node.data;

    }

    public int getMinValueNode(Node node) {

        if (node == null)
            return 0;

        while (node.left != null) {
            node = node.left;
        }
        return node.data;

    }


    public boolean checkIfPairExist(Node node, int k){

        Set<Integer> set = new HashSet<>();

        return checkIdSumPairExist(node,k,set);

    }
    public boolean checkIdSumPairExist(Node node, int k , Set<Integer> set) {

        if (node == null)
            return false;


        if (set.contains(k - node.data)) {
            System.out.println("Pair Exist and is "+ (k-node.data) + " and " + node.data);
            return true;
        }
        set.add(node.data);

        if(checkIdSumPairExist(node.left, k,set)) {
            return true;
        }

        return checkIdSumPairExist(node.right , k,set);



    }


   static int count = 0;
    public Node findKthSmallestNumber(Node node, int k){

        if(node == null)
                return null ;



        Node left = findKthSmallestNumber(node.left,k);

        if(left != null){
            return left;
        }
        count++;

        if(count ==k){
            return node;
        }

        return findKthSmallestNumber(node.right,k);


    }

    static int largeCount;
    public Node findKthLargest(Node node ,int k){

        if(node == null)
                    return null;

        Node right = findKthLargest(node.right,k);

        if(right != null)
                return right;

        largeCount++;

        if(largeCount == k)
                return node;


        return findKthLargest(node.left,k);



    }


    public int depth(Node node){

        if (node == null){
            return 0;
        }

       int  leftheight = depth(node.left);
       int rightheight = depth(node.right);


        return Math.max(leftheight +1,rightheight+1);

    }


}

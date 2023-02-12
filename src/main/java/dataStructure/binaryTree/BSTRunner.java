package dataStructure.binaryTree;

import java.util.HashSet;

public class BSTRunner {

    public static void main(String[] args) {

        BST bst = new BST();

        Node node = null;
        node = bst.add( node ,8);
        node = bst.add( node ,3);
        node = bst.add( node ,6);
        node = bst.add( node ,10);
        node = bst.add( node ,4);
        node = bst.add( node ,7);
        node = bst.add( node ,1);
        node = bst.add( node ,14);
        node = bst.add( node ,13);


        bst.inOrder(node);

        System.out.println("=========================preOder============");
        bst.preOrder(node);

        System.out.println("=========================PostOrder============");
        bst.postOrder(node);

        boolean ifExist = bst.ifExist(node ,4);
        if(ifExist){
            System.out.println("value Exist");
        }else {
            System.out.println(" Not Exist");
        }

        Node node1 =  bst.getParentNode(node,8);
        if(node1 != null){
            System.out.println("Parent node of 4 is " +node1.data);
        }else
            System.out.println("Parent Node Does Not exist");



        Node node2 =  bst.getSiblingNode(node,8);
        if(node2 != null){
            System.out.println("Sibling node of 3 is " +node2.data);
        }else
            System.out.println("Sibling  Node Does Not exist");



        Node node3 = bst.inOrderSuccessor(node,6);

        if(node3 != null){
            System.out.println("in Oreder Successor of 3 is" +node3.data);
        }else
            System.out.println("in Oreder Successor of 3   Node Does Not exist");


        int diff = bst.getDifferenceOfOddANdEven(node);
        System.out.println("DIfference between levels " +diff);

        int max = bst.getMaxValueNode(node);
        System.out.println("Max Value of node is  " +max);

        int min = bst.getMinValueNode(node);
        System.out.println("Min Value of node is  " +min);

       boolean isPresent = bst.checkIdSumPairExist(node,15,new HashSet<>());
       if(isPresent)
           System.out.println("Pair Exist");
       else System.out.println("Pait not exist");


       Node node4 = bst.findKthSmallestNumber(node,4);

        System.out.println("4 th smallest Node is "+ node4.data);


        System.out.println("depth of tree is " + bst.depth(node));

    }
}

package treestructre;

public class BST {

    public Node createNewNode(int k){
        Node node = new Node();
        node.data=k;
        node.left=null;
        node.right=null;
        return node;
    }

    public Node insert(Node node, int k){
        if (node==null){
            return  createNewNode(k);
        }
        if(k<node.data){
            node.left = insert(node.left,k);
        }
        else
            if(k>node.data){
                node.right=insert(node.right,k);
            }
        return node;
    }

    public void findmax() {

        Node node=new Node();

    }
}

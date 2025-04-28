public class MorseTree {
    private TreeNode<Character> tree;

    public MorseTree(){
        tree = new TreeNode<Character>(null);
    }

    public void insertLeft(Character c){
        tree.insertLeft(c);
    }

    public void insertRight(Character c){
        tree.insertRight(c);
    }

    public String preOrder(){
        String prOrder = "";
        prOrder = preOrderMaker(this.tree, prOrder);
        return prOrder;
    }

    private String preOrderMaker(TreeNode<Character> node, String s){
        if(node == null){
            return s;
        }
        if (node.getElement() != null) {
            s += node.getElement() + " ";
        }
        s = preOrderMaker(node.getLeft(), s);
        s = preOrderMaker(node.getRight(), s);
        return s;
    }

    public String postOrder(){
        String pstOrder = "";
        pstOrder = postOrderMaker(this.tree, pstOrder);
        return pstOrder;
    }

    private String postOrderMaker(TreeNode<Character> node, String s){
        if(node == null){
            return s;
        }
        s = postOrderMaker(node.getLeft(), s);
        s = postOrderMaker(node.getRight(), s);
        if (node.getElement() != null) {
            s += node.getElement() + " ";
        }
        return s;
    }
}

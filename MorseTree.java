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

    public String engToMorese(String s){
        String str = "";
        for(int i=0;i<s.length();i++){
            str = engToMorseMaker(s.charAt(i)) + "|";
        }
        return str;
    }

    public String engToMorseMaker(Character s){
        if(tree.getLeft().isIn(s)){
            return engToMorseMaker(s) + "-";
        } else if(tree.getRight().isIn(s)){
            return engToMorseMaker(s) + "o";
        } else {
            return "-";
        }
    }
}

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

    public TreeNode<Character> getLeft(){
        return tree.getLeft();
    }

    public TreeNode<Character> getRight(){
        return tree.getRight();
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

    public String engToMorse(String target){
        String s = target.toLowerCase();
        String str = "";
        for(int i=0;i<s.length();i++){
            String letter = engToMorseMaker(this.tree, s.charAt(i));
            if(letter != "") str += letter + "|";
        }
        return str;
    }

    private String engToMorseMaker(TreeNode<Character> node, Character s){
        if(node.getLeft() != null && node.getLeft().isIn(s)){
            return "o" + engToMorseMaker(node.getLeft(), s);
        } else if(node.getRight() != null && node.getRight().isIn(s)){
            return "-" + engToMorseMaker(node.getRight(), s);
        } else {
            return "";
        }
    }

    public String morseToEng(String target){
        String str = "";
        for(int i=0;i<target.length();i++){
            TreeNode<Character> node = this.tree;
            while(target.charAt(i) != '|'){
                node = morseToEngMaker(node, target.charAt(i));
                i++;
            }
            str += node.getElement();
        }
        return str;
    }

    private TreeNode<Character> morseToEngMaker(TreeNode<Character> node, Character s){
        if(s == 'o') return node.getLeft();
        else return node.getRight();
    }
}

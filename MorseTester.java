public class MorseTester {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();

        // setting up the morse tree nodes
        // I know that this is very ineficient, but I thought it would be good practice to better understand how trees are organized and acessed
        tree.insertLeft('e'); // o
        tree.getLeft().insertLeft('i'); // oo
        tree.getLeft().getLeft().insertLeft('s'); // ooo
        tree.getLeft().getLeft().getLeft().insertLeft('h'); // oooo
        tree.getLeft().getLeft().getLeft().insertRight('v'); // ooo-
        tree.getLeft().getLeft().insertRight('u'); // oo-
        tree.getLeft().getLeft().getRight().insertLeft('f'); // oo-o
        tree.getLeft().insertRight('a'); // o-
        tree.getLeft().getRight().insertLeft('r'); // o-o
        tree.getLeft().getRight().getLeft().insertLeft('l'); // o-oo
        tree.getLeft().getRight().insertRight('m'); // o--
        tree.getLeft().getRight().getRight().insertLeft('p'); // o--o
        tree.getLeft().getRight().getRight().insertRight('j'); // o---
        
        tree.insertRight('t'); // -
        tree.getRight().insertLeft('n'); // -o
        tree.getRight().getLeft().insertLeft('d'); // -oo
        tree.getRight().getLeft().getLeft().insertLeft('b'); // -ooo
        tree.getRight().getLeft().getLeft().insertRight('x'); // -oo-
        tree.getRight().getLeft().insertRight('k'); // -o-
        tree.getRight().getLeft().getRight().insertLeft('c'); // -o-o
        tree.getRight().getLeft().getRight().insertRight('y'); // -o--
        tree.getRight().insertRight('m'); // --
        tree.getRight().getRight().insertLeft('g'); // --o
        tree.getRight().getRight().getLeft().insertLeft('z'); // --oo
        tree.getRight().getRight().getLeft().insertRight('q'); // --o-
        tree.getRight().getRight().insertRight('o'); // ---

        System.out.println(tree.preOrder());
        System.out.println(tree.postOrder());
        System.out.println("finished");
    }
}

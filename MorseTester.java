public class MorseTester {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();

        tree.insertLeft('A');
        tree.insertRight('B');
        System.out.println(tree.preOrder());
        System.out.println(tree.postOrder());
        System.out.println("finished");
    }
}

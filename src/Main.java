import binary.BinarySearch;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.addNode(50, "Boss");
        binarySearch.addNode(25, "Vice Pres");
        binarySearch.addNode(15, "Office Manager");
        binarySearch.addNode(30, "Secretary");
        binarySearch.addNode(75, "Sales Manager");
        binarySearch.addNode(85, "Salesman1");

        binarySearch.inOrderTraverseTree(binarySearch.root);
        System.out.println();
        binarySearch.preOrderTraverseTree(binarySearch.root);
        System.out.println();
        binarySearch.postOrderTraverseTree(binarySearch.root);
        System.out.println();
        System.out.println(binarySearch.findNode(50));
    }
}

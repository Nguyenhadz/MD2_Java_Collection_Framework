package HashMap_LinkedHashMap_TreeMap;

class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
    public boolean search(Integer element, TreeNode<Integer> root) {
        TreeNode<Integer> current = root;
        while (current != null) {
            if (element < current.element) {
                current = current.left;
            } else if (element > current.element) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode<Integer> tree = new TreeNode<>(60);
        tree.right = new TreeNode<>(100);
        tree.left = new TreeNode<>(55);

        boolean result = tree.search(100, tree);

        if (result) {
            System.out.println(" found in the tree.");
        } else {
            System.out.println(" not found in the tree.");
        }
    }



}




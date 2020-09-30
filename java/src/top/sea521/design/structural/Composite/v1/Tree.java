package top.sea521.design.structural.Composite.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/1 0001 17:23
 */
public class Tree {
    private TreeNode root = null;


    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        // 1 为treenode赋值：实列话；
        Tree tree = new Tree("A");
        // 2 实列treenode对象
        TreeNode nodeB = new TreeNode("B");
        // 3 实列treenode对象
        TreeNode nodeC = new TreeNode("C");
        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
        System.out.println(tree);
        // 树形结构！！！
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}

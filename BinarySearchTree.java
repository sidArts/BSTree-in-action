class TreeNode {
	private TreeNode left;
	private int data;
	private TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public TreeNode(TreeNode left, int data, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return this.left;
	}

	public TreeNode getRight() {
		return this.right;
	}

	public int getData() {
		return this.data;
	}

	public String toString() {
		return "[ left = "+ left +", data = "+ data +", right = "+ right +" ]";
	}

}


public class BinarySearchTree {
	public static void main(String[] args) {
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(7);
		TreeNode root = new TreeNode(left, 5, right);
		System.out.println(root);
	}
}
package src.learn.java;
class Link{
	class Node{
		private String name ;
		private Node next ;
		public Node(String name){
			this.name = name ;
		}
		public void addNode(Node newNode){
			if(this.next == null){
				this.next = newNode ;
			}else {
				this.next.addNode(newNode);
			}
		}
		public void printNode(){
			System.out.println(this.name);
			
		}
	}
	private Node root ; 
	public void add(String name){
		Node newNode = new Node(name);
		if(this.root == null){
			this.root = newNode ; 
		}else{
			this.root.addNode(newNode);
		}
	}
	public void print(){
		if(this.root!=null){
			this.root.printNode();
		}
	}
}
public class LinkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

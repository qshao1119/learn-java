package learn.java;
class Link{
	class Node{
		private String name ;//node name
		private Node next ;// next node
		public Node(String name){
			this.name = name ;
		}
		public String getName(){
			return this.name;
		}
		public void setNext(Node next){
			this.next = next ;
		}
		public Node getNext(){
			return this.next ;
		}
		public void addNode(Node newNode){
			if(this.next == null){
				this.next = newNode ;
			}else{
				this.next.addNode(newNode);
			}
		}
		public void printNode(){
			System.out.print(this.name + " --> ") ;
		}
	}
	private Node root ; // root node
	public void add(String name){
		Node newNode = new Node(name) ; // creat new node
	
		if(this.root == null){// no root node
			this.root = newNode ;
		}else {
			this.root.addNode(newNode);
		}
	}
}


public class NodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link.Node root = new Link.Node("root");
        Link.Node n1 = new Link.Node("First");
        Link.Node n2 = new Link.Node("Second");
        Link.Node n3 = new Link.Node("Third");
        Link.Node n4 = new Link.Node("Fourth");
		
		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		print(root);
	}
	
	public static void print(Node node){
		if(node!=null){
			System.out.print(node.getName() + " --> ");
		}
		if(node.getNext()!=null){
		print(node.getNext());
		}

	}
}
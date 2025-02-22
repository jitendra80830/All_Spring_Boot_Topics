package linkedlist;

public class LinkedList {

	public class Node {
		int data;
		Node next;
		//Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	public void addBeg(int item) {
		Node nd = new Node(item);
		if (head == null) {
			head = nd;
		} else {
			nd.next = head;
			head = nd;
		}
	}

	public void addLast(int item) {
		Node nd = new Node(item);
		Node temp = head;
		if (head == null) {
			head = nd;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nd;
		}

	}

	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void reverse() {
		Node prev = null;
		Node curr = this.head;
		while (curr != null) {
			Node nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		this.head = prev;

	}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();

		obj.addLast(10);
		obj.addLast(9);
		obj.addLast(4);
		obj.addLast(8);
		obj.addLast(0);
		obj.addLast(5);

		obj.addBeg(1);
		obj.addLast(4);
		obj.addBeg(17);
		obj.print();
		obj.reverse();
		System.out.println();
		obj.print();

	}

}

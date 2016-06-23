package workoutPkg;

public class ReverseLinkedList {
	node linkedLstHead = null;
	node endNode = null;
	
	void put(int val) {
		node nd = new node(val);
		nd.next = null;
		
		if (linkedLstHead == null) {
			linkedLstHead = nd;
		} else {
			endNode.next = nd;
		}
		endNode = nd;
	}
	
	// Iterative method
	static node reverseLst(node linkedLstNd) {
		node next;
		node prev = null;
		
		if (linkedLstNd == null) {
			return null;
		}
		
		if (linkedLstNd.next == null) {
			return linkedLstNd;
		}
		node nd = linkedLstNd;
		while (nd != null) {
			next = nd.next;
			nd.next = prev;
			prev = nd;
			nd = next;
		}
		return prev;
	}
	
	//recursive method of reversing
	void recursiveReversal(node linkedLstNd, node prev) {
		if (linkedLstNd.next == null) {
			linkedLstNd.next = prev;
			this.linkedLstHead = linkedLstNd;
			return;
		}
		node next = linkedLstNd.next;
		linkedLstNd.next = prev;
		recursiveReversal(next, linkedLstNd);
		return;
	}
	
	void printLinkedLst() {
		if (this.linkedLstHead == null) {
			System.out.println("List is empty");
		} else if (this.linkedLstHead.next == null) {
			System.out.println("List had single element");
			System.out.println(linkedLstHead.data);
		} else {
			node nd = this.linkedLstHead;
			while(nd != null) {
				System.out.println("Value of node " + nd.data);
				nd = nd.next;
			}
		}
	}
	
	class node {
		private int data;
		node next;
		
		node(int value) {
			data = value;
		}
	}

	public static void main(String[] args) {

		// construct a linked list
		ReverseLinkedList revLst = new ReverseLinkedList();
		revLst.put(1);
		revLst.put(2);
		revLst.put(3);
		revLst.put(4);
		
		System.out.println("Before reversal");
		revLst.printLinkedLst();
		// reverse list
		revLst.linkedLstHead = ReverseLinkedList.reverseLst(revLst.linkedLstHead);
		System.out.println("After reversal");
		revLst.printLinkedLst();
		System.out.println("Using recursive method");
		revLst.recursiveReversal(revLst.linkedLstHead, null);
		revLst.printLinkedLst();
		Double d = 1.0/0.0;
		System.out.println("value : " + d);
		
	}

}

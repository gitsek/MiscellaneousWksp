package workoutPkg;

import java.util.Iterator;
import java.util.LinkedList;

public class ProbLinkedLstMerge {
	LinkedList<LinkNode> linkList1;
	LinkedList<LinkNode> linkList2;
	
	void populateLinkedLists() {
		LinkNode nd1 = new LinkNode(1);
		LinkNode nd2 = new LinkNode(2);
		LinkNode nd3 = new LinkNode(3);
		LinkNode nd4 = new LinkNode(4);
		LinkNode nd5 = new LinkNode(5);
		LinkNode nd6 = new LinkNode(6);
		LinkNode nd7 = new LinkNode(7);
		LinkNode nd8 = new LinkNode(8);
		linkList1 = new LinkedList<LinkNode>();
		linkList2 = new LinkedList<LinkNode>();
		linkList1.add(nd1);
		linkList1.add(nd2);
		linkList1.add(nd3);
		linkList1.add(nd4);
		linkList1.add(nd5);

		linkList2.add(nd6);
		linkList2.add(nd7);
		linkList2.add(nd4);
		linkList2.add(nd8);

		System.out.println("Linked List 1 : " + linkList1);
		System.out.println("Linked List 2 : " + linkList2);
	}
	
	void findMergePoint() {
		linkList1.addAll(linkList2);
		System.out.println(linkList1);
		
		// Check for Loop in LinkList1 after appending linkList2 to linkList1
		Iterator<LinkNode> it1 = linkList1.iterator();
		Iterator<LinkNode> it2 = linkList1.iterator();
		
		LinkNode NodeS = it1.next();
		LinkNode NodeF = it2.next();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}		
	}

	public static void main(String[] args) {
		ProbLinkedLstMerge pListObj = new ProbLinkedLstMerge();
		pListObj.populateLinkedLists();
		pListObj.findMergePoint();
	}

}

class LinkNode {
	int index;
	
	LinkNode(int i) {
		index = i;
	}
}

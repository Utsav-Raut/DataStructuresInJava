package linked_list;

import linked_list.LengthSingleLL_3.ListNode;

public class InsertNodeAtAGivenPosition_7 {

	static class ListNode {
		 private int data;
		 private ListNode next;
		 
		 ListNode(int data) {
			 this.data = data;
			 this.next = null;
		 }
	 }
	
	public void displayData(ListNode node) {
		 if(node == null) {
			 return;
		 }
		 
		 ListNode current = node;
		 
//		 loop each element in the linked list till end
//		 last node points to null
		 
		 while(current != null) {
			 System.out.print(current.data + " --> ");		// print current element's data
//			 move to next element
			 current = current.next;
		 }
		 System.out.println(current);						// here current will be null
	 }
	
	public int length(ListNode head) {
		if(head == null) {
			return 0;
		}
		
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count ++;
			current = current.next;
		}
		return count;
	}
	
	public ListNode insertAtPosition(ListNode head, int data, int position) {
		
		int size = length(head);
		if(position > size + 1 || position < 1) {
			System.out.println("Invalid position");
			return head;
		}
		
		ListNode newNode = new ListNode(data);
		if(position == 1) {
			newNode.next = head;
			return newNode;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count ++;
			}
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
			return head;
		}
		
	}
	public static void main(String[] args) {
		
		 ListNode head = new ListNode(10);
		 ListNode second = new ListNode(8);
		 ListNode third = new ListNode(1);
		 ListNode fourth = new ListNode(11);
		 
		 head.next = second;
		 second.next = third;
		 third.next = fourth;

		 InsertNodeAtAGivenPosition_7 node = new InsertNodeAtAGivenPosition_7();
		 node.displayData(head);
		 head = node.insertAtPosition(head, 15, 1);
		 node.displayData(head);

	}

}

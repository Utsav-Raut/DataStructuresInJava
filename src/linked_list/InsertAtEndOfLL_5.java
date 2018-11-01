package linked_list;

public class InsertAtEndOfLL_5 {

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
	
	public ListNode insertAtBeginning(ListNode head, int data) {
		
		ListNode newNode = new ListNode(data);
		if(head == null) {
			return newNode;
		}
		
		newNode.next = head;
		head = newNode;
		return head;			// This head will be new head, having new node at the beginning.			
	}
	
	public ListNode insertAtEnd(ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			return newNode;
		}
		
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return head;
	}
	
	public static void main(String[] args) {
	
		 ListNode head = new ListNode(10);
		 ListNode second = new ListNode(8);
		 ListNode third = new ListNode(1);
		 ListNode fourth = new ListNode(11);
		 
		 head.next = second;
		 second.next = third;
		 third.next = fourth;

		 InsertAtEndOfLL_5 node = new InsertAtEndOfLL_5();
		 node.displayData(head);
		 ListNode newHead = node.insertAtEnd(head, 15);
		 node.displayData(newHead);
		 
		 

	}

}

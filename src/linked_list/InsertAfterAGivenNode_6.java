package linked_list;

public class InsertAfterAGivenNode_6 {

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
	
	public void insertAfter(ListNode previous, int data) {
		if(previous == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		
		ListNode newNode = new ListNode(data);
		newNode.next = previous.next;
		previous.next = newNode;
	}
	
	public static void main(String[] args) {
		
		 ListNode head = new ListNode(10);
		 ListNode second = new ListNode(8);
		 ListNode third = new ListNode(1);
		 ListNode fourth = new ListNode(11);
		 
		 head.next = second;
		 second.next = third;
		 third.next = fourth;

		 InsertAfterAGivenNode_6 node = new InsertAfterAGivenNode_6();
		 node.displayData(head);
		 node.insertAfter(second, 15);
		 node.displayData(head);

	}

}

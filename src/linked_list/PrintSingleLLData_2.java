package linked_list;

public class PrintSingleLLData_2 {
	
	private ListNode head; 		//Head node to hold the list 
	
	static class ListNode {
		 private int data;
		 private ListNode next;
		 
		 ListNode(int data) {
			 this.data = data;
			 this.next = null;
		 }
	 }
	 
//	 Given a ListNode, print all elements it holds
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
	 
	 public static void main(String[] args) {
		 ListNode head = new ListNode(10);
		 ListNode second = new ListNode(8);
		 ListNode third = new ListNode(1);
		 ListNode fourth = new ListNode(11);
		 
		 head.next = second;
		 second.next = third;
		 third.next = fourth;
		 
		 PrintSingleLLData_2 link = new PrintSingleLLData_2();
		 link.displayData(head);
	 }

}


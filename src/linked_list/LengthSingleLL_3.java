package linked_list;

public class LengthSingleLL_3 { 
	
	static class ListNode {
		 private int data;
		 private ListNode next;
		 
		 ListNode(int data) {
			 this.data = data;
			 this.next = null;
		 }
	 }

//	Given a ListNode head, find out the length of the linked list
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
	
	public static void main(String[] args) {
		
		 ListNode head = new ListNode(10);
		 ListNode second = new ListNode(8);
		 ListNode third = new ListNode(1);
		 ListNode fourth = new ListNode(11);
		 
		 head.next = second;
		 second.next = third;
		 third.next = fourth;
		 
		 LengthSingleLL_3 node = new LengthSingleLL_3();
		 System.out.println("Length of the linked list is: " + node.length(head));

	}

}

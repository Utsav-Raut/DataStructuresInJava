package linked_list;

public class SinglyLinkedList_1 {

	private ListNode head; 		//Head node to hold the list
	
	// It contains a static inner class ListNode
	static class ListNode {
		private int data;
		private ListNode next;
		
		ListNode(int data) {
			this.data=data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
	
//		let's create a linked list as:
//		10 --> 8 --> 1 --> 11 --> null
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
//		At this point all the nodes point to null
		
		
		head.next = second; 	// 10 --> 8
		second.next = third;	// 10 --> 8 --> 1
		third.next = fourth;	// 10 --> 8 --> 1 --> 11 --> null
	}

}

package com.app.poc.test.interview.questions;

public class AddTwoNumbersLinkedList {

	public static void main(String[] args) {

	}

	/*public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	} */
	
	public class ListNode {
		
		int val;
		ListNode next;
		public ListNode() {
			
		}
		
		public ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			
			this.val = val;
			this.next = next;
			
		}
		
	}

	/*
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode();
		ListNode first = l1;
		ListNode second = l2;
		int divider = 0;
		int remainder = 0;
		ListNode response = result;
		while (first != null || second != null) {
			int firstValue = (first != null) ? first.val : 0;
			int secondValue = (second != null) ? second.val : 0;

			int sum = firstValue + secondValue + divider;
			divider = sum / 10;
			remainder = sum % 10;
			response.next = new ListNode(remainder);
			response = response.next;
			if (first != null)
				first = first.next;
			if (second != null)
				second = second.next;
		}

		if (divider > 0) {
			response.next = new ListNode(divider);
		}

		return result.next;
	}*/
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode first = l1;
		ListNode second = l2;
		
		ListNode result = new ListNode();
		
		int divider = 0;
		int remainder = 0;
		
		ListNode response = result;
		
		while(first !=null || second != null) {
			
			
			int firstValue = first !=null ? first.val : 0;
			int secondValue = second !=null ? second.val:0;
			
			int sum = firstValue+secondValue+divider;
			
			divider = sum/10;
			remainder = sum%10;
			
			response.next = new ListNode(remainder);
			
			response = response.next;
			
			if(first !=null)
				first = first.next;
			
			if(second !=null)
				second = second.next;
			
			
		}
		
		if(divider > 0)
			response.next = new ListNode(divider);
		
		return result.next;
	}
}
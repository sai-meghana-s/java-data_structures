package dsa;

class Node{
	int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
		    Node head = null;
		    
		 // Insert at beginning
		    public void insertAtBeginning(int value) {
		        Node newNode = new Node(value);
		        if (head == null) {
		            head = newNode;
		            return;
		        }
		        newNode.next = head;
		        head = newNode;
		    }
		    
		    // Insert at end
		    public void insertAtEnd(int value) {
		    	if (head == null) {
			      	insertAtBeginning(value);
			        return;
			    }
		        Node newNode = new Node(value);
		        Node current = head;
		        while (current.next != null) {
		            current = current.next;
		        }
		        current.next = newNode;
		    }

		 // Insert at position (0-based)
		    public void insertAtPosition(int value, int position) {
		        if (position < 0) {
		            System.out.println("Invalid position");
		            return;
		        }
		        if (position == 0) {
		            insertAtBeginning(value);
		            return;
		        }

		        Node newNode = new Node(value);
		        Node current = head;

		        for (int i = 0; current != null && i < position - 1; i++)
		            current = current.next;

		        if (current == null) {
		            System.out.println("Position out of bounds");
		            return;
		        }

		        newNode.next = current.next;
		        current.next = newNode;
		    }

		    // Delete at beginning
		    public void deleteAtBeginning() {
		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }
		        head = head.next;
		    }

		    // Delete at end
		    public void deleteAtEnd() {
		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }
		        if (head.next == null) {
		            head = null;
		            return;
		        }

		        Node current = head;
		        while (current.next.next != null)
		            current = current.next;

		        current.next = null;
		    }

		    // Delete at position (0-based)
		    public void deleteAtPosition(int position) {
		        if (position < 0 || head == null) {
		            System.out.println("Invalid position or list is empty");
		            return;
		        }

		        if (position == 0) {
		            deleteAtBeginning();
		            return;
		        }

		        Node current = head;
		        for (int i = 0; current != null && i < position - 1; i++)
		            current = current.next;

		        if (current == null || current.next == null) {
		            System.out.println("Position out of bounds");
		            return;
		        }

		        current.next = current.next.next;
		    }
		    // Delete by value
		    public void deleteByValue(int value) {
		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }

		        if (head.data == value) {
		            head = head.next;
		            return;
		        }

		        Node current = head;
		        while (current.next != null && current.next.data != value) {
		            current = current.next;
		        }

		        if (current.next == null) {
		            System.out.println("Value " + value + " not found in the list.");
		        } else {
		            current.next = current.next.next;
		        }
		    }


		    // Display list
		    public void display() {
		        Node current = head;
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }
		    
		    // Calculate size
		    public int size() {
		        int count = 0;
		        Node current = head;
		        while (current != null) {
		            count++;
		            current = current.next;
		        }
		        return count;
		    }

		    // Search value
		    public boolean search(int value) {
		        Node current = head;
		        while (current != null) {
		            if (current.data == value)
		                return true;
		            current = current.next;
		        }
		        return false;
		    }
}

// A LinkedList class that you can reference for help.
public class LinkedList {

	private Node first;
	
	public void addFirst(int key) {
		
		Node nodeToInsert = new Node();
		nodeToInsert.key = key;
		
		nodeToInsert.next = first;
		first = nodeToInsert;
	}
	
	public void deleteFirst() {
		if (first == null) return;
		first = first.next;
	}
	
	public Node find(int key) {
		
		Node currentNode = first;
		
		while( currentNode != null ) {
			
			if (currentNode.key == key) {
				return currentNode;
			}

			currentNode = currentNode.next;
		}
		
		return null;
	}
	
	public boolean delete(int key) {
		
		Node currentNode = first;
		Node previousNode = null;
		
		while( currentNode != null ) {
			
			if (currentNode.key == key) {
				previousNode.next = currentNode.next;
				return true;
			}

			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		
		return false;
	}
	
	public String toString() {
		
		StringBuilder ret = new StringBuilder();
		
		if (first == null)
			return "null";
		
		Node currentNode = first;
		
		while (currentNode != null)
		{
			ret.append(currentNode.key + " -> ");
			currentNode = currentNode.next;
		}
		ret.append("null");
		return ret.toString();
	}
	
	
	
	
}

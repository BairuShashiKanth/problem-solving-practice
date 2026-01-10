class MyLinkedList {

    static private class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    Node head,tail;
    int size;
    
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        
        if(index<0 || index>=size)
            return -1;

        Node temp = head;

        for(int i=0;i<index;i++)
            temp = temp.next;
        
        return temp.val;
    }
    
    public Node getNodeAtIndex(int index) {
        
        if(index<0 || index>=size)
            return null;

        Node temp = head;

        for(int i=0;i<index;i++)
            temp = temp.next;
        
        return temp;
    }

    public void addAtHead(int val) {
    
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(size == 0)
            tail = head;
        size++;

    }
    
    public void addAtTail(int val) {
        if(size == 0) 
        {
            addAtHead(val);
        }
        else 
        {
            tail.next = new Node(val);
            tail = tail.next;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {

        if(index < 0 || index > size)  return;
 
        else if(index == 0) {
            addAtHead(val);
        }
        else if(index == size)
        {
            addAtTail(val);
        }
        else {
            Node newNode = new Node(val);
            Node prevNode = getNodeAtIndex(index-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)  return;
        else if (size == 1){
            head = null;
            tail = null;
        }
        else if(index == 0){
             head = head.next;
        }
        else if (index == size -1) 
        {
            Node prevNode = getNodeAtIndex(index-1);
            prevNode.next = null;
            tail = prevNode;
        }
        else {
            Node prevNode = getNodeAtIndex(index-1);
            prevNode.next = prevNode.next.next;
        }
        
        size--;
    }
}
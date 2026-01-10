
class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null; 
    }
    
}

class MyLinkedList {

    Node head;
    int size = 0;
    
    public MyLinkedList() {
    }
    
    public int get(int index) {
        Node temp = head;
        if(index>=size)
            return -1;
            
        for(int i=0;i<index;i++)
            temp = temp.next;
        
        if(temp != null)
            return temp.val;
        else 
            return -1;
    }
    
    public void addAtHead(int val) {
    
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;

    }
    
    public void addAtTail(int val) {
        size++;
        Node temp = head;
        if(temp == null) 
        {
            addAtHead(val);
            return;
        }

        
        while(temp.next != null){
           
            temp = temp.next;
        }
        temp.next = new Node(val);
        
    }
    
    public void addAtIndex(int index, int val) {
        Node temp = head;
        int currPos=0;
       

        
         
        if(index == 0) {
            Node newNode = new Node(val);
            newNode.next = temp;
            head = newNode;
            size++;
            return;
        }

        if(index > size)
        {
          return;
        }

        while(currPos < index-1)
        {
            if(temp.next == null) break;

            temp = temp.next;
            currPos++;
        }
        Node newNode = new Node(val);
        if(temp.next != null)
         {   
            newNode.next = temp.next;
            temp.next = newNode;  
         }
         else
            temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        Node temp = head;
        int currPos=0;
        if(index>size-1) return;
        if(index == 0) head = head.next;
        while(currPos < index-1)
        {
            temp = temp.next;
            currPos++;
        }
        if(temp.next == null)
            temp.next = null;
        else
            temp.next = temp.next.next; 
        
        size--;
    }
}
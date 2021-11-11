class LinkedList {

    Node head;
    Node tail;
    /*
     * deQueue() method to remove element from first
     * */
    public int deQueue(){
        if(head == null)
        {
            System.out.println("No elements in Queue");
        }
        else if(head != null)
        {
            Node temp1=head;
            while(temp1.next.next!=tail)
            {
                temp1=temp1.next;
            }
            tail=temp1;
            tail.next=null;
        }
        else
        {
            head =tail=null;
        }
        return tail.data;
    }

    public void enQueue(int data){
        Node temp = new  Node(data);
        if (head == null)
        {
            head=temp;
        }
        else
        {
            Node temp1=head;
            while(temp1.next!=null)
            {
                temp1=temp1.next;
            }
            temp1.next=temp;
        }
    }
    /*
     * show() method to show elements present in Linked List
     * */
    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        else
        {
            while (temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
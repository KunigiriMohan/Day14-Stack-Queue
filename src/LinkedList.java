class LinkedList {

    Node head;
    Node tail;

    /*
    *enQueue() method to add elements to Queue
    */

    public void enQueue(int data){
        Node temp = new  Node(data);
        if (head == null)                           //Checking any elements ar in Queue or not
        {
            head=temp;                              //if any value not present in Queue declare head inserted element as head
        }
        else
        {
            Node temp1=head;                        //if any values present add ing elements to queue
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
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}

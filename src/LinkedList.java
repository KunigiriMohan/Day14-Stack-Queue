class LinkedList {

    Node head;
    Node tail;

    /*
     * add() method to push elements to Nodes in linked list
     * */
    public void add(int data) {
        Node newNode = new Node(data);      //Creating new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
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
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
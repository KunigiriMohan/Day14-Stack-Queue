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

    /*
     *
     * pop() method for removing top element present in Stack.
     * */
    public void pop(){
        Node temp = head;
        if (temp ==null)
        {
            System.out.println("Stack does not contain any elements");
        }
        else
        {
            head=head.next;

        }
    }
    /*
     * peek() method to get top value from stack
     * */
    public int peek(){
        Node temp = head;
        if(temp== null){
            System.out.println("Stack does not contain any elements");
        }
        return head.data;
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
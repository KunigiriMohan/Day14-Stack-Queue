public class Queue {
    public static void main(String[] args){
        LinkedList list= new LinkedList();          // creating object of Linked List
        list.enQueue(56);                           //Inserting values in Linked list
        list.enQueue(30);
        list.enQueue(70);
        System.out.print("Elements in the Queue are :  ");
        list.show();                                //printing values in LInked List
    }
}

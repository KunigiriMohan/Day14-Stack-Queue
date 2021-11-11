public class Queue {
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        list.enQueue(56);
        list.enQueue(30);                       //pushing of elements to queue
        list.enQueue(70);
        System.out.print("Elements in the Queue are :  ");
        list.show();                                    //showing elements after pushing
        //System.out.println(list.deQueue());
        System.out.println();
        list.deQueue();                                     //calling deQueue method to dequeue elements in queue
        System.out.println("After deQueue of elements in Queue ");
        list.show();                                    //printing elemnts in queue after dequeue
    }
}

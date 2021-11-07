public class Queue {
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        list.enQueue(56);
        list.enQueue(30);
        list.enQueue(70);
        System.out.print("Elements in the Queue are :  ");
        list.show();
    }
}

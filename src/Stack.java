public class Stack {

    public static void main(String[] args){
        LinkedList list= new LinkedList();
        list.add(70);                       //Adding elements to stack
        list.add(30);
        list.add(56);
        System.out.println("Stack of Given numbers is");
        list.show();                                    //Calling show() method to show elements in Stack
        System.out.println();
        System.out.println("peek of the stack");
        System.out.println(list.peek());        //Calling and printing peek of elements of Stack
        list.pop();
        System.out.println("Elements present after stack");
        list.show();
    }
}

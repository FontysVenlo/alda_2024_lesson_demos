package nl.fontys.linkedlistnames;

/**
 * @author Richard van den Ham <r.vandenham@fontys.nl>
 */
public class LinkedListNames {

    Node<String> head;
    
    public static void main(String[] args) {
        LinkedListNames list = new LinkedListNames();
        list.addName("Ibrahim");
        list.addName("Martijn");
        list.printNames();
    }
    
    private static class Node<E>{
        
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }
    
    void addName(String name){
        var toAdd = new Node(name);
        
        if (head == null) {
            head = toAdd;
        } else {
            toAdd.next = head;
            head = toAdd;
        }   
    }
    
    void printNames(){
        
        for (Node<String> node = head;  node != null; node = node.next) {
            System.out.println(node.item);
        }
    }
}

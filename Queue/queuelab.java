public class que {

public static void main(String args[]) {
      que Q1 = new que();
      Q1.run();
     
}//end

public void run(){

   LinkedQueue<String> persons = new LinkedQueue<String>();
      String firstP = "Salma", secondP = "Hanouf",
      thirdP = "Eman", fourthP = "Mohammed";
   
      persons.enqueue(firstP);
      persons.enqueue(secondP);
      persons.enqueue(thirdP);
      persons.enqueue(fourthP);
   
      System.out.println("The queue size = " +persons.length());
      System.out.println("The qirst person served is "+persons.serve());
      System.out.println("The queue size after one serve = " +persons.length());    
}
public class Node<T> {
   public T data;
   public Node<T> next;
   
   public Node() {
      data = null;
      next = null;
   }
   public Node(T val) {
      data = val;
      next = null;
   }
}

public class LinkedQueue<T>{
   private Node<T> head, tail;
   private int size;

   public LinkedQueue(){
      head = tail = null;
      size = 0;
   }
   public boolean full() {
      return false;
   }
   public int length (){
      return size;
   }
   public void enqueue(T e){
      if(tail == null){
         head = tail = new Node<T>(e);
      }
      else {
         tail.next = new Node<T>(e);
         tail = tail.next;
      }
         size++;
}
   public T serve() {
      T x = head.data;
      head = head.next;
      size--;
      if(size == 0)
         tail = null;
        return x;
      }
} }

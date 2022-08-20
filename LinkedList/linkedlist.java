public class m { 
public static void main(String args[] ) {
    LinkedList<String> al = new LinkedList<String>();
      String s1= "xyz", s2 = "abc" , s3="new insert";
      

      al.insert(s1);
      al.insert(s2);
      al.findfirst();
     
      

      System.out.println(al.retrieve());
      System.out.println(al.full());
       al.findnext();
      System.out.println(al.retrieve());
      al.insert(s3);
      System.out.println(al.retrieve());
    
   

      System.out.println(length(al));
      System.out.println("after remove()");
      al.remove();
      System.out.println(al.retrieve());
      al.update("mera");
      System.out.println(al.retrieve());
      
      System.out.println(length(al));


      
    }
    public static <T> int length(LinkedList<T> l) {
      int count = 0;
      
      if (l.empty() == false) {
         l.findfirst();
         while (l.last() == false) {
            count++;
            l.findnext();
         }
         count++;
      }
      
      return count;
   }



}

 class Node<T> {
   public T data;
   public Node<T> next;

   public Node () {
      data = null;
      next = null;
   }

   public Node (T val) {
      data = val;
      next = null;
   }

   // Setters/Getters...
}


 class LinkedList<T> {
   private Node<T> head;
   private Node<T> current;

   public LinkedList () {
      head = current = null;
   }

   public boolean empty () {
      return head == null;
   }

   public boolean last () {
      return current.next == null;
   }
public boolean full () {
      return false;
   }
   public void findfirst () {
      current = head;
   }
   public void findnext () {
      current = current.next;
   }
   public T retrieve () {
      return current.data;
   }
   public void update (T val) {
      current.data = val;
   }
   public void insert (T val) {
      Node<T> tmp;
      if (empty()) {
         current = head = new Node<T> (val);
      }
      else {
         tmp = current.next;
         current.next = new Node<T> (val);
         current = current.next;
         current.next = tmp;
      }
   }
   public void remove () {
      if (current == head) {
         head = head.next;
      }
      else {
         Node<T> tmp = head;

         while (tmp.next != current)
            tmp = tmp.next;

         tmp.next = current.next;
      }

      if (current.next == null)
         current = head;
      else
         current = current.next;
   }
}

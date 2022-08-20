
public class lab4 {
public static void main (String[]args) {
lab4 p1 = new lab4();
     p1.run();
     }
     

public void run(){
String s1="litaetrure", s2="scince", s3="history", s4="math" ;
LinkedStack<String> obj = new LinkedStack<String>();

 
obj.push(s1);
obj.push(s2);
obj.push(s3);
obj.push(s4);
System.out.println("my books:");
obj.printstack();
System.out.println("my books after pop");
obj.pop();
obj.printstack();

}
public class Node<T> {
public T data;
public Node<T> next;

public Node (){ 
data = null;
next = null;
}

public Node (T val) {
data = val;
next = null;
}
}

public class LinkedStack<T> {
private Node<T> top;
/* Creates a new instance of LinkStack */
public LinkedStack() {
top = null;
}


public boolean empty(){
return top == null;
}

public boolean full(){
return false;
}

public void push(T e){
Node<T> tmp = new Node(e);
tmp.next = top;
top = tmp;
}

 public void printstack() {
    
       Node tmp = top;
       while (tmp != null){ 
       System.out.println(tmp.data);
       tmp = tmp.next;
        }
        
        
        
   }


public T pop(){
T e = top.data;
top = top.next;
return e;
}

}
}



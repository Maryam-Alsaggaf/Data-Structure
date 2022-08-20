public class TestArrayList {
public static void main ( String[] args ) {
      TestArrayList st = new TestArrayList();
      st.rewrite();
ArrayList<String> al = new ArrayList<String>(10);
String s1= "xyz", s2 = "abc";
al.insert(s1);
al.insert(s2);
al.findfirst();
System.out.println(al.retrieve());
System.out.println(al.full());
System.out.println(length(al));
System.out.println("Hello, World");
}
public class ArrayList<T> implements List<T>
{
private int maxsize;
private int size;
private int current;
private T[] nodes;
/** Creates a new instance of ArrayList */
public ArrayList(int n) {
maxsize = n;
size = 0;
current = -1;
nodes = (T[]) new Object[n];
}
public boolean full () {
return size == maxsize;
}
public boolean empty () {
return size == 0;
}
public boolean last () {
return current == size - 1;
}
public void findfirst () {
current = 0;
}
public void findnext () {
current++;
}
public T retrieve () {
return nodes[current];
}
public void update (T val) {
nodes[current] = val;
}
public void insert (T val) {
for (int i = size-1; i > current; --i) {
nodes[i+1] = nodes[i];
}
public void remove () {
for (int i = current + 1; i < size; i++) {
nodes[i-1] = nodes[i];
}
size--;
if (size == 0)
current = -1;
else if (current == size)
current = 0;
}
}
current++;
nodes[current] = val;
size++;
}
public static <T> int length(ArrayList<T> l) {
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

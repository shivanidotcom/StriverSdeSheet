import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class myStack{
   //linked list implementation
   Node head;
   int size;
   myStack(){
       size=0;
       head=null;
   }
   int size(){
       return size;
   }
   boolean isEmpty(){
       return head==null;
   }
   void push(int x){
       Node temp=new Node(x);
       temp.next=head;
       head=temp;
       size++;
   }
   int pop(){
       int res=head.data;
       head=head.next;
       size--;
       return res;
   }
   int peek(){
       return head.data;
   }
}
public class Main
{
    
	public static void main(String[] args) {
		myStack s=new myStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}
}

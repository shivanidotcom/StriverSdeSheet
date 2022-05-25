Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.

Example 1:

Input:
6
4 3 1 10 2 6

Output: 
6 2 10 1 3 4

Explanation: 
After reversing the given
elements of the queue , the resultant
queue will be 6 2 10 1 3 4.
Example 2:

Input:
4
4 3 2 1 

Output: 
1 2 3 4

Explanation: 
After reversing the given
elements of the queue , the resultant
queue will be 1 2 3 4.
  
  =====================================================
RECURSIVE METHOD
  =====================================================
  class QUEUE{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
         if(q.isEmpty()) return q;
        int x=q.remove();
        rev(q);
        q.offer(x);
        return q;
       
    }
   
}
=========================================================
ITERATIVE  METHOD
=========================================================
class QUEUE{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> s=new Stack<>();
        while(q.isEmpty()==false){
            s.push(q.remove());
        }
        while(s.isEmpty()==false){
            q.offer(s.pop());
        }
        return q;
       
    }
   
}

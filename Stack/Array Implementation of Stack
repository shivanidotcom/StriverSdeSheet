class myStack{
    int cap; //capacity of the Stack
    int arr[];
    int top;
    myStack(int c){
        top=1;
        cap=c;
        arr=new int[cap];
    }
    void push(int x){
        top++;
        arr[top]=x;
    }
    int pop(){
        int res=arr[top];
        top--;
        return res;
    }
    int peek(){
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    
}
public class Main
{
    
	public static void main(String[] args) {
		myStack s=new myStack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}
}

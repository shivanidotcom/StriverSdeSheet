class Queue{
    int[] arr;
    int size,cap,front,rear;
    Queue(int c){
        cap=c;
        size=0;
        front=rear=0;
        arr=new int[cap];
    }
    void enque(int x){
        if(cap==rear){
            System.out.println("Memory is full");
            return ;
        }else{
            arr[rear]=x;
            rear++;
        }
    }
    void deque(){
        if(front==rear){
            System.out.println("Queue is empty");return;
        }else{
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            if(rear<cap){
                arr[rear]=0;
            }
            rear--;
            return ;
        }
    }
    void display(){
        if(front==rear){
            System.out.println("Queue is empty");
            return ;
        }
        for(int i=front;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
        return ;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Queue q=new Queue(6);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.deque();
	    q.display();
	    q.isEmpty();
	   
		
	}
}

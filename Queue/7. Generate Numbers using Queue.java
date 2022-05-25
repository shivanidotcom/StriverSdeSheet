import java.util.*;
public class Main
{


    public static void main(String[] args) throws Exception {
        Queue<String> q=new LinkedList<>();
        int n=10;
        q.offer("5");
        q.offer("6");
        for(int i=0;i<n;i++){
            String curr=q.remove();
            q.offer(curr+"5");
            q.offer(curr+"6");
        }
        System.out.println(q);
    }
}

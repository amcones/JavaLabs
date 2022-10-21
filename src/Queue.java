import java.util.Scanner;
public class Queue{
    private int[] element;
    private int size;
    public Queue()
    {
        element=new int[8];
        size=0;
    }
    public void enqueue(int v)
    {
        if(size>=element.length){
            int[] temp=new int[element.length*2];
            System.arraycopy(element,0,temp,0,size);
            element=temp;
        }
        element[size++]=v;
    }
    public int dequeue() {
        size--;
        int tmp = element[0];
        System.arraycopy(element, 1, element, 0, size);
        return tmp;
    }
    public boolean empty()
    {
        return size==0;
    }
    public int getSize()
    {
        return size;
    }
}
class testQueue{
    public static void main(String[] args) {
        Queue queue=new Queue();
        System.out.print("Enter an integer: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("The factors for "+x+" is");
        for(int i=2;i<=Math.sqrt(x);i++){
            while(x%i==0){
                queue.enqueue(i);
                System.out.print(queue.dequeue()+" ");
                x/=i;
            }
        }
        if(x>1) System.out.print(x);
    }
}
import java.util.*;
class circularqueue{
        int maxsize ;
        int front, reare;
        int[] arr;
        int choice = 0;
        public circularqueue(int maxsize){
            this.maxsize = maxsize;
            arr = new int[maxsize];
            front = -1;
            reare = -1;

        }
    Scanner sc = new Scanner(System.in);
    public int Enqueue(int[] arr,int front,int reare,int maxsize){
        if(reare == (front%maxsize)-1){
            System.out.println("queue is full");
        }
        else{

            System.err.println("please enter the element in queue : ");
            int ele = sc.nextInt();
            if(reare ==-1 && front == -1){
            reare = 0;
            front = 0;
            arr[reare] = ele;
            }
            else{
                reare = (reare+1)%maxsize;
                arr[reare] = ele;
            }

        }
    
      return 0;     
    }
    public void Display(int[] arr,int front,int reare,int maxsize){
        if(front == -1 && reare == -1){
            System.out.println("queue is empty ");
        }
        else{
            for(int i = front;i<=reare;i+=i%maxsize){
                System.out.print(arr[i]);
            }
        }

    }
    public int Delete(int[] arr,int front,int reare,int maxsize){
        int del;
        if(reare == -1 && front == -1){
            System.out.println("queue is Empty ");
        }
        else{
            del = arr[front]; 
            System.out.println("Deleted elemnt : "+del);
            if(front == reare){
                front=reare=-1;
            }
            else{
                front = (front+1)%maxsize;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            circularqueue qu = new circularqueue(10);
            int choice = qu.choice;
            int maxsize = qu.maxsize;
            int[] arr = qu.arr;
            int front = qu.front;
            int reare = qu.reare;
            do{
                System.out.print("---------- Circular Queue ----------\n"); 
                System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.EXIT\n"); 
                System.out.println("please enter your choice : ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        qu.Enqueue(arr,front, reare, maxsize );
                        break;
                    case 3:
                        qu.Display(arr,front,reare,maxsize);
                        break;
                    case 2:
                        qu.Delete(arr,front,reare,maxsize);
                        break;
                    default:
                        break;
                }
            }while(choice != 4);
        }
        




    }
}
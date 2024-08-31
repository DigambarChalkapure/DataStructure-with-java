
public class LinkedList{
public class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) 
    { 
        this.val = val; 
        this.next = null; 
    }
} 

    ListNode head = null;

    public void addNode(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }

    public void display(){
        ListNode current = head;
        while(current.next != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(3);
        list1.display();

        list2.addNode(1);
        list2.addNode(2);
        list2.addNode(4);
        list2.display();
    
    }
}
 
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp ;
//         if(list1==null || list2==null)
//         {
//          return list1;
//         }
//         if(list2.value>list1.value)
//         {
//          mergeTwoLists(list1.next,list2);
         
//         }
//        else{
//             temp = list1.next; 
//             list1.next = list2;
//             list2 = list2.next;
//             list1.next.next = temp;
//         }
//             mergeTwoLists(list1.next,list2);
//             return list1;
        

        

//     }
// }

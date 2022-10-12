class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;
    }
}

public class MiddleNode
{
    public static Node create(int[] arr,Node head){
        Node dummy=head;
        for(int i:arr){
            dummy.next=new Node(i);
            dummy=dummy.next;
        }
        return head;
    }
    public static void display(Node head){
        Node dummy=head.next;
        while(dummy!=null){
            System.out.print(dummy.val+"--->");
            dummy=dummy.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static Node middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
	public static void main(String[] args) {
		int arr[]={1,4,8,9,11};
		Node head=create(arr,new Node());
		display(head);
		display(middle(head));
	}
}

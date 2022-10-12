class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;
    }
}

public class reverseList
{
    public static Node create(int[] arr,Node head){
        Node dummy=head;
        for(int i:arr){
            dummy.next=new Node(i);
            dummy=dummy.next;
        }
        return head.next;
    }
    public static void display(Node head){
        Node dummy=head;
        while(dummy!=null){
            System.out.print(dummy.val+"--->");
            dummy=dummy.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static Node reverse(Node head){
        Node newHead=null;
        while(head!=null){
            Node nxt=head.next;
            head.next=newHead;
            newHead=head;
            head=nxt;
        }
        return newHead;
    }
	public static void main(String[] args) {
		int arr[]={1,4,8,9};
		Node head=create(arr,new Node());
		display(head);
		display(reverse(head));
	}
}

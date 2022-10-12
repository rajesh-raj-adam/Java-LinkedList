class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;
    }
}

class RemoveNthLastNode
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
    public static Node removeNthFromLast(Node head,int n){
        Node start=head;
        Node ptr1=head;
        Node ptr2=head;
        for(int i=1;i<=n;i++){
            ptr1=ptr1.next;
        }
        while(ptr1.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        ptr2.next=ptr2.next.next;
        return start;
    }
	public static void main(String[] args) {
		int arr[]={1,4,8,9};
		Node head=create(arr,new Node());
		display(head);
		display(removeNthFromLast(head,3));
	}
}

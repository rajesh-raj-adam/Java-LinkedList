/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;
    }
}

public class Main
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
    public static Node merge(Node head1,Node head2){
        if(head1==null)return head2;
        if(head2==null)return head1;
        if(head1.val>head2.val){
            Node temp=head1;
            head1=head2;
            head2=temp;
        }
        Node res=head1;
        while(head1!=null && head2!=null){
            Node temp=null;
            while(head1!=null && head1.val<=head2.val){
                temp=head1;
                head1=head1.next;
            }
            temp.next=head2;
            temp=head1;
            head1=head2;
            head2=temp;
        }
        return res;
    }
	public static void main(String[] args) {
		int arr1[]={1,4,8,9};
		int arr2[]={3,4,6,7,9};
		Node head1=create(arr1,new Node());
		Node head2=create(arr2,new Node());
		display(head1);
		display(head2);
		display(merge(head1,head2));
	}
}

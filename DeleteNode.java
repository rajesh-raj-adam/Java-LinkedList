class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;
    }
}
public class DeleteNode
{
    public static void insertNode(Node head,int data){
        Node newNode=new Node(data);
        Node temp=new Node();
        if(head==null){
            head=newNode;
            return;
        }
        else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public static void display(Node originalHead){
        Node head=originalHead;
        while(head.next!=null){
	       System.out.print(head.next.val+"-->");
	       head=head.next;
	    }
	    System.out.print("null"+"\n");
	    
    }
    public static Node getNode(Node head,int num){
        Node dummy=head;
        if(dummy==null)return dummy;
        while(dummy.val!=num){
            dummy=dummy.next;
        }
        return dummy;
    }
    public static void delete(Node dNode){
        if(dNode==null)return;
        dNode.val=dNode.next.val;
        dNode.next=dNode.next.next;
        return;
    }
	public static void main(String[] args) {
	    Node head=new Node();
	    insertNode(head,4);
	    insertNode(head,6);
	    insertNode(head,7);insertNode(head,1);insertNode(head,3);
	    display(head);
	    Node dNode=getNode(head,6);
	    delete(dNode);
	    display(head);
	}
}

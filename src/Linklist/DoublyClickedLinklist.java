package Linklist;

public class DoublyClickedLinklist {
    public static class Node{
        Node perv;
        Node next;
        int data;
    Node(int data){
        this.perv=null;
        this.next=null;
        this.data=data;
    }

    }
    Node head=null;
    Node tail=null;
    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;

        }
        else{
            tail.next=newnode;
            newnode.perv=tail;
            tail=newnode;
        }
    }
}

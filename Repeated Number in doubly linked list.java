import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class doubly{
    Node head=null;
    Node tail=null;
    void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    void repeated(){
        Node outer=head;
        boolean found=false;
        while(outer!=null){
            int count =0;
            Node inner=head;
            while(inner!=null){
                if(outer.data==inner.data){
                    count++;
                }
                inner=inner.next;
            }
            if(count>1){
                System.out.print("The value "+outer.data+" is repeated "+count+" times");
                found=true;
            }
            outer=outer.next;
        }
        if(!found){
            System.out.println("In this loop there is no value is repeated");
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        doubly list=new doubly ();
        System.out.print("Enter the number of Nodes:");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int data=sc.nextInt();
            list.insert(data);
        }
        list.display();
        list.repeated();
    }
}
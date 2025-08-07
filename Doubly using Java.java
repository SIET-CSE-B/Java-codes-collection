import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class doubly{
    Node head=null;
    void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            n.prev=null;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
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
    void reverse(){
        Node temp=head;
        if(head==null){
            System.out.print("List is empty");
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("NULL");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        doubly list=new doubly();
        System.out.print("Enter the Node:");
        int  k=sc.nextInt();
        for(int i=1;i<=k;i++){
            int data=sc.nextInt();
            list.insert(data);
        }
        System.out.print("List is forward:");
        list.display();
        System.out.print("List in Backward:");
        list.reverse();
    }
}
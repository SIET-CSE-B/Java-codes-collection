import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class singly{
    Node head=null;
    void append(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
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
  void displayReverse() {
        System.out.println("Reversed List: ");
        displayReverse(head);
        System.out.println("NULL");
    }

    void displayReverse(Node node) {
        if (node == null) return;
        displayReverse(node.next);
        System.out.print(node.data + " -> ");
    }
}
public  class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        singly list=new singly();
        System.out.print("Enter the node:");
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            int data=sc.nextInt();
            list.append(data);
        }
        System.out.println("Original:");
        list.display();
        list.displayReverse();
    }
}
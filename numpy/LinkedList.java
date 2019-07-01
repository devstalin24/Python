class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){data =d; next=null;}
    }
    public static void main(String arg[]) throws Exception{
        LinkedList lis  =  new LinkedList();
        lis.head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        lis.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        lis.printData(lis.head );
        lis.addData();
        System.out.println();
        lis.printData(lis.head);
        lis.addData1(n3 ,6);
        System.out.println();
        lis.printData(lis.head);
        lis.addDataend();
        System.out.println();
        lis.printData(lis.head);
        lis.delete1();
        System.out.println();
        lis.printData(lis.head);
        System.out.println();
        lis.printData(lis.reverse(lis.head));

    }

    public void printData(Node head){
        Node n = head;
        while(n!=null){
            System.out.print(n.data +" ");
            n = n.next;
        }
    }

    public void addData(){
        Node newNode = new  Node(5);
        newNode.next = head;
        head = newNode;

    }
    public void addData1(Node p , int d){

        Node newn = new Node(d);
        newn.next = p.next;
        p.next = newn;


    }
    public void addDataend() throws Exception{
        Node newn1 = new Node(7);
        newn1.next = null;
        Node last = head;
        while(last.next!=null){ last = last.next;}
        last.next = newn1;
}  
public void delete1(){
    Node n = head;
    Node prv = null;
     while(n.data != 7){
        prv = n;
       // System.out.println(prv.data);
        n  = n.next;}
    prv.next = n.next;
    } 

    public  Node reverse(Node head){
        if(head == null) { 
            return head; } 
        // last node or only one node 
        if(head.next == null) { 
            return head; } 
         Node newHeadNode = reverse(head.next); 
        // change references for middle chain 
        head.next.next = head; 
        head.next = null; 
        // send back new head node in every recursion 
        return newHeadNode;



    }
}
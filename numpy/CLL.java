class CLL{
   // Node head;
    static class Node{
        int data;
        Node next;

    };
    public static void main(String arg[]){
        CLL cll = new CLL();
        Node last = null;
        last  = cll.addDataempty(last,1);
        cll.printData(last);
        last  = cll.addDatabigen (last,0);
        System.out.println();
        cll.printData(last);
        last  = cll.addDatalast(last,2);
        System.out.println();
        cll.printData(last);
    }

    public Node addDataempty(Node last,int data){
        Node n = new Node();
        n.data = data;
       // n.next = last;
        last = n;
        last.next = last;
        
        return last;
    }

    public Node addDatabigen(Node last,int data){
        Node n = new Node();
        n.data = data;
        n.next = last.next;
        last.next = n;
        
        return last;
    }


    public Node addDatalast(Node last,int data){
        Node n = new Node();
        Node p;
        n.data = data;
        p = last.next;
        last.next = n;
        n.next = p;
        last = n;
        return last;
    }
    public void printData(Node last){
            Node p;
            p =  last.next;
        do{
            System.out.print(p.data+" ");
            p = p.next;
        }while(p!=last.next);
    }
    
}
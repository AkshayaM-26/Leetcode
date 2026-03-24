class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    Node head,tail;
    int c;
    public MyLinkedList() {
        head=tail=null;
        c=0;
    }
    
    public int get(int index) {
        if(index<0|| index>=c){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;

    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        if(head==null){
        head=nn;
        tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        c+=1;
    }
    
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
        c+=1;
    }
    
    public void addAtIndex(int index, int val) {
            if(index < 0 || index > c) return;
            if(index==0){
                addAtHead(val);
                return;                
            }
            if(index==c){
                addAtTail(val);
                return;
            }
            Node nn = new Node(val);
             Node temp = head;
             for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                nn.next=temp.next;
                temp.next=nn;
                c+=1;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=c){
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null)
                tail=null;
            c-=1;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            c-=1;
            if(temp.next==null){
                tail=temp;
            }
        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
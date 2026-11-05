class MyLinkedList {
    ListNode dummyHead;
    ListNode dummyTail;
    int size;

    public MyLinkedList() {
        dummyHead = new ListNode();
        dummyTail = new ListNode();
        //link the dummy
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
        //size will default to 0 when we create an object 

        
    }
    private class ListNode{
        ListNode next;
        ListNode prev;
        int val;

        private ListNode(int val){
            this.val = val;
        }
        private ListNode(){

        }
        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        ListNode cur = dummyHead.next;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur.val;
        
    }
    
    public void addAtHead(int val) {
        //create a node

        ListNode node = new ListNode(val);
        ListNode oldHead = dummyHead.next;
        oldHead.prev = node;
        node.next = oldHead;
        node.prev = dummyHead;
        dummyHead.next = node;
        size++;
        
        
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);

        ListNode oldTail = dummyTail.prev;
        oldTail.next = node;
        dummyTail.prev = node;
        node.prev = oldTail;
        node.next = dummyTail;
        size++;

        
    }
    
    public void addAtIndex(int index, int val) {
        if(index >= 0 && index <= size){
            ListNode node =  new ListNode(val);
            ListNode cur = dummyHead;
            for(int i = 0; i < index; i++){
                cur = cur.next;
            }
            //cur is the previous node here
            ListNode before = cur;
            ListNode after =  cur.next;
            before.next = node;
            after.prev = node;
            node.prev = before;
            node.next = after;
            size++;

        }
        
    }
    
    public void deleteAtIndex(int index) {
        ListNode cur = dummyHead.next;
        if(index >= 0 && index < size){
            for(int i = 0; i < index; i++){
                cur = cur.next;

            }
            //cur is the target Node;
            ListNode target = cur;
            ListNode before = cur.prev;
            ListNode after = cur.next;
            before.next = after;
            after.prev = before;
            size--;
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
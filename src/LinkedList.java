import java.util.List;

public class LinkedList {
    private LinkedList head;
    private LinkedList tail;
    private int val;
    private LinkedList next;
    private int size;

    public LinkedList add(int val) {
        LinkedList node = new LinkedList();
        node.val = val;
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            LinkedList current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            tail = current.next;
            size++;
        }
        return this;
    }
    public void print() {
        if (this != null) {
            LinkedList current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public int size() {
        return this.size;
    }
    public int returnTailValue(){
        if(this.tail!=null) {
            return tail.val;
        }
        return Integer.MIN_VALUE;
    }
    public int returnHeadValue(){
        if(this.head!=null) {
            return head.val;
        }
        return Integer.MIN_VALUE;
    }
    public LinkedList pop(){
        if(this.size<=1){
            this.head = null;
            this.tail = null;
            this.size = 0;
            return this;
        }
        LinkedList current = this.head;
        while(current.next!=tail){
            current = current.next;
        }
        current.next = null;
        tail = current;
        this.size--;
        return this;
    }
    public LinkedList shift(){
        LinkedList current = this.head;
        head = current.next;
        size--;
        return this;
    }
    public void unShift(int val){
        LinkedList current = this.head;
        LinkedList willAdd = new LinkedList();
        willAdd.val = val;
        this.head = willAdd;
        willAdd.next = current;
        size++;
    }
    public int getVal(int index) {
        if (index <= size) {
            LinkedList current = this.head;
            int i = 1;
            while (i < index) {
                current = current.next;
                i++;
            }
            return current.val;
        }
        return Integer.MIN_VALUE;
    }
    public void setVal(int index,int val){
        if (index < size) {
            LinkedList current = this.head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            current.val = val;
        }
    }
    public void insert(int index,int val){
        if (index < size) {
            LinkedList current = this.head;
            int i = 0;
            while (i < index-1) {
                current = current.next;
                i++;
            }
            LinkedList list = new LinkedList();
            list.val = val;
            LinkedList temp = current.next;
            current.next = list;
            list.next = temp;
            size++;
        }
    }
    public void remove(int index){
        if(index == 1){
            this.head = this.head.next;
            size--;
        }
        if (index <= size) {
            LinkedList current = this.head;
            LinkedList dummy = new LinkedList();
            dummy.next = head;
            int i = 1;
            while (i < index) {
                dummy = dummy.next;
                current = current.next;
                i++;
            }
            dummy.next = current.next;
            if(index == this.size){
                this.tail = dummy;
            }
            size--;
        }
    }
    public LinkedList reverse(){
        LinkedList dummy = new LinkedList();
        dummy.next = head;
        LinkedList tempDummy = dummy;
        LinkedList current = head;
        int index = 0;
        LinkedList tempTail = new LinkedList();
        LinkedList tempHead = new LinkedList();
        while(current!=null){
            if(index == 0){
                tempTail = current;
            }
            if(index == size-1){
                tempHead = current;
            }
            LinkedList tempCurrent = current.next;
            current.next = dummy;
            dummy = current;
            current = tempCurrent;
            index++;
        }
        this.head = tempHead;
        this.tail = tempTail;
        tail.next = null;
        tempDummy.next = null;
        return this;
    }
}

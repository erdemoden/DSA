public class DoublyLinkedList {
    private int val;
    private DoublyLinkedList next;
    private DoublyLinkedList prev;
    private DoublyLinkedList head;
    private DoublyLinkedList tail;
    private Integer size = 0;

    public DoublyLinkedList put(int val){
        if(this.head == null){
            DoublyLinkedList list = new DoublyLinkedList();
            list.val = val;
            this.head = list;
            this.tail = list;
            size++;
            return this;

        }
        else{
            DoublyLinkedList temp = new DoublyLinkedList();
            DoublyLinkedList current = this.head;
            DoublyLinkedList tempDummy = temp;
            temp.next = current;
            while (current.next!=null){
                temp = temp.next;
                current = current.next;
            }
            if(current!=head){
            current.prev = temp;
            }
            DoublyLinkedList list = new DoublyLinkedList();
            list.val = val;
            current.next = list;
            current.next.prev = current;
            this.tail = list;
            tempDummy.next = null;
            size++;
        }
        return this;
    }
    public void print() {
        if (this.head != null) {
            DoublyLinkedList current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public void printBackWard() {
        if (this != null) {
            DoublyLinkedList current = tail;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }
    public void printTail(){
        if(this.tail!=null) {
            System.out.println(tail.val);
        }
    }
    public void printHead(){
        if(this.head!=null) {
            System.out.println(head.val);
        }
    }
    public void remove(int index){
        if(index>size){
            System.out.println("index should be smaller than the DoublyLinkedList size");
        }
        else if(index == 1 && size == 1){
            this.head = null;
            this.tail = null;
            size--;
        }
        else if(index == 1){
            this.head = this.head.next;
            size--;
        }
        else if(index == size){
            DoublyLinkedList temp = this.tail.prev;
            this.tail = temp;
            this.tail.next = null;
            size--;
        }
        else{
            DoublyLinkedList current = this.head;
            DoublyLinkedList tempTemp = new DoublyLinkedList();
            DoublyLinkedList temp = new DoublyLinkedList();
            temp.next = head;
            tempTemp.next = temp;
            int i = 1;
            while(i<index){
                current = current.next;
                temp = temp.next;
                i++;
            }
            temp.next = current.next;
            if(current.next!=null){
                current.next.prev = temp;
            }
            tempTemp.next = null;
            size--;
        }
    }
    public void insert(int index,int value){
        if(index>size){
            System.out.println("index should be smaller than the DoublyLinkedList size");
        }
        else if(index<0){
            System.out.println("index should be greater than 0");
        }
        else if(index == 1){
            DoublyLinkedList temp = new DoublyLinkedList();
            temp.val = value;
            temp.next = this.head;
            this.head.prev = temp;
            this.head = temp;
            size++;
        }
        else if(index == size){
            DoublyLinkedList temp = new DoublyLinkedList();
            temp.val = value;
            temp.prev = this.tail;
            this.tail.next = temp;
            this.tail = temp;
            size++;
        }
        else{
            DoublyLinkedList current = this.head;
            DoublyLinkedList temp = new DoublyLinkedList();
            DoublyLinkedList tempTemp = new DoublyLinkedList();
            temp.next = head;
            tempTemp.next = temp;
            int i = 1;
            while(i<index){
                current = current.next;
                temp = temp.next;
                i++;
            }
            DoublyLinkedList list = new DoublyLinkedList();
            list.val = value;
            list.next = current;
            list.prev = temp;
            temp.next = list;
            current.prev = list;
            tempTemp.next = null;
            size++;
        }
    }
    public void pop(){
        if(this.head == null){
            System.out.println("DoublyLinkedList is empty");
        }
        else if(this.head == this.tail){
            this.head = null;
            this.tail = null;
            size--;
        }
        else{
            DoublyLinkedList current = this.head;
            DoublyLinkedList temp = new DoublyLinkedList();
            DoublyLinkedList tempTemp = new DoublyLinkedList();
            temp.next = head;
            tempTemp.next = temp;
            while(current.next!=null){
                current = current.next;
                temp = temp.next;
            }
            temp.next = null;
            this.tail = temp;
            tempTemp.next = null;
            size--;
        }
    }
    public void shift(){
        if(this.head == null){
            System.out.println("DoublyLinkedList is empty");
        }
        else if(this.head == this.tail){
            this.head = null;
            this.tail = null;
            size--;
        }
        else{
            this.head = this.head.next;
            this.head.prev = null;
            size--;
        }
    }
    public void get(int index){
        if(index>size){
            System.out.println("index should be smaller than the DoublyLinkedList size");
        }
        else if(index<0){
            System.out.println("index should be greater than 0");
        }
        else{
            DoublyLinkedList current = this.head;
            int i = 1;
            while(i<index){
                current = current.next;
                i++;
            }
            System.out.println(current.val);
        }
    }
}

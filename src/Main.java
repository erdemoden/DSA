public class Main {
    public static void main(String[] args) {
       /* LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(-12);
        list.shift();
        list.shift();
        list.unShift(123);
        list.unShift(23);
        list.setVal(3,234);
        list.insert(3,432);
        list.print();
        list.reverse();
        list.print();
        System.out.println(list.returnHeadValue());
        System.out.println(list.returnTailValue());*/
        /*DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.put(5).put(4).put(3).put(2).put(1);
        doublyLinkedList.remove(5);
        doublyLinkedList.insert(1,10);
        doublyLinkedList.insert(5,7);
        doublyLinkedList.print();
        doublyLinkedList.get(8);*/
        BST bst = new BST();
        bst.insert(5);
        bst.insert(2);
        bst.insert(3);
        bst.insert(6);
        bst.insert(0);
        bst.insert(1);
        bst.insert(98);
        bst.insert(43);
        bst.insert(7);
        bst.BFS();
    }
}
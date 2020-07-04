package cautrucdulieuvagiaithuatcoban.baitap.implLinkedlist;

import cautrucdulieuvagiaithuatcoban.baitap.implarraylist.MyArrayList;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numberNode = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        // khai bao 1 bien la temp tro den gia tri head
        Node temp = head;
        // bien head se nhan gia tri la 1 node moi
        head = new Node(element);
        //head.next = temp ;
        numberNode++;
    }

    public void addLast(E element) {
        // khai bao bien temp tro den head
        Node temp = head;
        // se cho con tro chay den phan tu cuoi cung cua danh sach
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numberNode++;
    }

    public void add(int index, E element) {
        Node temp = head;
        // khai bao noy holder
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chieu den vi tri index
        holder = temp.next;
        //Node tai vitri index -1 tro den node moi
        temp.next = new Node(element);
        temp.next.next = holder;
        numberNode++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public int size(){
        return numberNode ;
    }


}

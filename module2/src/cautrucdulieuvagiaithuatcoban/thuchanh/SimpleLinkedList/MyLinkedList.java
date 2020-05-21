package cautrucdulieuvagiaithuatcoban.thuchanh.SimpleLinkedList;

public class MyLinkedList {
//    numNodes size xác định số phần tử trong danh sách, mặc định gán là 0.
//    head đối tượng lớp Node
    private  Node head;
    private  int numNodes;
//    khởi tạo một tham số khởi tạo node đầu tiên trong danh sách
    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    //    thêm một phần tử mới vào danh sách
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    //    thêm một phần tử mới vào đầu danh sách
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
//    truy cập một phần tử trong danh sách
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
//    các phần tử trong danh sách
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

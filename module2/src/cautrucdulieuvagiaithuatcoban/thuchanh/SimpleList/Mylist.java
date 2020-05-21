package cautrucdulieuvagiaithuatcoban.thuchanh.SimpleList;

import java.util.Arrays;

public class Mylist<E> {

//    size xác định số phần tử trong danh sách, mặc định gán là 0.
//
//    DEFAULT_CAPACITY lưu số phần tử đối đa trong danh sách mặc định là 10.
//
//    Mảng đối tượng elements chứa các phần tử trong danh sách
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
//    Phương thức khởi tạo không tham số
    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
//    Phương thức thay đổi số phần tử tối đa trong danh sách: ensureCapa()
//    tăng gấp đôi kích thước mảng
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
//    Phương thức thêm một phần tử mới vào danh sách: add()
//    thêm một phần tử vào cuối của danh sách
//    Tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
//    Phương thức truy cập một phần tử trong danh sách: get()
//    Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
//    Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void printList() {

        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}
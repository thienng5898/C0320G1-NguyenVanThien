package cautrucdulieuvagiaithuatcoban.baitap.implLinkedlist;

public class TestLinkedList {
    static class Student{
        private int id ;
        private String name ;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>() ;
        Student student1 =new Student(1,"Quan") ;
        Student student2 =new Student(2,"Thanh") ;
        Student student3 =new Student(3,"an") ;
        Student student4 =new Student(4,"Jojo") ;
        Student student5 =new Student(5,"Doraemon") ;
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student3);
        myLinkedList.addLast(student4);
        myLinkedList.add(2,student4) ;
        for (int i =0 ;i<myLinkedList.size();i++){
            Student student= (Student) myLinkedList.get(i) ;
            System.out.println(student.getName() );

        }
    }


}

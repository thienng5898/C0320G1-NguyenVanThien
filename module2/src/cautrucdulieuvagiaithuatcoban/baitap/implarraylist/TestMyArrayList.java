package cautrucdulieuvagiaithuatcoban.baitap.implarraylist;

public class TestMyArrayList<E> {
    public static class Students {
        private int id;
        private String name;

        public Students(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Students() {
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


    public static void main(String[] args) throws IllegalAccessException {
        Students a = new Students(1, "thu");
        Students b = new Students(2, "qua");
        Students c = new Students(3, "qpq");
        Students d = new Students(4, "abc");
        Students e = new Students(5, "asd");
        Students f = new Students(6, "qwe");
        MyArrayList<Students> studentsMyArrayList = new MyArrayList<>();
        MyArrayList<Students> newStudentsMyArrayList = new MyArrayList<>();

        studentsMyArrayList.add(a);
        studentsMyArrayList.add(b);
        studentsMyArrayList.add(c);
        studentsMyArrayList.add(d);
        studentsMyArrayList.add(e);
//        studentsMyArrayList.add(f) ;
//        System.out.println(studentsMyArrayList.size());
//        System.out.println(studentsMyArrayList.get(2).getName());
//        System.out.println(studentsMyArrayList.indexOf(c));
//        System.out.println(studentsMyArrayList.contains(f));
        newStudentsMyArrayList = studentsMyArrayList.clone();

        newStudentsMyArrayList.remove(0);
        for (int i = 0; i < newStudentsMyArrayList.size(); i++) {
            System.out.println(newStudentsMyArrayList.get(i).getName());
        }
    }


}
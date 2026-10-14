public class StudentInfo {
    // instance belongs to the object
    // static belongs to class using classname to acess
    int id;
    String name;
    static String collegename = "abc clg";

    public StudentInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(collegename);
    }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(101, "vaibhavi");
        StudentInfo s2 = new StudentInfo(102, "Raj");

        StudentInfo s3 = new StudentInfo(103, "Nitin");

        StudentInfo s4 = new StudentInfo(104, "Sakshi");
       
        System.out.println(StudentInfo.collegename);
          // static varibale acesss using class name

        s1.show();
        s2.show();

        s3.show();

        s4.show();

    }

}

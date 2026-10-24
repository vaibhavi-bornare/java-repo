// Encapsulation means wrapping data (variables) 
// and methods together inside 
// a class and protecting the data from direct access.

// private access specifer is use 
// class is exmaple of encapsulation


public class Student {
    private int num;
    private String name;


    public void Setnum(int num){
        this.num=num;
    }
    public int Getnum(){
       return num;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.Setnum(101);
        s.setname("vaibhavi");
        System.out.println(s.Getnum());
        System.out.println(s.getname());
    }
}

   

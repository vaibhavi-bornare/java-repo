public class Students {
    int id;
    String name;
    String city;



     public Students(int id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
     }

     public void display(){
        System.out.println("id is" +this.id);
        System.out.println("name is "+this.name);
        System.out.println("city is " + this.city);
     }
    
     public static void main(String[] args) {
     
        Students s=new Students(1,"Raj","pune");
        Students s1=new Students(2, "Rani", "Pune");
        s1.display();
        s.display();
     }
     }


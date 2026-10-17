public class Find {
    int num1;
    int num2;
    int num3;

    public Find(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public void show(){
    if(num1>num2 && num1>num3){
        System.out.println(num1 +" is largest");
    }    
    else if(num2>num1 && num2>num3){
        System.out.println(num2 + " is largest");
    } 
    else{
        System.out.println(num3 + " is largest");
    }
    
    

    }

    public static void main(String[] args) {
        Find f=new Find(10,34,45);
        f.show();
    }
}

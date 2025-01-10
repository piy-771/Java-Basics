

class A{
    public  static  void show(){
        System.out.println("This is public static show function");
    }
}

class B{

    B(){
        System.out.println("this is contructor");
    }
    public  void kite(){
        System.out.println("This is kite function");
    }
}



public class Test3 {
    public static void main(String[] args) {
         A.show();
         B obj = new B();
         obj.kite();
    }
}

class A{

    static int x=2;
    
 
    A(){
        x = 20;
        System.out.println( x);
    }
    A(int y){
        x = y;
        System.out.println(x);
    }
    {
        x = 30;
        System.out.println(x);
    }
    static{
       
        System.out.println("hello");
    }
}
class InstanceBlock extends A{
    public static void main(String args[]){

       System.out.println(A.x);
       
    }
}
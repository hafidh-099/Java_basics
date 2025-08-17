public class Method {
    public  static  int Sum(int a, int b){
        return  a + b;
    }
    public static  void main (String[]arg){

        System.out.println(Sum(1,9));
        System.out.println(Sum(10,19));
        Greet();
    }

    private static void Greet() {
        System.out.println("hello world !");
    }
}

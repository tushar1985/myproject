class Main {
    // private variable
    protected String name;
}
 class Main1 extends Main{
     void var() {
         System.out.println(name);
     }
}
public class Data{
    public static void main(String[] main) {

        // create an object of Data
        Main1 d = new Main1();

        // access private variable and field from another class
        d.name = "Programiz";
        d.var();
    }
}

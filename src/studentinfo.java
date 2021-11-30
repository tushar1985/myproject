class studentinfo {

    String name;
    int rollno;
    int age;

    //studentinfo(){

      //  name="tushar";
       // rollno=25;
       // age= 35;
    //}
    void info(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollno);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        studentinfo student = new studentinfo();

        // Accessing and property value
        student.name = "Ramesh";
        student.rollno = 253;
        student.age = 25;

        // Calling method
        student.info();

    }

}

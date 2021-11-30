 class Animal{
        void var()
        {
            System.out.println("Varieties of Animals by their color ...");}
    }

    class Dog extends Animal{
        void dogcol()
        {
            System.out.println("We have a  White color Dog...");
        }
    }
 class babydog extends Animal{
     void babydogcol()
     {
         System.out.println("We have a black color Babydog...");
     }
 }

    class program2{
        public static void main(String args[]){
            babydog c= new babydog();
            Dog d=new Dog();
            c.var();
            c.babydogcol();
            d.dogcol();
        }
    }


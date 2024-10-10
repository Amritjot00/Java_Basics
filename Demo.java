public class Demo {
    // public static String name = "Amrit";
    
    // public static void Printing(String name){
    //     System.out.print(name);
    // }
    
    private String name;
    public Demo(String name){
    this.name = name;
    }

    public static void Printing(Demo demo){

    System.out.print(demo.name);
    }

     public static void main(String[] args) {

         Demo demo = new Demo("Amrit");
         Demo.Printing(demo);
        //  System.out.print(Demo.name);
        
        // Demo.Printing("Amrit");
        
        // Demo demo = new Demo();
        // System.out.print(demo.name);
        
    }
}

package oops;
class Boxdemo{
    double width;
    double height;
    double depth;
}

public class oops_01 {
    public static void main(String[] args){
        Boxdemo myBox1 = new Boxdemo();
        Boxdemo myBox2 = new Boxdemo();


        //mybox1 property
        myBox1.height=10;
        myBox1.width = 10;
        myBox1.depth = 10;


        //mybox2 property
        myBox2.height=10;
        myBox2.width=20;
        myBox2.depth=30;
        double vol1 = myBox1.height*myBox1.width*myBox1.depth;
        double vol2 = myBox2.height*myBox2.width*myBox2.depth;
        System.out.println("Mybox1 vol"+vol1);
        System.out.println("Mybox2 vol"+vol2);




    }
}

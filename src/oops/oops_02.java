package oops;

class Box{
    double width;
    double height;
    double depth;

    //methods
    void volume(){
        double vol = height*width*depth;
        System.out.println("Volume is: "+vol);
    }
}

public class oops_02 {
    public static void main(String[] args){

        Box myBox1 = new Box();
        Box myBox2 = new Box();


        //mybox1 property
        myBox1.height=10;
        myBox1.width = 10;
        myBox1.depth = 10;


        //calling methods;
        myBox1.volume();
        myBox2.volume();

    }
}

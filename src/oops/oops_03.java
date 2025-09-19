package oops;

class Boxdemo2{
    double width;
    double height;
    double depth;

    //methods
    double volume(){
        return height*width*depth;

    }
}


public class oops_03 {
    public static void main(String[] args){

        Box myBox1 = new Box();
        Box myBox2 = new Box();


        //mybox1 property
        myBox1.height=10;
        myBox1.width = 10;
        myBox1.depth = 10;


        //calling methods;
        double vol1= myBox1.volume();

        double vol2= myBox2.volume();


    }
}

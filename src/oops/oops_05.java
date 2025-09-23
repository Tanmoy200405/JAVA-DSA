package oops;

class BoxDemo5{
    double l;
    double h;
    double w;
    BoxDemo5(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    BoxDemo5(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    BoxDemo5(double l,double h, double w){
        this.w = w;
        this.l = l;
        this.h = h;
    }
    BoxDemo5(BoxDemo5 old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the Box");
    }

    public static class BoxWeight extends BoxDemo5 {
        double weight;

        public BoxWeight(){
            this.weight = -1;
        }

    }
}

public class oops_05 {
    public static void main(String[] args){
//        BoxDemo5 box = new BoxDemo5(4.0,7.9,6.7);
//        System.out.println(box.h + " "+ box.w+ " "+ box.l);
        BoxWeigth box3 = new BoxWeigth();
        BoxWeigth box4 = new BoxWeigth(4,3,4,8);
        System.out.println(box3.h+ " "+ box3.w + " "+ box3.l + " "+ box3.weigth);
        System.out.println( );

    }
}

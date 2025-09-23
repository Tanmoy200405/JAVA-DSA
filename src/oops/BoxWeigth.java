package oops;

public class BoxWeigth extends BoxDemo5 {
    double weigth;


    BoxWeigth(){
        this.weigth = -1;
    }

    public BoxWeigth(double l, double h, double w, double weigth) {
        super(l, h, w); //call this parents class controctor
        this.weigth = weigth;
    }
}

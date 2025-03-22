interface Shape{
    public void circle();
}

interface Color {
    public void color();
}

class Circle implements Color, Shape{
    String Color;

    Circle(String C){
        Color=C;
    }

    public void circle(){
        System.out.println("its a circle");
    }

    public void color(){
        System.out.println("circle's color: "+Color);
    }
}


public class InterFaceMain {

     public static void main(String[] args) {
        Circle C = new Circle("Yellow");
        C.circle();
        C.color();
     }
}
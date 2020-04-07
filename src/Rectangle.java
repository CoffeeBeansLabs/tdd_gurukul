public class Rectangle {
    private final float length;
    private final float breadth;

    public  static  Rectangle createRectangle(Float length, Float breadth){
        return new Rectangle(length,breadth);
    }

    public  static  Rectangle createSquare(Float side){
        return new Rectangle(side,side);
    }

    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public float area(){
        return this.length*this.breadth;
    }

    public float perimeter(){
        return 2*(this.length+ this.breadth);
    }

}

public class Square {
    private final float side;

    public Square(Float side){
        this.side = side;
    }

    public float area(){
        return this.side*this.side;
    }
}

public class Square {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public float area() {
        if( side <= 0 ) {
            return  0;
        }

        return side * side;
    }
}

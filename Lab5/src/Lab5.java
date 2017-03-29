class Rectangle extends Polygon {
    private int w, h;

    public Rectangle(int w, int h) {
        super(4, w, h, w, h);
        this.w = w;
        this.h = h;
    }

    public int area() {
        return w * h;
    }

}

class Square extends Rectangle {
    private int d;

    public Square(int d) {
        super(d, d);
        this.d = d;
    }
}


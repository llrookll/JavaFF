//class Polygon
//{
//    private int[] sideLengths;
//
//    public Polygon(int sides, int ... lengths)
//    {
//        int index = 0;
//        sideLengths = new int[sides];
//        for (int length: lengths)
//        {
//            sideLengths[index] = length;
//            index += 1;
//        }
//    }
//
//    public int side(int number)
//    {
//        return sideLengths[number];
//    }
//
//    public int perimeter()
//    {
//        int total = 0;
//        for (int index = 0; index < sideLengths.length; index += 1)
//        {
//            total += side(index);
//        }
//        return total;
//    }
//}
//
//class Rectangle extends Polygon {
//    private int w, h;
//
//    public Rectangle(int w, int h) {
//        super(4, w, h, w, h);
//        this.w = w;
//        this.h = h;
//    }
//
//    public int area() {
//        return w * h;
//    }
//
//}
//
//class Square extends Rectangle {
//    private int d;
//
//    public Square(int d) {
//        super(d, d);
//        this.d = d;
//    }
//}

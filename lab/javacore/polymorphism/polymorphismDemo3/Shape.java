public class Shape {
    Shape() {
    }

    public void length() {
    }

    public void area() {
    }

    /** 回傳圖形名稱，子類可覆寫 */
    public String getName() {
        return "Shape";
    }

    public void computeLength(Shape s) {
        System.out.println("Shape length = ");
        s.length();
    }

    public void computeArea(Shape s) {
        System.out.println("Shape area = ");
        s.area();
    }
}
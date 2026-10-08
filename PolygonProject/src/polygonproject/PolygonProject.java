package polygonproject;

public class PolygonProject {
    public static void main(String[] args) {
    
    RegularPolygon p1 = new RegularPolygon();
    RegularPolygon p2 = new RegularPolygon(6,4);
    RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
    
    printInfo(p1);
    printInfo(p2);
    printInfo(p3);
}
    public static void printInfo(RegularPolygon p) {
        System.out.printf("Perimeter: %.2f, Area: %.2f\n", p.getPerimeter(), p.getArea());
    }
    }

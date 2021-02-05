interface Polygon {
    void getArea();
}

class Square implements Polygon {
    public void getArea() {
        int w = 6;
        int h = 8;
        int area = (w * h);
        System.out.println("Area of Sqaure is " + area);
    }
}

class Triangle implements Polygon {
    public void getArea() {
        int h = 10;
        int j = 20;
        int area = (h * j) / 2;
        System.out.println("Area of Triangle is " + area);
    }
}

class Interface {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.getArea();
        Triangle s2 = new Triangle();
        s2.getArea();

    }

}

class Area {
    int w;
    int h;

    // Create constructor for get data
    Area(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public void getArea() {
        int area = (w * h);
        System.out.println("The area of polygon is " + area);
    }
}

class Calculate {
    public static void main(String[] args) {
        Area s1 = new Area(6, 5);
        s1.getArea();
    }

}
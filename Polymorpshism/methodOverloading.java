class methodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        methodOverloading c = new methodOverloading();

        System.out.println(c.add(2, 3));        // 5
        System.out.println(c.add(2, 3, 4));     // 9
        System.out.println(c.add(2.5, 3.5));    // 6.0
    }
}
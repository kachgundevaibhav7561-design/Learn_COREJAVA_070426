public class properyTax {
    public double calculateTax(double areaINSqFt) {
        return areaINSqFt * 10; // 10ru pre sqft

    }

    public double calcluateTax(int propertyValue) {
        return propertyValue * 0.02; // 2% of peroperty value

    }

    public double calculateTax(double areaINSqFt, double ratePerINtrest) {
        return areaINSqFt * ratePerINtrest;

    }

    public double calculateTax(double propertyValye, int serviceCharge) {
        return (propertyValye * 0.0015) + serviceCharge;
    }

    public static void main(String[] args) {
        properyTax obj1 = new properyTax();
        // System.out.println(obj1.calcluateTax(12.5));
        System.out.println(obj1.calculateTax(45.5));
        System.out.println(obj1.calcluateTax(200));
        System.out.println(obj1.calculateTax(450.0, 450));
        // System.out.println(obj1.calculateTax());

    }
}

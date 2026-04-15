public class arrayExample {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50 };
        System.out.println(number.length);
        System.out.println("--------------");
        // for (int i = 0; i < number.length; i++) {
        // System.out.println(number[i]);
        // }

        for (Object ele : number) {
            System.out.println(ele);
        }

        int[] num = new int[3];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
    }
} 
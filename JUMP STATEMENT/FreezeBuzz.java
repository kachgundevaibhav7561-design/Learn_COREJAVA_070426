

    class FreezeBuzz {
    public static void main(String[] args) {

        for(int i = 1; i <= 50; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("freezebuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("freeze");
            }
            else if(i % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}

// public class example1 {
// //reverse the
//     public static void main(String[] args) {
//         int[] num1 = { 10, 20, 30, 40, 50 };

//         for (int i = num1.length - 1; i >= 0; i--) {
//             System.out.println(num1[i]);
//         }
//     }
// -
// }

public class example1 {

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int start = 0;
        int end = arr1.length - 1;
        while (start<end) {
            int temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;

            start++;
            end--;
            
        }
        for(Object elem: arr1){
            System.out.println(elem);
        }

    }
}

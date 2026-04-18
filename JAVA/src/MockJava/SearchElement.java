package MockJava;

public class SearchElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int num = 30;

        int index = -1;   // default value if not found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        System.out.println("index position : "+index);
    }
}
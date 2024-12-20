public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if(arr.length > 0 && 0 <= 5 && 5 < arr.length) { //check for array bounds
            System.out.println(arr[5]);
        } else {
            System.out.println("Array index out of bounds");
        }
    }
}
package COLLECTION_MOCK;

class AddNumbers {
    public static void main(String[] args) {
        
        

        // Convert String arguments to integers
        System.out.println("Enter first");
        int num1 = Integer.parseInt(args[0]);
        System.out.println("Enter second");
        int num2 = Integer.parseInt(args[1]);

        // Add numbers
        int sum = num1 + num2;

        // Display result
        System.out.println("Sum = " + sum);
    }
}
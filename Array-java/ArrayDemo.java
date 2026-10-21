public class ArrayDemo {
    public static void main(String[] args) {

        // Array
        // We can store multiple values of the same type
        // Homogeneous (same type)
        // Size of array is fixed
        // It is based on index

        // Declaration and creation of array
        int rollNo[] = new int[4];

        // Initializing array
        rollNo[0] = 101;
        rollNo[1] = 102;
        rollNo[2] = 103;
        rollNo[3] = 104;

        System.out.println("Array length: " + rollNo.length);

        // Display array elements
        for (int i = 0; i < rollNo.length; i++) {
            System.out.println(rollNo[i]);
        }

        int num[] = {10, 20, 30, 40};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // Marks
        double marks[] = {80.23, 60.3, 99.0, 77.5};

        // Display marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Find total
        double total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        System.out.println("Total Marks: " + total);
    }
}
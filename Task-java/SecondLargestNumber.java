public class SecondLargestNumber {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 40;

        int largest;
        int secondLargest;

        if (num1 > num2 && num1 > num3) {

            largest = num1;

            if (num2 > num3)
                secondLargest = num2;
            else
                secondLargest = num3;

        } 
        else if (num2 > num1 && num2 > num3) {

            largest = num2;

            if (num1 > num3)
                secondLargest = num1;
            else
                secondLargest = num3;

        } 
        else {

            largest = num3;

            if (num1 > num2)
                secondLargest = num1;
            else
                secondLargest = num2;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
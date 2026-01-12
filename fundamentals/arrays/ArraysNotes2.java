package fundamentals.arrays;

public class ArraysNotes2 {
    public static void main(String[] args) {
        // int[] array = { 20, 19, -20, 5, -1, 27, 19, 5 };

        // int min = array[0];

        // for (int index=0; index < array.length; index++ )
            // if (array[index] < min)
                // min = array[index];

        // System.out.println("The minimum of this array is: " + min);

        //int target = 6; //see if this value is in the array
       // int[] numbers = {0, 2, 4, 6, 8};
        //boolean targetFound = false;

        //for(int index=0; index < numbers.length; index++ ){
           // if( numbers[index] == target ) {
                //targetFound = true;
              //  break;

        //int[] numbers = {0, 0, 0, 0, 0};

        //boolean allSame = true;

        //for(int index=1; index < numbers.length; index++ ){
            //if( numbers[0] != numbers[index] ) {
                //allSame = false;
                //break;
            //}
        //}

        //System.out.println("All elements the same? " + allSame );

        //}
    
        //System.out.println("Target Found: " + targetFound );

        String[] names = {"George", "Jill", "Xinyi", "Ravi"};

        for(String name : names) {
            System.out.println("Name is " + name);
        }
    }
}




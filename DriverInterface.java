public interface DriverInterface {

   public int[] getListOfNumbers();   // Generate and return a sorted array of int values starting at 1 and ending at 10,000,000
   public int[] getTargets();   // Returns an int array containing values 500, 10000, 100000, 1000000, 5000000, 7500000, 10000000
   public RunTime runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes);   // Creates an instance of BinarySearch.java class and runs the search for the specified target in the listOfNumbers a total of numberOfTimes
   public RunTime runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes);   // Creates an instance of LinearSearch.java class and runs the search for the specified target in the listOfNumbers a total of numberOfTimes
}
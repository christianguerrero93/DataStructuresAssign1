public class Driver implements DriverInterface {

   @Override
   public int[] getListOfNumbers() {
       int[] arr = new int[10000000];
       for (int i = 0; i < 10000000; i++) {
           arr[i] = i + 1;
       }
       return arr;
   }

   
   @Override
   public int[] getTargets() {
       int[] arr = { 500, 10000, 100000, 1000000, 5000000, 7500000, 10000000 };

       return arr;
   }

   
   @Override
   public RunTime runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
       // Create BinarySearch object
       BinarySearch search = new BinarySearch();
       // Start search
       for (int i = 0; i < numberOfTimes; i++) {
           long startTime = System.nanoTime(); // Get start time
           System.out.println("Found " + target + " at " + search.search(listOfNumbers, target));
           long endTime = System.nanoTime(); // Get end time

           // Add runtime
           search.addRuntime(endTime - startTime);
       }

       return search;
   }

   
   @Override
   public RunTime runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
       // Create LinearSearch object
       LinearSearch search = new LinearSearch();
       // Start search
       for (int i = 0; i < numberOfTimes; i++) {
           long startTime = System.nanoTime(); // Get start time
           System.out.println("Found " + target + " at " + search.search(listOfNumbers, target));
           long endTime = System.nanoTime(); // Get end time

           // Add runtime
           search.addRuntime(endTime - startTime);
       }

       return search;
   }

   public static void main(String[] args) {

       // Create a Driver object
       Driver driver = new Driver();
       int[] listOfNumbers = driver.getListOfNumbers();
       int[] targets = driver.getTargets();
       int numberOfTimes = 1;

       for (int target : targets) {
           System.out.println("Searching for " + target);
           System.out.println("BinarySearch....");
           // Get runtimes
           RunTime r = driver.runBinarySearch(listOfNumbers, target, numberOfTimes);
           System.out.println("Displaying runtimes");
           long[] runtimes = r.getRunTimes();
           for (int i = 0; i < runtimes.length; i++) {
               System.out.println("Runtime " + (i + 1) + " - " + runtimes[i]);
           }
           
           System.out.println("\nLinearSearch....");
           // Get runtimes
           r = driver.runLinearSearch(listOfNumbers, target, numberOfTimes);
           System.out.println("Displaying runtimes");
           runtimes = r.getRunTimes();
           for (int i = 0; i < runtimes.length; i++) {
               System.out.println("Runtime " + (i + 1) + " - " + runtimes[i]);
           }
          
           System.out.println("\n----------------------\n");
       }

   }
}
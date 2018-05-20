public class LinearSearch extends RunTime implements SearchInterface {

   @Override
   public int search(int[] listOfNumbers, int target) {
       for (int i = 0; i < listOfNumbers.length; i++) {
           if (listOfNumbers[i] == target)   // If target is found return i
               return i;
       }
      
       return -1;
   }
}
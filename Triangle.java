public class Triangle {
  public static void main(String[] args) {
    int rows = 10, columns = rows / 2, length = 1;
    
    for (int count = 1; !(count > rows - 1);) {
      int spaces = length, counter = 1;
      
      while (!(spaces > 10)) {
         System.out.print(" ");
         spaces+=1;
      }
      
      do {
         System.out.print("*");
         counter+=1;
      } while (!(counter > 2 * length - 1));
      
      System.out.println();
      count+=1;
      
      if (count > columns) {
         length -= 1;
      } else {
         length += 1;
      }
    }
  }
}
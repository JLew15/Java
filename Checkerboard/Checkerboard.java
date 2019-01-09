public class Checkerboard{
public static void printCheckerboard(int numRows, int numCols){
for (int row=0; row<numRows; row++)
{

System.out.println("");
  for (int col=0; col<numCols; col++)
{
  if (row % 2 == 0 && col % 2 == 0){
    System.out.print("#");
  }
  else {
    System.out.print(" ");
  }
  if (row % 2 != 0 && col % 2 != 0){
    System.out.print("#");
  }
  else {
    System.out.print(" ");
  }
}

}
System.out.println("");
}
public static void main(String[] args) {
  printCheckerboard(3,5);
  printCheckerboard(4,3);
  printCheckerboard(8,8);

}
}

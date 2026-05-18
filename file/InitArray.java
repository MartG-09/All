public class InitArray {
  public static void main(String[] args) {

    int arrayLength = 10;
    
        int[] g = new int[arrayLength];

        for(int count = 0; count < g.length; count++){
            g[count] = 2+2*count;

//            System.out.printf("%5d%8d%n" , count , g[count]);
        }

                for(int counter = 0; counter < g.length; counter++){
                   System.out.printf("%5d%8d%n" , counter , g[counter]); 
                }

  }
}

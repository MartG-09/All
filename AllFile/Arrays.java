public class Arrays {
  public static void main(String[] args) {

    char[][] shars = new char[3][3];
     shars[0][0] = 'X';
     shars[0][1] = 'O';
     shars[0][2] = 'X';

     shars[1][0] = 'O';
     shars[1][1] = 'O';
     shars[1][2] = 'O';

     shars[2][0] = 'X';
     shars[2][1] = 'X';
     shars[2][2] = 'O';

    for(int i = 0; i < shars.length; i++){
        for(int j = 0; j <= 2; j++){
            System.out.print(shars[i][j] + " ");
        }
        System.out.println();
    }

        System.out.println();

    for(int i = 0; i < shars.length; i++){
        for(int j = 0; j <= 2; j++){
            if (shars[i][j] == 'X'){
            System.out.print("1 ");
        }
           else if (shars[i][j] == 'O'){
            System.out.print("0 ");
        }
       }
        System.out.println();
    }
  }
}

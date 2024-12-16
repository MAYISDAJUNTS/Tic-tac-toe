import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] a = new char[3][3];
        for (int w = 0; w < 3; w++) {
            for (int q = 0; q < 3; q++) {
                a[w][q] = '_';
            }
        }
        for (char[] aj:a) {
            System.out.println(aj);
        }

    isTrue(a);



    }
    static void isTrue (char[][]a ){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println("nshir tox");
            int x = scanner.nextInt();
            System.out.println("nshir syun");
            int y = scanner.nextInt();
            if ((i % 2 == 0)&&(a[x][y]=='_'))  {
                a[x][y] = 'x';
            } else if ((i % 2 != 0)&&(a[x][y])=='_') {
                a[x][y] = '0';

            } else {
                System.out.println("error");
                i=i-1;
            }
            for (char[] b : a) {
                System.out.println(Arrays.toString(b));
            }
          if   (isWin(a)){
              break;
          }
        }
    }

    static boolean isWin ( char[][] a){
        boolean iswin = true;

        if ((a[0][0] == 'x') && (a[0][1] == 'x') && (a[0][2]=='x')) {
            System.out.println("winner is x");
        }

        else if( (a[0][0] == '0') && (a[0][1] == '0') && (a[0][2]=='0') ) {
            System.out.println("winner is 0");
        }
      else if ((a[1][0] == 'x') && (a[1][1] == 'x') && (a[1][2]=='x')) {
            System.out.println("winner is x");
        }

       else if( (a[1][0] == '0') && (a[1][1] == '0') && (a[1][2]=='0') ) {
            System.out.println("winner is 0");
        }
        else if ((a[2][0] == 'x') && (a[2][1] == 'x') && (a[2][2]=='x')) {
            System.out.println("winner is x");
        }

       else if( (a[2][0] == '0') && (a[2][1] == '0') && (a[2][2]=='0') ) {
            System.out.println("winner is 0");
        }
       else if ((a[0][0] == 'x') && (a[1][1] == 'x') && (a[2][2]=='x')) {
            System.out.println("winner is x");
        }

        else if( (a[0][0] == '0') && (a[1][1] == '0') && (a[2][2]=='0') ) {
            System.out.println("winner is 0");
        }
        else if ((a[0][2] == 'x') && (a[1][1] == 'x') && (a[2][0]=='x')) {
            System.out.println("winner is x");
        }

       else if( (a[0][2] == '0') && (a[1][1] == '0') && (a[2][0]=='0') ) {
            System.out.println("winner is 0");
        }
        else if ((a[0][0] == 'x') && (a[1][0] == 'x') && (a[2][0]=='x')) {
            System.out.println("winner is x");
        }

        else if( (a[0][0] == '0') && (a[1][0] == '0') && (a[2][0]=='0') ) {
            System.out.println("winner is 0");
        }
        else if ((a[0][2] == 'x') && (a[1][2] == 'x') && (a[2][2]=='x')) {
            System.out.println("winner is x");
        }

        else if( (a[0][2] == '0') && (a[1][2] == '0') && (a[2][2]=='0') ) {
            System.out.println("winner is 0");
        } else{
            iswin = false;
            System.out.println("och voqi");
        }


        return iswin;

    }




}
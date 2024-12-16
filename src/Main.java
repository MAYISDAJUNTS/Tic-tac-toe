import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] a = new char[3][3];
        for (int w = 0; w < 3; w++) {
            for (int q = 0; q < 3; q++) {
                a[w][q] = ' ';
            }
        }

        for (int i = 0; i < 9; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if ((i % 2 == 0) && (isError(a,x,y))) {
                a[x][y] = 'x';
            } else if ((i % 2 != 0)&&(isError(a,x,y))) {
                a[x][y] = '0';

            }
            for (char[] b : a) {
                System.out.println(Arrays.toString(b));
            }
            isWin(a);
        }

    }
    static void isWin ( char[][] a){


        if ((a[0][0] == 'x') && (a[0][1] == 'x') && (a[0][2]=='x')) {
            System.out.println("winner is x");
        }

        if( (a[0][0] == '0') && (a[0][1] == '0') && (a[0][2]=='0') ) {
            System.out.println("winner is 0");
        }
        if ((a[1][0] == 'x') && (a[1][1] == 'x') && (a[1][2]=='x')) {
            System.out.println("winner is x");
        }

        if( (a[1][0] == '0') && (a[1][1] == '0') && (a[1][2]=='0') ) {
            System.out.println("winner is 0");
        }
        if ((a[2][0] == 'x') && (a[2][1] == 'x') && (a[2][2]=='x')) {
            System.out.println("winner is x");
        }

        if( (a[2][0] == '0') && (a[2][1] == '0') && (a[2][2]=='0') ) {
            System.out.println("winner is 0");
        }
        if ((a[0][0] == 'x') && (a[1][1] == 'x') && (a[2][2]=='x')) {
            System.out.println("winner is x");
        }

        if( (a[0][0] == '0') && (a[1][1] == '0') && (a[2][2]=='0') ) {
            System.out.println("winner is 0");
        }
        if ((a[0][2] == 'x') && (a[1][1] == 'x') && (a[2][0]=='x')) {
            System.out.println("winner is x");
        }

        if( (a[0][2] == '0') && (a[1][1] == '0') && (a[2][0]=='0') ) {
            System.out.println("winner is 0");
        }
        if ((a[0][0] == 'x') && (a[1][0] == 'x') && (a[2][0]=='x')) {
            System.out.println("winner is x");
        }

        if( (a[0][0] == '0') && (a[1][0] == '0') && (a[2][0]=='0') ) {
            System.out.println("winner is 0");
        }
        if ((a[0][2] == 'x') && (a[1][2] == 'x') && (a[2][2]=='x')) {
            System.out.println("winner is x");
        }

        if( (a[0][2] == '0') && (a[1][2] == '0') && (a[2][2]=='0') ) {
            System.out.println("winner is 0");
        }

    }
    static boolean isError (char[][]a, int x, int y){
        return a[x][y]!=' ';
    }



}
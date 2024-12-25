import java.util.Scanner;

public class NP_07_ticTakToe {
    public static void main(String[] args) {
        char [][] arr =new char[4][4];
        boolean check=false;
        int a=1,player=1;
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                arr[i][j]=' ';
            }
        }
        arr[0][0]='G';
        arr[0][1]='1';
        arr[0][2]='2';
        arr[0][3]='3';
        arr[1][0]='1';
        arr[2][0]='2';
        arr[3][0]='3';
        printArray(arr);
        while(check==false) {
            getInput(arr, player);
            printArray(arr);
            check=winCase(arr);
            if (check==true)
            {
                break;
            }
            check=boardCheck(arr);
            if (check==true)
            {
                break;
            }
            a++;
            player=a%2;
        }
    }
    static void printArray(char arr[][])
    {
        boolean check=false;
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
    }
    static void getInput(char arr[][],int player)
    {
        char input;
        if(player==1)
        {
            input='O';
        }
        else if(player==0)
        {
            input='X';
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("choose Row number from 1,2, and 3");
        int row=sc.nextInt();
        System.out.println("choose Columb number from 1,2, and 3");
        int columb=sc.nextInt();
        try
        {
            if (arr[row][columb]==' ') {
                if (player == 1) {
                    arr[row][columb] = 'X';
                }
                if (player == 0) {
                    arr[row][columb] = 'O';
                }
            }
            else
            {
                System.out.println("You input is invalid try again");
                getInput(arr,player);
            }
        } catch (Exception e) {
            System.out.println("You put the invalid row and columb please play again");
            getInput(arr,player);
        }
    }
    static boolean winCase(char arr[][])
    {
        if (arr[1][1]=='X' && arr[2][1]=='X' && arr[3][1]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }
        else if (arr[1][2]=='X' && arr[2][2]=='X' && arr[3][2]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }
        else if (arr[1][3]=='X' && arr[2][3]=='X' && arr[3][3]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }
        else if (arr[1][1]=='X' && arr[1][2]=='X' && arr[1][3]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }
        else if (arr[2][1]=='X' && arr[2][2]=='X' && arr[2][3]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }
        else if (arr[3][1]=='X' && arr[3][2]=='X' && arr[3][3]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }
        else if (arr[1][1]=='X' && arr[2][2]=='X' && arr[3][3]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }
        else if (arr[1][3]=='X' && arr[2][2]=='X' && arr[3][1]=='X')
        {
            System.out.println("Player X win the game");
            return true;
        }

        //Case for Player O winning

        else if (arr[1][1]=='O' && arr[2][1]=='O' && arr[3][1]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else if (arr[1][2]=='O' && arr[2][2]=='O' && arr[3][2]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else if (arr[1][3]=='O' && arr[2][3]=='O' && arr[3][3]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else if (arr[1][1]=='O' && arr[1][2]=='O' && arr[1][3]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else if (arr[2][1]=='O' && arr[2][2]=='O' && arr[2][3]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else if (arr[3][1]=='O' && arr[3][2]=='O' && arr[3][3]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else if (arr[1][1]=='O' && arr[2][2]=='O' && arr[3][3]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else if (arr[1][3]=='O' && arr[2][2]=='O' && arr[3][1]=='O')
        {
            System.out.println("Player O win the game");
            return true;
        }
        else
        {
            return false;
        }
    }


    static boolean boardCheck(char arr[][])
    {
        boolean result=true;
        char a='a';
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                if(arr[i][j]==' ')
                {
                    a=' ';
                }
            }
        }
        if(a==' ')
        {
            result=false;
        }
        else
        {
            System.out.println("No one win");
        }
        return result;
    }
}
//Angkan baidya
// 112309655
// RO1

import java.io.*;
import java.util.*;


public class BlockTracer { /** this class reads a c program from a text file and prints out the initial values
                                within each specific block of code **/
    static Scanner keyboard;
    static Stack<Block> a = new Stack<Block>();
    static Stack<Block> temp = new Stack<>();
    ArrayList<Variable> all = new ArrayList<Variable>();
    private static char[5][5];



    public static void main(String[] args) { /** The main method calls upon the readLines method**/

        String result = "";
        String keyphrase = "hello";
        for (int i = 0; i < keyphrase.length(); i++) {
            if (!result.contains(String.valueOf(keyphrase.charAt(i)))) {
                result += String.valueOf(keyphrase.charAt(i));
            }
        }
        String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","k","l","m","n","o","p","q","r","s","t","u","v",
                "w","x","y","z"};
        List<String> al =
                new ArrayList<String>(Arrays.asList(alphabet));
        System.out.println(al);

        for (int i =0;i<result.length();i++){

            if (al.contains(Character.toString(result.charAt(i)))){
                al.remove(al.indexOf(Character.toString(result.charAt(i))));

            }

        }
        String empty = "";
        for (int i = 0; i < al.size(); i++){
            empty += al.get(i);
        }
        String result1;
        result1 = result + empty;


        int counter = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                key[i][j] = result1.charAt(counter);
                System.out.print(key[i][j] + " ");
                counter++;
            }
            System.out.println();

        }

        int row = 0;
        int col = 0;
        char c = 'b';
        int[] key1 = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (key[i][j] == c) {
                    row = key1[i];
                    col = key1[j];
                    key1[0] = i;
                    key1[1] = j;
                    break;
                }
            }
        }
        System.out.println(row);
    }





    }

    public char[][] getKeyTable(){
        return key;
    }

    public static int findRow(char c){
        int row = 0;
        int[] key = new int[2];
        if (c == 'j')
            c = 'i';
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (getKeyTable()[i][j] == c)
                {
                    row = key[i];
                    key[0] = i;
                    key[1] = j;
                    break;
                }
            }
        }
        return row;
    }

    public int findCol(char c){
        int col = 0;
        int[] key = new int[2];
        if (c == 'j')
            c = 'i';
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (getKeyTable()[i][j] == c)
                {
                    col = key[j];
                    key[0] = i;
                    key[1] = j;
                    break;
                }
            }
        }
        return col;
    }


}









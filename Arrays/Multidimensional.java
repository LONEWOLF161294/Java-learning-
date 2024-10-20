package Arrays;

import java.util.Arrays;

public class Multidimensional {
// its a matrix of 3 numbers and we need to print the smallest number.

    public static void main(String[] args){

        int matrix[][] = new int[3][3];
        matrix[0][0]=4;
        matrix[0][1]=45;
        matrix[0][2]=2;
        matrix[1][0]=77;
        matrix[1][1]=77;
        matrix[1][2]=7;
        matrix[2][0]=87;
        matrix[2][1]=17;
        matrix[2][2]=7;
         int com = matrix[0][0];


        for(int i=0;i<3;i++){
            for(int k=0;k<3;k++){

                if(matrix[i][k]<com){
                    com =matrix[i][k];
                }
            }
        }
        System.out.println(com);








    }




}

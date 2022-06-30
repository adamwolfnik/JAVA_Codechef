import java.util.*;
public class rotate {
    public static void main(String[] args){
        int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
        rotate(m1);
    }
    public static void rotate(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        int [][] matrix2=new int[col][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=matrix[col-1-j][i];
            }
        }
    System.out.println(Arrays.deepToString(matrix2).replace(" ",""));
    }
}

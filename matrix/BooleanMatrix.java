import java.util.*;

public class BooleanMatrix{
	public static void main(String[] args){
		int[][] arr = {{1,0}, {0,0}};
		int row = arr.length;
		int col = arr[0].length;
		booleanMatrix(arr);
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

	private static void booleanMatrix(int[][] arr){
		
	}
}


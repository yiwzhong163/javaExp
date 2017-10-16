import java.util.ArrayList;
public class Exp2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] d = constructMagicSquares(3);
		printMatrix(d);
		
		printMatrix(magicSquares(3));
	}
	
	
	public static int[][] constructMagicSquares(int n) {
		int[][] d = new int[n][n];
		int row = n - 1;
		int col = n / 2;
		for (int i = 1; i <= n*n; i++) {
			d[row][col] = i;
			row = (row+1) % n;
			col = (col+1) % n;
			if (d[row][col] != 0 ) {
				row = (row - 1 + n) % n;
				col = (col - 1 + n) % n;
				row = row - 1;
			}
			
		}
		
		return d;
	}
	
	public static ArrayList<ArrayList<Integer>>  magicSquares(int n) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i<n; i++) {
			a.add(new ArrayList<Integer>());
			for (int j=0; j<n; j++) {
				a.get(i).add(0);
			}
		}
		int row = n - 1;
		int col = n / 2;
		for (int i = 1; i <= n*n; i++) {
			a.get(row).set(col,i);
			row = (row+1) % n;
			col = (col+1) % n;
			if (a.get(row).get(col) != 0 ) {
				row = (row - 1 + n) % n;
				col = (col - 1 + n) % n;
				row = row - 1;
			}
			
		}
		
		return a;
	}
	
	public static void printMatrix(ArrayList<ArrayList<Integer>> d) {
		for (int i=0; i<d.size(); i++) {
			for (int j=0; j<d.get(i).size(); j++) {
				System.out.printf("%d\t", d.get(i).get(j));
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(int[][] d) {
		for (int i=0; i<d.length; i++) {
			for (int j=0; j<d[i].length; j++) {
				System.out.printf("%d\t", d[i][j]);
			}
			System.out.println();
		}
	}

}

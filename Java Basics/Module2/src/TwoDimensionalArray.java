
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Array2D[][] = new String[3][4];
		
		Array2D[0][0] = "A01";
		Array2D[0][1] = "B01";
		Array2D[0][2] = "C01";
		Array2D[0][3] = "D01";
		
		Array2D[1][0] = "A11";
		Array2D[1][1] = "B11";
		Array2D[1][2] = "C11";
		Array2D[1][3] = "D11";
		
		Array2D[2][0] = "A21";
		Array2D[2][1] = "B21";
		Array2D[2][2] = "C21";
		Array2D[2][3] = "D21";
		
		System.out.println("Number of Rows are : " + Array2D.length);
		System.out.println("Number of Columns are : " + Array2D[0].length);
		
		for (int i=0; i<Array2D.length; i++)
		{
			for (int j=0; j<Array2D[i].length; j++)
			{
				System.out.println("The elements of the given 2 Dimensional Array are : " + Array2D[i][j]);
			}
		}
		
		for (int i=0; i<Array2D.length; i++)
		{
			for (int j=0; j<Array2D[i].length; j++)
			{
				System.out.print(Array2D[i][j]);
			}
		}
	}

}

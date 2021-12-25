package Study;

public class UdemyTwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int row =3;
		int cols =3;
		int table[][ ]= new int [row][cols];
		
		
		table[0][0]=10;
		table[0][1]=11;
		table[0][2]=12;
		
		table[1][0]=20;
		table[1][1]=21;
		table[1][2]=22;
		
		table[2][0]=31;
		table[2][1]=32;
		table[2][2]=33;
		
		System.out.println(table.length);  //print row length
		System.out.println(table[0].length); //print columnn length
		
		
		System.out.println(table[0][0]);
		
		for(int i=0;i<row;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print("  "+table[i][j]);
				
			}
			System.out.println("    ");
		}
		
	}

}

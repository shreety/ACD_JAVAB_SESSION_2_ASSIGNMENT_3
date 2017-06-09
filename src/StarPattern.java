public class StarPattern
{
	public static void main(String [] s)
	{
		int row_iteration,col_iteration=0;
		int number_of_lines=5;
		for(row_iteration=0;row_iteration<number_of_lines;row_iteration++)
		{
			for(col_iteration=0;col_iteration<number_of_lines;col_iteration++)
			{
				if( row_iteration==col_iteration || col_iteration == number_of_lines-row_iteration-1)
						{
					System.out.print("*");
						}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

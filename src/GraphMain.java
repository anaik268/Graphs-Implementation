/* Note:
 *
 * This code was not written by me and I do not take any credit. I had simply typed it up so I can 
 * better understand how graphs work. 
 * 
 * This was written by Sesh Venugopal, a professor from Rutgers. You can watch his video at the following link:
 * https://www.youtube.com/watch?v=zVrPdF7f4-I
 */

import java.io.IOException;
import java.util.Scanner;

public class GraphMain {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter graph input file name: ");
		String file = sc.nextLine();
		Graph graph = new Graph(file);
		graph.print();

	}
}
/* Note:
 * 
 * This code was not written by me and I do not take any credit. I had simply typed it up so I can 
 * better understand how graphs work. 
 * 
 * This was written by Sesh Venugopal, a professor from Rutgers. You can watch his video at the following link:
 * https://www.youtube.com/watch?v=zVrPdF7f4-I
 */

import java.util.*;
import java.io.*;

public class Graph {

	Vertex[] adjLists;

	public Graph(String file) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(file));

		String graphType = sc.next();
		boolean undirected = true;
		if (graphType.equals("directed")) {
			undirected = false;
		}

		adjLists = new Vertex[sc.nextInt()];

		// read vertices
		for (int v = 0; v < adjLists.length; v++) {
			adjLists[v] = new Vertex(sc.next(), null);
		}

		// read edges
		while (sc.hasNext()) {

			// read vertex names and translate to vertex numbers
			int v1 = indexForName(sc.next());
			int v2 = indexForName(sc.next());

			// add v2 to front of v1's adjacency list and
			// add v1 to front of v2's adjacency list
			adjLists[v1].adjList = new Neighbor(v2, adjLists[v1].adjList);
			if (undirected) {
				adjLists[v2].adjList = new Neighbor(v1, adjLists[v2].adjList);
			}
		}
	}

	int indexForName(String name) {
		for (int v = 0; v < adjLists.length; v++) {
			if (adjLists[v].name.equals(name)) {
				return v;
			}
		}
		return -1;
	}

	public void print() {
		System.out.println();
		for (int v = 0; v < adjLists.length; v++) {
			System.out.print(adjLists[v].name);
			for (Neighbor nbr = adjLists[v].adjList; nbr != null; nbr = nbr.next) {
				System.out.print(" --> " + adjLists[nbr.vertexNum].name);
			}
			System.out.println("\n");
		}
	}
}
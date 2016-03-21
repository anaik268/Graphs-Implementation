/*
 * Note:
 * 
 * This code was not written by me and I do not take any credit. I had simply typed it up so I can 
 * better understand how graphs work. 
 * 
 * This was written by Sesh Venugopal, a professor from Rutgers. You can watch his video at the following link:
 * https://www.youtube.com/watch?v=zVrPdF7f4-I
 */
public class Neighbor {
	public int vertexNum;
	public Neighbor next;
	public Neighbor(int vNum, Neighbor neighbor) {
		this.vertexNum = vNum;
		this.next = neighbor;
	}
}


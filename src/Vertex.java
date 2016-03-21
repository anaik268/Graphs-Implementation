
public class Vertex {
	public String name;
	public Neighbor adjList;
	
	Vertex(String name, Neighbor neighbors) {
		this.name = name;
		this.adjList = neighbors;
	}
}

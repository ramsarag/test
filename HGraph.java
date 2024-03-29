import java.util.List;
import java.util.ArrayList;

public class HGraph {
	private int vCount;
	private int[][] adj;
	
	public int getvCount() {
		return vCount;
	}

	public int[][] getAdj() {
		return adj;
	}

	public HGraph(int vCount) {
		this.vCount = vCount;
		adj = new int[vCount][vCount];
		for (int i = 0; i < vCount; i++) {
			for (int j = 0; j < vCount; j++) {
				if (i != j) {
					adj[i][j] = 0;
				}

			}
		}
	}

	public void addEdge(int i, int j) {
		adj[i][j] = 1;
	}

	public void removeEdge(int i, int j) {
		adj[i][j] = 0;
	}

	public boolean hasEdge(int i, int j) {
		if (adj[i][j] != 0) {
			return true;
		}
		return false;
	}

	public List<Integer> neighbours(int vertex) {
		List<Integer> edges = new ArrayList<Integer>();
		for (int i = 0; i < vCount; i++)
			if (hasEdge(vertex, i))
				edges.add(i);
		return edges;
	}

	public void printGraph() {
		for (int i = 0; i < vCount; i++) {
			List<Integer> edges = neighbours(i);
			System.out.print(i + ": ");
			for (int j = 0; j < edges.size(); j++) {
				System.out.print(edges.get(j) + " ");
			}
			System.out.println();
		}
	}
}

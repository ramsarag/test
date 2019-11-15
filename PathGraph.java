public class PathGraph {
    HGraph g;
    public void hamCircuit(k){
        do {
            nextVertex(k);
            if(x[k] == 0) return;
            if(k == n) //print g
            else
               hamCircuit(k + 1); 
        }while(true)
    }
    public void nextVertex(k){
        do {
            x[k] =(x[k] +1 ) mod(n+1);
            if(x[k] == 0) return;
            if(g(x[k-1],x[k]) != 0) {
                for( j=1 to k-1){
                    do {
                        if(x[j] == x[k]) break;
                        if(j==k || k==n) && g(x[n],x[1]) !=0
                            return;
                    }while(true);
                }
            }
        }while(true);
    }
	public static void main(String[] args) {
		HGraph g = new HGraph(3);
		int[] x = {{0,1,-1},{-1,1,1},{1,1,1}};
		System.out.println("Graph:");
		// add Edges
 
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 1);
		g.addEdge(2, 0);

		
		// print Graph
		g.printGraph();

		// Hamiltonian Circuit Algorithm
		System.out.println("Backtracking Hamiltonian Circuit Algorithm:");
		hamCircuit(0);
	}
}

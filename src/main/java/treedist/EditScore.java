package treedist;


public interface EditScore {
    public double replace(int node1, int node2) throws InvalidOperationException;
	
    public double delete(int node1) throws InvalidOperationException;
	
    public double insert(int node2) throws InvalidOperationException;
}

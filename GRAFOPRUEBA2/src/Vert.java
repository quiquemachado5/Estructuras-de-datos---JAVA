import java.util.*;
 
public class Vert implements Comparable {
 
	private boolean visited;
	private String name;
	private List List;
	private double dist = Double.MAX_VALUE;
	private Vert pr;
        public Edge edge;
	
 
	public Vert(String name) {
		this.name = name;
		this.List = new ArrayList();
	}
	
	public List getList() {
		return List;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	
 
	public void setList(List List) {
		this.List = List;
	}
	
	public void addNeighbour(Edge edge) {
		this.List.add(edge);
	}
	
	public boolean Visited() {
		return visited;
	}
 
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
 
	public Vert getPr() {
		return pr;
	}
 
	public void setPr(Vert pr) {
		this.pr = pr;
	}
 
	public double getDist() {
		return dist;
	}
 
	public void setDist(double dist) {
		this.dist = dist;
	}
 
	@Override
	public String toString() {
		return this.name;
	}
 
	public int compareTo(Vert otherV) {
		return Double.compare(this.dist, otherV.getDist());
	}

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
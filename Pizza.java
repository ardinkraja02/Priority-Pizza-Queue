
public class Pizza implements Comparable<Pizza> {
	
	int priority;
	String order;
	
	public Pizza(int priority, String order) {
		this.priority = priority;
		this.order = order;
	}
	public String toString() {
		return priority+ ": " + order;
	}
	public int compareTo(Pizza p) {
		if (p.priority > priority) return 1;
		if (p.priority < priority) return -1;
		return 0;
	}

}

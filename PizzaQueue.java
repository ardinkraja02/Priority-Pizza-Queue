
public class PizzaQueue {
	Pizza[] list = new Pizza[6];
	int size = 0;
	
	public void insert(Pizza p) {
		int hole = ++size;
		
		if (size == list.length) {
			Pizza temp[] = new Pizza[size*2];
			for (int i = 0; i<list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}

		while (true) {
			if(hole == 1) break;
			
			int parent = hole/2;
			
			if(p.compareTo(list[parent]) == 1) break;
			
			list[hole] = list[parent];
			hole = parent;
			
			
		}
		list[hole] = p;
	}
	public Pizza delete() {
		if (size ==0) return null;
		
		Pizza result = null;
		 result = list[1];
		Pizza temp = list[size--];
		
		int hole = 1;
		
		while (true) {
			int child = hole * 2;
			if (child > size) break;
			
			if (child != size && list[child +1].compareTo(list[child])<0) child++;	
			
			if (list[child].compareTo(temp)<0) {
				list[hole] = list[child];
			}
			else {
				break;
			}
			
			hole = child;
		}
		
		list[hole] = temp;
		return result;
	}
	
	public boolean isEmpty() {
		if (size == 0) return true;
		return false;
	}
	public void debug() {
		for (int i = 1; i<= size; i++) {
			System.out.println(list[i]);
		}
	}
	public void combine(PizzaQueue pq) {
		while (pq.isEmpty() == false) {
			insert(pq.delete());
		}
	}
	public Pizza[] purge() {
		Pizza[] p = new Pizza[size];
		int counter = 0;
		while (!isEmpty()) {
			p[counter]=delete();
			counter++;
		}
		return p;
		}
	}





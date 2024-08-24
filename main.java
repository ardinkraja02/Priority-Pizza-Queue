
public class main {
	
	/*
	
	Based on your implementation, what is the big O for the following methods:
	
	insert(): O(n) remove():O(log(n))  isEmpty():O(1)
	
	Based on your implementation, what is the big O for combine() and why?:
	
	The runtime is O(nlog(n)) because within the loop, it calls insert which also has 
	a loop within it. 
	
	Based on your implementation, what is the big O for purge() and why?:
	
	The runtime of purge should be O(nlogn) because there is a loop called that
	goes through every element of the array and calls delete which has a runtime of
	log(n) making the runtime nlog(n).	
	*/
	
	public static void main(String[] args) {
	// These are just some examples, be sure to test everything!
	PizzaQueue pq = new PizzaQueue();
	pq.insert(new Pizza(10, "Pepperoni Pizza"));
	pq.insert(new Pizza(5, "Mushroom Pizza"));
	pq.insert(new Pizza(100, "Super Duper Pizza"));
	pq.insert(new Pizza(25, "Chicken Pizza"));
	pq.debug();
	System.out.println("----");
	System.out.println(pq.delete());
	System.out.println();
	pq.debug();
	System.out.println("----");
	PizzaQueue paceEvent = new PizzaQueue();
	paceEvent.insert(new Pizza(1, "Plain Pizza"));
	paceEvent.insert(new Pizza(12, "Sausage Pizza"));
	paceEvent.insert(new Pizza(3, "Salad Pizza"));
	paceEvent.debug();
	System.out.println("----before combine----");
	pq.combine(paceEvent);
	pq.debug();
	System.out.println("----After combine----");
	Pizza[] finalList = pq.purge();
	for (Pizza p : finalList) {
	System.out.println(p);
	}
	}
	}
	



package practice;

public interface JavaApplication {
	public static void execution() {
		System.out.println("Actual array");
		Integer[] integers ={1,-2,3,-4,5,-6};
		Array.display(integers);
		SortingAlgorithm.ascendingOrder(integers);
		Array.display(integers);
		SortingAlgorithm.descendingOrder(integers);
		Array.display(integers);
		
		
	}

}

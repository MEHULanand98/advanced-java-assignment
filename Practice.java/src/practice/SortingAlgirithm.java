package practice;

public interface SortingAlgorithm {
	public static void ascendingOrder(Integer[] integers) {
		System.out.println("ascending order");
		for(int i = 0;i< integers.length - 1;i++) {
			for(int j =0; j<integers.length -1; J++) {
				if(integers[j] > integers[j+1]) {
					int temp = 0;
					temp = integers[j];
					integers[j]=integers[j+1];
					integers[j+1] =temp;
				}
			}
		}
	}
	public static void descendingOrder(Integer[] integers) {
		System.out.println("descending order");
		for(int i = 0;i< integers.length - 1;i++) {
			for(int j =0; j<integers.length -1; J++) {
				if(integers[j] < integers[j+1]) {
					int temp = 0;
					temp = integers[j];
					integers[j]=integers[j+1];
					integers[j+1] =temp;
				}
			}
		}
	}

}

public class ListState {
	
	private int sum;
	private int count;

	public ListState() {
		sum = 0;
		count = 0;
	}

	public int getState() {
		return sum;
	}

	public void setState(NodeInterface node) {
		if (count < 100) {
			sum += node.element();
		} else {
			sum -= node.element();
		}
		count++;
	}

}
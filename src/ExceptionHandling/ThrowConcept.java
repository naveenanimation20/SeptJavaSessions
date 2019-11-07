package ExceptionHandling;

public class ThrowConcept {

	public static void main(String[] args) {

		try {
			throw new Exception("This is my exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String colValue = null;
		if (colValue == null) {
			try {
				throw new Exception("ColumnValueNotFoundException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

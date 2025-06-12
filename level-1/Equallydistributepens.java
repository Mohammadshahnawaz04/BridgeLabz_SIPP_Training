package operators;

public class Equallydistributepens {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pens=14;
		int students=3;
		int remaining=pens % students;
		int penperstudent=pens /students;
		System.out.println("The Pen Per Student is " + penperstudent + " and the remaining pen not distributed is " + remaining);

	}
}

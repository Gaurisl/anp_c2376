package Question1;

public class Degree {
	public void getDegree() {
		System.out.println("I got a Degree");
	}
}
class undergraduate extends Degree{
	public void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}
class postgraduate extends Degree{
	public void getDegree() {
		System.out.println("I am a Postgraduate");
		
		}
}
   class Ans{
   public static void main(String[] args) {
	undergraduate a = new undergraduate ();
	postgraduate b = new postgraduate ();
	a.getDegree();
	b.getDegree();
	
   }	
}


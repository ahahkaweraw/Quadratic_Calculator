import javax.swing.JOptionPane;
public class QuadraticFormula {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Type in variable A"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Type in variable B"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Type in variable C"));
		double bneg;
		bneg=b-(b*2);
		double negfourac;
		negfourac=-4*(a*c);
		System.out.println(negfourac);
		double bsquare;
		bsquare=b * b;
		double sr;
		sr=Math.sqrt(bsquare + negfourac);
		double plus;
		double sub;
		plus=(bneg + sr)/(a * 2);
		sub=(bneg - sr)/(a * 2);
		JOptionPane.showMessageDialog(null, "The answer is " + plus + " or " + sub);
	}

}

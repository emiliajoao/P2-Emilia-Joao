package pt.uc.dei.aor.paj;

import java.util.Iterator;
import java.util.TreeMap;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class apresentaResultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp="-sqrt(2)+sqrt(20)+21+ sin(20)+log2(20)-(-89)-(-1)/(21-sqrt(24))";
		
		Calculadora calc=new Calculadora();
		calc.setExp(exp);
		String result=calc.getExp();
		System.out.println(result);
		
		Estatistica est=new Estatistica();
		est.setResultado(exp);
		System.out.println(est.getResultado());
		Historial hist=new Historial();
		hist.setHist(exp);
		String exp2="-sqrt(2)+sqrt(20)+21";
		hist.setHist(exp2);
		System.out.println("Historial");
		System.out.println(hist.getHist());
	}
}

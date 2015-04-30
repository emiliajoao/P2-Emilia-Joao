package pt.uc.dei.aor.paj;

import java.io.Serializable;
import java.util.EmptyStackException;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.operator.Operator;

@Named
@SessionScoped

public class Calculadora implements Serializable{
	private static final long serialVersionUID = 6030549976219071079L;
	
	private String exp;
	private String valor;
	
	public Calculadora() {
		this.exp = "";
		this.valor="";
	}

	Operator factorial = new Operator("!", 1, true, Operator.PRECEDENCE_POWER + 1) {

	    @Override
	    public double apply(double... args) {
	        final int arg = (int) args[0];
	        if ((double) arg != args[0]) {
	            throw new IllegalArgumentException("Operand for factorial has to be an integer");
	        }
	        if (arg < 0) {
	            throw new IllegalArgumentException("The operand of the factorial can not be less than zero");
	        }
	        double result = 1;
	        for (int i = 1; i <= arg; i++) {
	            result *= i;
	        }
	        return result;
	    }
	};
	
	public String getExp(){
		String result;

		try {
			Expression e = new ExpressionBuilder(this.exp)
			.operator(factorial)
			.build();
			
			double result1 = e.evaluate();
			
			result=result1+"";
		} catch (NumberFormatException nfe) {
			result="NumberFormatException";
		}catch(EmptyStackException ne){
			result="Parêntesis incorrectos";
		}catch(ArithmeticException ne){
			result="Divisao por zero";
		}catch(IllegalArgumentException ne){
			result="Argumentos inválidos";
		}

		setExp(result);
		return result;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}
	
	public String getValor() {
		 return valor;
	}

	public void setValor(String exp) {
		valor=exp;
		
	}

}

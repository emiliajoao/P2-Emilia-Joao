package pt.uc.dei.aor.paj;

import java.io.Serializable;
import java.util.EmptyStackException;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
@Named
@SessionScoped
public class Calculadora implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exp;
	public Calculadora() {
		super();
		this.exp = "";
	}

	public String getExp(){
		String result;

		try {
			Expression e = new ExpressionBuilder(this.exp)
			.build();
			double result1 = e.evaluate();
			result=result1+"";
		} catch (NumberFormatException nfe) {
			result="NumberFormatException";
		}catch(EmptyStackException ne){
			result="Par�ntesis incorrectos";
		}catch(ArithmeticException ne){
			result="Divisao por zero";
		}catch(IllegalArgumentException ne){
			result="Argumentos inv�lidos";
		}


		return result;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

}

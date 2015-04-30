package pt.uc.dei.aor.paj;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
 
@ManagedBean(name = "operFuncao")
@ApplicationScoped
public class OperFuncao {

	
    
	    private final static String[] operadores;
	     
	    private final static String[] funcoes;
	     
	    static {
	        funcoes = new String[10];
	        funcoes[0] = "adi�ao";
	        funcoes[1] = "sub";
	        funcoes[2] = "*";
	        funcoes[3] = "/";
	        funcoes[4] = "log";
	        funcoes[5] = "fact";
	        funcoes[6] = "exp";
	        funcoes[7] = "%";
	        funcoes[8] = "cos";
	        funcoes[9] = "sin";
	         
	        operadores = new String[10];
	        operadores[0] = "+";
	        operadores[1] = "-";
	        operadores[2] = "*";
	        operadores[3] = "/";
	        operadores[4] = "log";
	        operadores[5] = "fact";
	        operadores[6] = "exp";
	        operadores[7] = "sinh";
	        operadores[8] = "cos";
	        operadores[9] = "sin";
	        
	    }
	     
	    public List<Funcao> createOpe(int size) {
	        List<Funcao> list = new ArrayList<Funcao>();
	        for(int i = 0 ; i < 10 ; i++) {
	            list.add(new Funcao(getOperador(i), getFuncao(i)));
	        }
	         
	        return list;
	    }
	     
	    private String getOperador(int i) {
	        return operadores[i];
	    }
	     
	    private String getFuncao(int i) {
	        return funcoes[i];
	    }
}

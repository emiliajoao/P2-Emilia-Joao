package pt.uc.dei.aor.paj;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Funcao> op;

	@ManagedProperty("#{operFuncao}")
	private OperFuncao funcao;

	@PostConstruct
	public void init() {
		op = funcao.createOpe(10);
	}

	public List<Funcao> getOpe() {
		return op;
	}

	public void setService(OperFuncao func) {
		this.funcao = func;
	}
}

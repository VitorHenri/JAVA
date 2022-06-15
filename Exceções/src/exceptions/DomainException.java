package exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 411090309814071454L;
	
	public DomainException(String msg) {
		super(msg);
	}
	

}

package estruturadedados.base;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (tamanho < elementos.length) {
			this.elementos[tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	public boolean adiciona(T elemento, int posicao) {
		this.aumentaCapacidade();
		if (!(posicao <= tamanho && posicao > 0)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i = tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	public boolean estaVazia() {
		return this.tamanho==0;
	}

	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i=0;i<tamanho;i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		s.append("]");
		return s.toString();
	}
}

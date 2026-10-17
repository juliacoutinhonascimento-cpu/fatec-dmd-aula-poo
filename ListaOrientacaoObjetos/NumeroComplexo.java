package br.edu.sp.cps.fatec.barueri.dmd.aula7;

public class NumeroComplexo {
	
	private double numreal;
	private double numimaginario;
	
	public NumeroComplexo() {
		this(3 , 8);
	}
	
	public NumeroComplexo(double numreal, double numimaginario) {
		
		this.numreal = numreal;
		this.numimaginario = numimaginario;
		
}

	public double getNumreal() {
		return numreal;
}

	public void setNumreal(double numreal) {
		this.numreal = numreal;
}

	public double getNumimaginario() {
		return numimaginario;
}

	public void setNumimaginario(double numimaginario) {
		this.numimaginario = numimaginario;
}
	
	public NumeroComplexo Soma(NumeroComplexo outro) {
		
		return new NumeroComplexo(
                this.numreal + outro.numreal,
                this.numimaginario + outro.numimaginario
        );	
}
	
	public NumeroComplexo Subtracao(NumeroComplexo outro) {
		return new NumeroComplexo(
			this.numreal - outro.numreal,
			this.numimaginario - outro.numimaginario
	);

}
	
	public NumeroComplexo Multiplicacao(NumeroComplexo outro) {
		
		double a = this.numreal * outro.numreal
                    - this.numimaginario * outro.numimaginario;

		double b = this.numreal * outro.numimaginario
                    + this.numimaginario * outro.numreal;
   
		return new NumeroComplexo(a,b);

}
	
	public NumeroComplexo Divisao(NumeroComplexo outro){
		
		double d = outro.numreal * outro.numreal
                       + outro.numimaginario * outro.numimaginario;

    if (d == 0) {
        throw new ArithmeticException(
            "Não é possível dividir por zero."
        );
    }
	return outro;
	
	

}
	}

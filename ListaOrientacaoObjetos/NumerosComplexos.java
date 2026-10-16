public class NumerosComplexos {
	
	private double numreal;
	private double numimaginario;
	
	public NumerosComplexos(double numreal, double numimaginario) {
		
		this.setNumreal(numreal);
		this.setNumimaginario(numimaginario);
		
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
	
	public NumerosComplexos Soma(NumerosComplexos outro) {
            return new NumerosComplexos(
                this.numreal + outro.numreal,
                this.numimaginario + outro.numimaginario
            );

    }

	public NumerosComplexos Subtracao(NumerosComplexos outro) {
			return new NumerosComplexos(
				this.numreal - outro.numreal,
				this.numimaginario - outro.numimaginario
			);

	}

	public NumerosComplexos Multiplicacao(NumerosComplexos outro) {
		
			double novonumnumreal = this.numreal * outro.numreal
                        - this.numimaginario * outro.numimaginario;

			double novonumnumimaginario = this.numreal * outro.numimaginario
                        + this.numimaginario * outro.numreal;
        return new NumerosComplexos(novonumnumreal,novonumnumimaginario);

	}

	public NumerosComplexos Divisao(NumerosComplexos outro) {
		
			double denominador = outro.numreal * outro.numreal
                           + outro.numimaginario * outro.numimaginario;

        if (denominador == 0) {
            throw new ArithmeticException(
                "Não é possível dividir por zero."
            );
        }

        double novonumreal = (this.numreal * outro.numreal
                         + this.numimaginario * outro.numimaginario)
                         / denominador;

        double novonumimaginario = (this.numimaginario * outro.numreal
                               - this.numreal * outro.numimaginario)
                               / denominador;

        return new NumerosComplexos(novonumreal, novonumimaginario);

	}
	@Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof NumerosComplexos)) {
            return false;
        }

        NumerosComplexos outro = (NumerosComplexos) objeto;

        return Double.compare(this.numreal, outro.numreal) == 0
            && Double.compare(
                this.numimaginario, outro.numimaginario
            ) == 0;
    }

    @Override
    public int hashCode() {
        int resultado = Double.hashCode(numreal);
        resultado = 31 * resultado
                  + Double.hashCode(numimaginario);
        return resultado;
    }

    // h) Representação em string
    @Override
    public String toString() {
        if (numimaginario < 0) {
            return numreal + " - " + (-numimaginario) + "i";
        }

        return numreal + " + " + numimaginario + "i";
    }

    // i) Módulo
    public double modulo() {
        return Math.sqrt(
            numreal * numreal + numimaginario * numimaginario
        );
    }

}

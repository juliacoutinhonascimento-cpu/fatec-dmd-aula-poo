public class Ex3 {
	
	private double numreal;
	private double numimaginario;
	
	public Ex3(double numreal, double numimaginario) {
		
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
	
	public Ex3 Soma(Ex3 outro) {
            return new Ex3(
                this.numreal + outro.numreal,
                this.numimaginario + outro.numimaginario
            );

    }

	public Ex3 Subtracao(Ex3 outro) {
			return new Ex3(
				this.numreal - outro.numreal,
				this.numimaginario - outro.numimaginario
			);

	}

	public Ex3 Multiplicacao(Ex3 outro) {
		
			double novonumnumreal = this.numreal * outro.numreal
                        - this.numimaginario * outro.numimaginario;

			double novonumnumimaginario = this.numreal * outro.numimaginario
                        + this.numimaginario * outro.numreal;
        return new Ex3(novonumnumreal,novonumnumimaginario);

	}

	public Ex3 Divisao(Ex3 outro) {
		
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

        return new Ex3(novonumreal, novonumimaginario);

	}
	
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof Ex3)) {
            return false;
        }

        Ex3 outro = (Ex3) objeto;

        return Double.compare(this.numreal, outro.numreal) == 0
            && Double.compare(
                this.numimaginario, outro.numimaginario
            ) == 0;
    }

  
    public int hashCode() {
        int resultado = Double.hashCode(numreal);
        resultado = 31 * resultado
                  + Double.hashCode(numimaginario);
        return resultado;
    }

    public String toString() {
        if (numimaginario < 0) {
            return numreal + " - " + (-numimaginario) + "i";
        }

        return numreal + " + " + numimaginario + "i";
    }

    
    public double modulo() {
        return Math.sqrt(
            numreal * numreal + numimaginario * numimaginario);
    }

}

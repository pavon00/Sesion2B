package cmepps;

public class Empleado {
	public static enum TipoEmpleado {
		Vendedor, Encargado
	}

	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salarioBase = 0;
		if (tipo.equals(TipoEmpleado.Vendedor)) {
			salarioBase = 2000;
		} else {
			salarioBase = 2500;
		}
		if (ventasMes >= 1000) {
			salarioBase += 100;
		}
		if (ventasMes >= 1500) {
			salarioBase += 100;
		}
		if (horasExtra > 0) {
			salarioBase += horasExtra * 30;
		}
		return salarioBase;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		if (nominaBruta<2100) {
			return nominaBruta;
		}else if (nominaBruta>=2100 && nominaBruta<2500) {
			
		}else if (nominaBruta>=2500) {
			
		}
	}
}

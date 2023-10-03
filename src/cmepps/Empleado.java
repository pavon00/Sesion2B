package cmepps;

public class Empleado {
	public static enum TipoEmpleado {
		Vendedor, Encargado
	}

	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
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
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		if (nominaBruta>2500) {
			retencion = nominaBruta*0.18f;
		}else if (nominaBruta>=2100) {
			retencion = nominaBruta*0.15f;
		}
		return nominaBruta*(1-retencion);
	}
}

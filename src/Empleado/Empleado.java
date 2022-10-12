package Empleado;



public class Empleado {
	
	enum TipoEmpleado {
		vendedor, Encargado
	};
	
	//En este metodo se deberian realizar 8 pruebas
	public static float calculoNominaBruta(String tipo, float ventaMes, float HorasExtra) {
		float salarioBase;
		if (tipo.equals("vendedor")) {
			salarioBase = 2000;

		} else {
			salarioBase = 2500;

		}

		if (ventaMes >= 1500)
			salarioBase = salarioBase + 200;
		else if (ventaMes >=1000)
			salarioBase = salarioBase + 100;

		salarioBase = salarioBase + HorasExtra * 30;

		return salarioBase;
	}

	//En este metodo se deberian realizar 3 pruebas
	public static float calculoNominaNeta(float nominaBruta) {
		if (nominaBruta >= 2500) {
			return nominaBruta * (1 - 0.18f);
		} else if (2500 > nominaBruta && nominaBruta > 2100) {
			return nominaBruta * (1 - 0.15f);
		} else {
			return nominaBruta;
		}

	}

}

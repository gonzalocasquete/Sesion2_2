
public class Empleado {
	enum TipoEmpleado {
		vendedor, Encargado
	};

	//En este metodo se deberian realizar 
	float calculoNominaBruta(TipoEmpleado tipo, float ventaMes, float HorasExtra) {
		float salarioBase;
		if (tipo == TipoEmpleado.vendedor) {
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
	float calculoNominaNeta(float nominaBruta) {
		if (nominaBruta >= 2500) {
			return nominaBruta * (1 - 0.18f);
		} else if (2500 > nominaBruta && nominaBruta > 2100) {
			return nominaBruta * (1 - 0.15f);
		} else {
			return nominaBruta;
		}

	}

}

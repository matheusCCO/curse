package entidades;

public class aumentaSalario {
	
		public String name;
		public double GrossSalary;
		public double Tax;
		
		public double NetSalary() {
			return GrossSalary - Tax;
 
		}
		
		public void IncreaseSalary(double porsentagem) {
			GrossSalary += GrossSalary * porsentagem/ 100.0;
		}
		
		public String toString() {
			return name + "," + String.format("%.2f", NetSalary());
		}
		
}

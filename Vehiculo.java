package principal;

public class Vehiculo {
	private String Marca;
	private String Color;
	private int Año;
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getAño() {
		return Año;
	}
	public void setAño(int año) {
		Año = año;
	}
	
	void movimiento(Vehiculo a) {
		System.out.println("El vehiculo"+Marca+"de Color"+Color+"del Año"+Año+"Con Motor"+a.getModelo()+"Con una Acelaracion de "+a.getKm());
		}

}

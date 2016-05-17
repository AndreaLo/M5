package RGB;

public class ColorRGBException extends Exception{
	
	public ColorRGBException (int r, int g, int b){
		if (r<0 || r>255){
			System.out.println("Valor de r="+r+" fuera de rango");
		}
		else{
			System.out.println("Valor de r correcto!!");
		}	
		if (g<0 || g>255){
			System.out.println("Valor de g="+g+" fuera de rango");
		}
		else{
			System.out.println("Valor de g correcto!!");
		}
		if (b<0 || b>255){
			System.out.println("Valor de b="+b+" fuera de rango");
		}
		else{
			System.out.println("Valor de b correcto!!");
		}
	}
}

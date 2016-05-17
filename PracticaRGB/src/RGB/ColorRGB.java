package RGB;

public class ColorRGB {
	private int r;
	private int g;
	private int b;
	
	public ColorRGB(int r, int g, int b){
		this.r=r;
		this.g=g;
		this.b=b;
	}
	public void asignarColor(int r, int g, int b){
		this.r=r;
		this.g=g;
		this.b=b;
	}
	public int[] obtenerColor(){
		int v[]={obtenerColorR(),obtenerColorG(),obtenerColorB()};
		return v;
	}
	public void asignarColorR(int r){
		this.r=r;
	}
	public void asignarColorG(int g){
		this.g=g;
	}
	public void asignarColorB(int b){
		this.b=b;
	}
	public int obtenerColorR(){
		return this.r;
	}
	public int obtenerColorG(){
		return this.g;
	}
	public int obtenerColorB(){
		return this.b;
	}
}



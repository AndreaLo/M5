package RGB;

public class Pixel{
	private int x;
	private int y;
	ColorRGB color;
	
	hola caracola
	
	public Pixel (int r, int g, int b, int x, int y) throws ColorRGBException{
		color=new ColorRGB(r,g,b);
		this.x=x;
		this.y=y;
		throw new ColorRGBException(r,g,b);
	}
	public void asignarPosicion(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void asignarPosicionX(int x){
		this.x=x;
	}
	public void asignarPosicionY(int y){
		this.y=y;
	}
	public int obtenerPosicion(){
		return this.x+this.y;
	}
	public int obtenerPosicionX(){
		return this.x;
	}
	public int obtenerPosicionY(){
		return this.y;
	}
	public int[] obtenerColor(){
		int v[]={obtenerColorR(),obtenerColorG(),obtenerColorB()};
		return v;
	}
	public int obtenerColorG(){
		return color.obtenerColorG();
	}
	public int obtenerColorB(){
		return color.obtenerColorB();
	}
	public int obtenerColorR(){
		return color.obtenerColorR();
	}
	public void asignarColor(int r, int g, int b) throws ColorRGBException{
		
	if(r<0 || r>255 || g<0 || g>255 || b<0 || b>255) throw new ColorRGBException(r,g,b);
		color.asignarColorR(r);
		color.asignarColorG(g);
		color.asignarColorB(b);
	}
	public void asignarColorR(int r) throws ColorRGBException{
		if(r<0 || r>255) throw new ColorRGBException(r,color.obtenerColorG(),color.obtenerColorB());
		color.asignarColorR(r);
	}
	public void asignarColorG(int g) throws ColorRGBException{
		if(g<0 || g>255) throw new ColorRGBException(color.obtenerColorR(),g,color.obtenerColorB());
		color.asignarColorG(g);
	}
	public void asignarColorB(int b) throws ColorRGBException{
		if (b<0 || b>255) throw new ColorRGBException(color.obtenerColorR(),color.obtenerColorG(),b);
		color.asignarColorR(b);
	}
}

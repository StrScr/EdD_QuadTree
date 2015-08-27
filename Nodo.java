/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_p2;

/**
 *
 * @author MemoL
 */
public class Nodo implements AuxNode {
	
	private int height;
	private int width;
	private byte color;
	private AuxNode lowleft;
	private AuxNode upleft;
	private AuxNode lowright;
	private AuxNode upright;
	
	public Nodo(){
		height= 0;
		width= 0;
		color= -1;
		lowleft= null;
		lowright= null;
		upleft= null;
		upright= null;
	}
	
	@Override
	public int TamRegion() {
		return height*width;
	}

	@Override
	public byte getColorRegion(){
		return color;	
	}

	@Override
	public AuxNode getCuadrante(Cuadrante cuadrante) {
		switch(cuadrante){
		case TopLeft: return upleft;
		case TopRight: return upright;
		case BotLeft: return lowleft;
		case BotRight: return lowright;
		}
		return null;
	}

	@Override
	public boolean isLeaf() {
		return color==0||color==1;
	}

	@Override
	public void setAltura(int h) {
		height = h;
	}

	@Override
	public int getAltura(){
		return height;
	}

	@Override
	public void setAncho(int w){
		width = w;
	}

	@Override
	public int getAncho(){
		return width;
	}

	@Override
	public void setColordeRegion(byte color){
		this.color = color;

	}

	@Override
	public void setCuadrante(Cuadrante cuadrante, AuxNode auxnode) {
		switch(cuadrante){
		case TopLeft: upleft = auxnode; break;
		case TopRight: upright = auxnode; break;
		case BotLeft: lowleft = auxnode; break;
		case BotRight: lowright = auxnode; break;
		}
	}

}

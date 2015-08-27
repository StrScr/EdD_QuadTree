/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_p2;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MemoL
 */
public class QuadTree {
    
public static AuxNode CompresordeImagen(byte[][] image)
	{

		if(image.length==1){
			if(image[0].length==1){
				AuxNode node = new Nodo();
				node.setAltura(1); node.setAncho(1);
				node.setColordeRegion(image[0][0]);
				return node;}
		}
			
		int mindiff= Integer.MAX_VALUE;
		int manhattan= Integer.MAX_VALUE;
		int centerx= (int) Math.ceil(image[0].length/2.0);
		int centery= (int) Math.ceil(image.length/2.0);
		ArrayList<Integer> xsplits= new ArrayList<Integer>();
		ArrayList<Integer> ysplits= new ArrayList<Integer>();
		

		if(image.length==1){
			for(int i= 1; i < image[0].length; i++){
				int leftblacks=0;
				int leftwhites=0;
				int rightblacks=0;
				int rightwhites=0;
				int nums=0;

				for(int k=0; k<i; k++){
					if(image[0][k]==1)leftblacks++;
					if(image[0][k]==0)leftwhites++;
				}
				if(leftblacks>= leftwhites)nums+= i-leftblacks;
				else{nums+= i-leftwhites;}

				for(int k=i; k<image[0].length; k++){
					if(image[0][k]==1)rightblacks++;
					if(image[0][k]==0)rightwhites++;
				}
				if(rightblacks>= rightwhites)nums+= (image[0].length-i)-rightblacks;
				else{nums+= (image[0].length-i)-rightwhites;}
				
				if (nums < mindiff){
					xsplits.clear();
					ysplits.clear();
					xsplits.add(i);
					ysplits.add(0);
					mindiff=nums;					
				}
				else if (nums==mindiff){
					xsplits.add(i);
					ysplits.add(0);
				}
			}

			int ysplit=0;
			int xsplit=0;
			for(int i=0; i< xsplits.size(); i++){
				int dx= Math.abs(xsplits.get(i)-centerx);
				if(dx<manhattan){
					manhattan=dx;
					xsplit= xsplits.get(i);
				}

				else if(dx==manhattan){
					if(xsplits.get(i)>xsplit)xsplit = xsplits.get(i);
				}
			}
	
			AuxNode node= new Nodo();
			node.setAltura(1); node.setAncho(image[0].length);
			node.setColordeRegion(image[0][0]);
			for(int i=0; i< image[0].length; i++){
				if(image[0][i]!= node.getColorRegion()){
					node.setColordeRegion((byte)-1); break;}
			}
			node.setCuadrante(Cuadrante.BotLeft, null);
			node.setCuadrante(Cuadrante.BotRight, null);
			
			byte[][] leftimage= new byte[1][xsplit];
			for(int i=0; i< leftimage[0].length; i++)leftimage[0][i]= image[0][i];
			node.setCuadrante(Cuadrante.TopLeft, CompresordeImagen(leftimage));
			
			byte[][] rightimage= new byte[1][image[0].length-xsplit];
			for(int i=0; i< rightimage[0].length; i++)rightimage[0][i]= image[0][xsplit+i];
			node.setCuadrante(Cuadrante.TopRight, CompresordeImagen(rightimage));
			return node;
		}
		
		if(image[0].length==1){
			for(int i= 1; i < image.length; i++){
				int upblacks=0;
				int upwhites=0;
				int downblacks=0;
				int downwhites=0;
				int nums=0;
				//Pixels on the top side
				for(int k=0; k<i; k++){
					if(image[0][k]==1)upblacks++;
					if(image[0][k]==0)upwhites++;
				}
				if(upblacks>= upwhites)nums+= i-upblacks;
				else{nums+= i-upwhites;}
				//Pixels on the down side
				for(int k=i; k<image.length; k++){
					if(image[0][k]==1)downblacks++;
					if(image[0][k]==0)downwhites++;
				}
				if(downblacks>= downwhites)nums+= downwhites;
				else{nums+= downblacks;}
				
				if (nums < mindiff){
					xsplits.clear();
					ysplits.clear();
					xsplits.add(0);
					ysplits.add(i);
					mindiff=nums;					
				}
				else if (nums==mindiff){
					xsplits.add(0);
					ysplits.add(i);
				}
			}

			int ysplit=0;
			int xsplit=0;
			for(int i=0; i< ysplits.size(); i++){
				int dy= Math.abs(ysplits.get(i)-centery);
				if(dy<manhattan){
					manhattan=dy;
					ysplit= ysplits.get(i);
				}

				else if(dy==manhattan){
					if(ysplits.get(i)>ysplit)ysplit = ysplits.get(i);
				}
			}
		
			AuxNode node= new Nodo();
			node.setAltura(image.length); node.setAncho(0);
			node.setColordeRegion(image[0][0]);
			for(int i=0; i< image.length; i++){
				if(image[i][0]!= node.getColorRegion()){
					node.setColordeRegion((byte)-1); break;}
			}
			node.setCuadrante(Cuadrante.TopRight, null);
			node.setCuadrante(Cuadrante.BotRight, null);
			
			byte[][] topimage= new byte[ysplit][1];
			for(int i=0; i< topimage.length; i++)topimage[i][0]= image[i][0];
			node.setCuadrante(Cuadrante.TopLeft, CompresordeImagen(topimage));
			
			byte[][] lowimage= new byte[image.length-ysplit][1];
			for(int i=0; i< lowimage.length; i++)lowimage[i][0]= image[ysplit+i][0];
			node.setCuadrante(Cuadrante.BotLeft, CompresordeImagen(lowimage));
			return node;
		}
		
	
		for (int i=1; i < image.length; i++){
			for (int j = 1; j< image[i].length; j++){
				
				int upleftblacks=0;
				int upleftwhites=0;
				int uprightblacks=0;
				int uprightwhites=0;
				int lowleftblacks=0;
				int lowleftwhites=0;
				int lowrightblacks=0;
				int lowrightwhites=0;
				int nums= 0;				
		
				for (int k=0; k<i; k++ ){
					for (int l = 0; l< j; l++){
						if(image[k][l]==1)upleftblacks++;
						if(image[k][l]==0)upleftwhites++;}
				}
				if (upleftblacks>= upleftwhites)nums+= (i*j)-upleftblacks;
				else {nums+= (i*j)-upleftwhites;}
				
				for (int k=0; k<i; k++ ){
					for (int l = j; l< image[i].length; l++){
						if(image[k][l]==1)uprightblacks++;
						if(image[k][l]==0)uprightwhites++;}
				}
				if (uprightblacks>= uprightwhites)nums+= (i*(image[i].length-j))-uprightblacks;
				else {nums+= (i*(image[i].length-j))-uprightwhites;}
				
	
				for (int k=i; k<image.length; k++ ){
					for (int l = 0; l< j; l++){
						if(image[k][l]==1)lowleftblacks++;
						if(image[k][l]==0)lowleftwhites++;}
				}
				if (lowleftblacks>= lowleftwhites)nums+= (j*(image.length-i))-lowleftblacks;
				else {nums+= (j*(image.length-i))-lowleftwhites;}
	
				for (int k=i; k<image.length; k++){
					for (int l = j; l< image[i].length; l++){
						if(image[k][l]==1)lowrightblacks++;
						if(image[k][l]==0)lowrightwhites++;}
				}
				if (lowrightblacks>= lowrightwhites)nums+= ((image.length-i)*(image[i].length-j))-lowrightblacks;
				else {nums+= ((image.length-i)*(image[i].length-j))-lowrightwhites;}
				
				
				if(nums<mindiff){
					xsplits.clear();
					ysplits.clear();
					xsplits.add(j);
					ysplits.add(i);
					mindiff=nums;
				}

				else if(nums == mindiff){
					xsplits.add(j);
					ysplits.add(i);					
				}
			}
		}

		int xsplit=0;
		int ysplit=0;
		for(int i=0; i< xsplits.size(); i++){
			int dx= Math.abs(xsplits.get(i)-centerx);
			int dy= Math.abs(ysplits.get(i)-centery);
			if (dx+dy<manhattan){
				manhattan= dx+dy;
				xsplit= xsplits.get(i);
				ysplit= ysplits.get(i);}

			else if (dx + dy == manhattan){
				if(xsplits.get(i)*ysplits.get(i)> xsplit*ysplit){
					xsplit= xsplits.get(i);
					ysplit= ysplits.get(i);}

				if(xsplits.get(i)*ysplits.get(i)== xsplit*ysplit){
					if(ysplits.get(i)>ysplit){
						xsplit= xsplits.get(i);
						ysplit= ysplits.get(i);}
				}
			}
		}

		AuxNode node= new Nodo();
		node.setAltura(image.length);
		node.setAncho(image[0].length);
		node.setColordeRegion(image[0][0]);
		for(int i=0; i<image.length;i++){
			for(int j=0; j<image[i].length; j++){
				if(image[i][j]!= node.getColorRegion())
					node.setColordeRegion((byte)-1);
			}
		}
		
		if (!node.isLeaf()){
			//Upleft child
			byte[][] upleftimage= new byte[ysplit][xsplit];
			for (int k=0; k < upleftimage.length; k++){
				for (int l = 0; l< upleftimage[k].length; l++){
					upleftimage[k][l]= image[k][l];}
			}
			node.setCuadrante(Cuadrante.TopLeft, CompresordeImagen(upleftimage));
			//Upright child
			byte[][] uprightimage= new byte[ysplit][image[0].length-xsplit];
			for (int k=0; k < uprightimage.length; k++){
				for (int l = 0; l< uprightimage[k].length; l++){
					uprightimage[k][l]= image[k][l+xsplit];}
			}
			node.setCuadrante(Cuadrante.TopRight, CompresordeImagen(uprightimage));
			//Lowleft child
			byte[][] lowleftimage= new byte[image.length-ysplit][xsplit];
			for (int k= 0; k< lowleftimage.length; k++){
				for(int l=0; l< lowleftimage[k].length; l++){
					lowleftimage[k][l]= image[k+ysplit][l];}
			}
			node.setCuadrante(Cuadrante.BotLeft, CompresordeImagen(lowleftimage));
			//Lowright child
			byte[][] lowrightimage= new byte[image.length-ysplit][image[0].length-xsplit];
			for(int k= 0; k< lowrightimage.length; k++){
				for(int l=0; l< lowrightimage[k].length; l++){
					lowrightimage[k][l]= image[k+ysplit][l+xsplit];}
			}
			node.setCuadrante(Cuadrante.BotRight, CompresordeImagen(lowrightimage));
		}
		return node;
	}
	
	

	public static double compressionRatio(AuxNode root)
	{
	    int totalnodes = 1;
	    if (root.isLeaf())return (1/(root.getAltura()*root.getAncho()));
	    AuxNode upleft= root.getCuadrante(Cuadrante.TopLeft);
	    AuxNode upright= root.getCuadrante(Cuadrante.TopRight);
	    AuxNode lowleft= root.getCuadrante(Cuadrante.BotLeft);
	    AuxNode lowright= root.getCuadrante(Cuadrante.BotRight);
	    if(upleft!=null)totalnodes+= compressionRatio(upleft)*(upleft.getAltura()*upleft.getAncho());
	    if(upright!=null)totalnodes+= compressionRatio(upright)*(upright.getAltura()*upright.getAncho());
	    if(lowleft!=null)totalnodes+= compressionRatio(lowleft)*(lowleft.getAltura()*lowleft.getAncho());
	    if(lowright!=null)totalnodes+= compressionRatio(lowright)*(lowright.getAltura()*lowright.getAncho());
	    return (totalnodes/(root.getAltura()*root.getAncho()));
	}
	

	public static byte getColor(AuxNode root, int x, int y){
		if (x<0 || y <0 || x>= root.getAltura() || y>= root.getAncho())return -1;
		if (root.isLeaf())return root.getColorRegion();
		AuxNode Topleft= root.getCuadrante(Cuadrante.TopLeft);
		int splitx= Topleft.getAltura();
		int splity= Topleft.getAncho();
		if(x < splitx && y < splity){
			//the point is in Upperleft
			getColor(Topleft, x,y);}
		else if(x< splitx && y >= splity){
			//the point is in UpperRight
			getColor(root.getCuadrante(Cuadrante.TopRight),x,y);
		}
		else if(x>=splitx && y< splity){
			//the point is in LowerLeft
			getColor(root.getCuadrante(Cuadrante.BotLeft),x,y);
		}
		else if(x>=splitx && y>=splity){
			//Point is in LowerRight
			getColor(root.getCuadrante(Cuadrante.BotRight),x,y);}
		return -1;
	}
    
}

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
//este interface lo que hace es construir los bloques para el resultado de la nueva imagen
public interface AuxNode {
    // los posibles resultados de la imagen: blanco, negro, NADA

    public enum Color {

        Negro, Blanco, NADA;
    }

    //conseguir el tamaño de la region que representa este nodo

    public int TamRegion();

    //Retornar el color de la region

    public byte getColorRegion();

    //conseguir el cuadrante especificado

    public AuxNode getQuadrant(Cuadrante nom);

    // ¿es nodo?

    public boolean isLeaf();

    public void setAltura(int h);

    public int getAltura();

    /**
     * Set the width of the region
     */
    public void setAncho(int w);

    /**
     * Get the width of the region
     *
     * @return the width of the region
     */
    public int getAncho();

    /**
     * Sets the color of a uniform region represented by this node.
     *
     * @param color The color of the region.
     */
    public void setColordeRegion(byte color);

    /**
     * Set the selected quadrant.
     *
     * @param quadName The name of the quadrant to set.
     * @param quadNode A node representing the quadrant.
     */
    public void setCuadrante(Cuadrante cuadrante, AuxNode quadNode);
}

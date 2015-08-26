package ImageAnalyzer;
import java.awt.image.BufferedImage;
public class QuadTree{
    private QuadTree Q1, Q2, Q3, Q4;
    private BufferedImage quadrant;
    public QuadTree(BufferedImage imgq){
        quadrant = imgq;
        Q1=null;
        Q2=null;
        Q3=null;
        Q4=null;
    }
    public QuadTree getQ1() {
        return Q1;
    }
    public void setQ1(QuadTree Q1) {
        this.Q1 = Q1;
    }
    public QuadTree getQ2() {
        return Q2;
    }
    public void setQ2(QuadTree Q2) {
        this.Q2 = Q2;
    }
    public QuadTree getQ3() {
        return Q3;
    }
    public void setQ3(QuadTree Q3) {
        this.Q3 = Q3;
    }
    public BufferedImage getQuadrant() {
        return quadrant;
    }
    public void setQuadrant(BufferedImage quadrant) {
        this.quadrant = quadrant;
    }
}
package ImageAnalyzer;
import javax.swing.JProgressBar;
public class PBThread extends Thread{
    private JProgressBar bar;
    private boolean alive=true;
    public PBThread(JProgressBar b){
        bar=b;
    }
    @Override
    public void run(){
        while(alive){
            
        }
    }
    public void tickBar(){
        bar.setValue(bar.getValue()+1);
    }
    public void kill(){
        alive=false;
    }
}
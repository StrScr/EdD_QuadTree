//TODO
//Fix smallest piece size set <=0 (AKA Sometimes last few depths cause image pieces generation with sizes <=0)
package ImageAnalyzer;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
public class AppGUI extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc="Constructor and More Autogenerated Code">
    public AppGUI() {
        initComponents();
        ((DefaultEditor) sp_depth.getEditor()).getTextField().setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_save = new javax.swing.JButton();
        panel_pic = new javax.swing.JPanel();
        lb_image = new javax.swing.JLabel();
        btn_load = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cb_filter = new javax.swing.JComboBox();
        sp_depth = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        pb_convert = new javax.swing.JProgressBar();
        btn_about = new javax.swing.JButton();
        btn_contourize = new javax.swing.JButton();
        lb_tolerance = new javax.swing.JLabel();
        slider_tolerance = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contour Creator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        btn_save.setBackground(new java.awt.Color(153, 153, 153));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAnalyzer/save1_small.png"))); // NOI18N
        btn_save.setToolTipText("Save Result");
        btn_save.setEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        panel_pic.setBackground(new java.awt.Color(102, 102, 102));
        panel_pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_image.setBackground(new java.awt.Color(102, 102, 102));
        lb_image.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_image.setForeground(new java.awt.Color(204, 204, 204));
        lb_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_image.setText("No image loaded...");

        javax.swing.GroupLayout panel_picLayout = new javax.swing.GroupLayout(panel_pic);
        panel_pic.setLayout(panel_picLayout);
        panel_picLayout.setHorizontalGroup(
            panel_picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_picLayout.setVerticalGroup(
            panel_picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_image, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        btn_load.setBackground(new java.awt.Color(153, 153, 153));
        btn_load.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_load.setText("LOAD");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grayscale Filter");

        cb_filter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lightness", "Average", "Luminosity", "Red", "Green", "Blue" }));
        cb_filter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_filterItemStateChanged(evt);
            }
        });

        sp_depth.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        sp_depth.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));
        sp_depth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sp_depth.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tree Depth");

        pb_convert.setForeground(new java.awt.Color(102, 102, 102));

        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAnalyzer/info_xsmall.png"))); // NOI18N
        btn_about.setText("About");
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });

        btn_contourize.setBackground(new java.awt.Color(102, 255, 102));
        btn_contourize.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_contourize.setForeground(new java.awt.Color(0, 51, 0));
        btn_contourize.setText("CONTOURIZE");
        btn_contourize.setEnabled(false);
        btn_contourize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contourizeActionPerformed(evt);
            }
        });

        lb_tolerance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_tolerance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tolerance.setText("Tolerance: 0");

        slider_tolerance.setMaximum(255);
        slider_tolerance.setPaintLabels(true);
        slider_tolerance.setValue(0);
        slider_tolerance.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_toleranceStateChanged(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("0");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("255");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_load, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pb_convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_filter, 0, 178, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp_depth)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider_tolerance, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                    .addComponent(lb_tolerance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_contourize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pb_convert, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_depth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_tolerance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addComponent(slider_tolerance, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_contourize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_about))
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GUI Methods">
    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        try{
            System.out.println("Loading image...");
            JFileChooser loader= new JFileChooser();
            loader.setDialogTitle("Select an Image");
            loader.setAcceptAllFileFilterUsed(false);
            FileFilter filter = new FileNameExtensionFilter("Image Files","png","gif","jpg","jpeg");
            loader.addChoosableFileFilter(filter);
            loader.setFileHidingEnabled(false);
            if(loader.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
                img = ImageIO.read(loader.getSelectedFile());
                //Create backup Image
                backup=new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_RGB);
                for(int i=0; i<img.getHeight(); i++){
                    for(int j=0; j<img.getWidth(); j++){
                        backup.setRGB(j, i, img.getRGB(j, i));
                    }
                }
                //Display Image
                grayify();
                lb_image.setIcon(new ImageIcon(img.getScaledInstance(200, 200, 0)));
                lb_image.setText("");
                btn_save.setEnabled(true);
                btn_contourize.setEnabled(true);
                //Get MAX Tree Depth
                int depth=0, small=img.getHeight();
                if(img.getWidth()<small){
                    small=img.getWidth();
                }
                while(small>1){
                    if(small%2==0){
                        small/=2;
                    }else{
                        small=(small/2)-1;
                    }
                    depth++;
                }
                sp_depth.setValue(0);
                sp_depth.setModel(new SpinnerNumberModel(0,0,depth,1));//True depth causing trouble???
                sp_depth.setEnabled(true);
                System.out.println("MAX Tree Depth: "+depth+".");
                System.out.println("Image loaded succesfully.");
            }else{
                System.out.println("Image load canceled.");
            }
        }catch(HeadlessException | IOException e){
            System.out.println("IMAGE LOAD ERROR");
        }
    }//GEN-LAST:event_btn_loadActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try{
            System.out.println("Saving image...");
            JFileChooser saver = new JFileChooser();
            saver.setDialogTitle("Save Image");
            saver.setAcceptAllFileFilterUsed(false);
            FileFilter filter = new FileNameExtensionFilter("PNG file","png");
            saver.addChoosableFileFilter(filter);
            if(saver.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
                String path = saver.getSelectedFile().getAbsolutePath();
                if(!path.endsWith(".png")){
                    path=path.concat(".png");
                }
                File fname=new File(path);
                ImageIO.write(img, "png", fname);
                System.out.println("Save succesfull.");
            }else{
                System.out.println("Save canceled.");
            }
        }catch(HeadlessException | IOException e){
            System.out.println("IMAGE SAVE ERROR");
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_contourizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contourizeActionPerformed
        System.out.println("Contourizing with tolerance "+slider_tolerance.getValue()+", depth "+(int)sp_depth.getValue()+"...");
        try{
            if(settingsChanged){
                loadBackup();
                grayify();
            }
            settingsChanged=true;
            QuadTree contour = new QuadTree(img);
            contourize(contour,(int)sp_depth.getValue());
            System.out.println("Contourization succesful.");
            generateImage(contour);
        }catch(Exception e){
            System.out.println("CONTOURIZE ERROR");
        }
    }//GEN-LAST:event_btn_contourizeActionPerformed

    private void cb_filterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_filterItemStateChanged
        if(img!=null && evt.getStateChange()==1){
            loadBackup();
            //Re-display
            grayify();
            lb_image.setIcon(new ImageIcon(img.getScaledInstance(200, 200, 0)));
            lb_image.setText("");
        }
    }//GEN-LAST:event_cb_filterItemStateChanged

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        JOptionPane.showMessageDialog(this, "Hecho por Guillermo Lopez y Oscar Mejia.\n\nEstuctura de Datos.\nUNITEC TGU", "About This Software", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void slider_toleranceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_toleranceStateChanged
        lb_tolerance.setText("Tolerance: "+slider_tolerance.getValue());
    }//GEN-LAST:event_slider_toleranceStateChanged
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Custom Methods">
    public void grayify(){
        if(true){
            System.out.println("Gray-ifying through "+cb_filter.getSelectedItem().toString()+".");
            Color pixel;
            for(int i=0; i<img.getHeight(); i++){
                for(int j=0; j<img.getWidth(); j++){
                    pixel=new Color(img.getRGB(j, i));
                    int gPix;
                    switch(cb_filter.getSelectedIndex()){
                        case 0://Lightness
                            gPix=(getMax(pixel)+getMin(pixel))/2;
                            break;
                        case 1://Average
                            gPix=(pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3;
                            break;
                        case 2://Luminosity
                            gPix=(int)((0.21*pixel.getRed()) + (0.72*pixel.getGreen()) + (0.07*pixel.getBlue()));
                            break;
                        case 3://Red
                            gPix=pixel.getRed();
                            break;
                        case 4://Green
                            gPix=pixel.getGreen();
                            break;
                        default://Blue
                            gPix=pixel.getBlue();
                            break;
                    }
                    pixel=new Color(gPix,gPix,gPix);
                    img.setRGB(j, i, pixel.getRGB());
                }
            }
            settingsChanged=false;
        }/*else{
            //Doesn't use isGrayscale for efficiency
            System.out.println("Image already in grayscale.");
        }*/
    }
    public boolean isGrayscale(){
        //Unused for efficiency
        boolean isGray=true;
        Color pix;
        for(int i=0; i<img.getHeight(); i++){
            for(int j=0; j<img.getWidth(); j++){
                pix=new Color(img.getRGB(j, i));
                if(!(pix.getRed()==pix.getBlue() && pix.getBlue()==pix.getGreen())){
                    isGray=false;
                    i=img.getHeight();
                    j=img.getWidth();
                }
            }
        }
        return isGray;
    }
    public int getMax(Color c){
        int max=c.getRed();
        if(c.getGreen()>max){
            max=c.getGreen();
        }
        if(c.getBlue()>max){
            max=c.getBlue();
        }
        return max;
    }
    public int getMin(Color c){
        int min=c.getRed();
        if(c.getGreen()<min){
            min=c.getGreen();
        }
        if(c.getBlue()<min){
            min=c.getBlue();
        }
        return min;
    }
    public boolean hasColorChange(BufferedImage quad){
        //Doesnt use tolerance
        boolean hasChange=false;
        Color base=new Color(quad.getRGB(0, 0)), next;
        for(int i=0; i<quad.getHeight(); i++){
            for(int j=0; j<quad.getWidth(); j++){
                next=new Color(quad.getRGB(j, i));
                if(!(base.equals(next))){
                    hasChange=true;
                    i=quad.getHeight();
                    j=quad.getWidth();
                }
            }
        }
        return hasChange;
    }
    public boolean hasColorChange2ElectricBoogaloo(BufferedImage quad){
        boolean hasChange=false;
        int min=new Color(quad.getRGB(0, 0)).getRed(), max=new Color(quad.getRGB(0, 0)).getRed(), next;
        for(int i=0; i<quad.getHeight(); i++){
            for(int j=0; j<quad.getWidth(); j++){
                next=new Color(quad.getRGB(j, i)).getRed();
                //Checks current pixel agaist min and max
                if(next<min){
                    min=next;
                    //Detect if changes have gone over tolerance
                    if((max-min)>slider_tolerance.getValue()){
                        hasChange=true;
                        i=quad.getHeight();
                        j=quad.getWidth();
                    }
                }else{
                    if(next>max){
                        max=next;
                        if((max-min)>slider_tolerance.getValue()){
                            hasChange=true;
                            i=quad.getHeight();
                            j=quad.getWidth();
                        }
                    }
                }
            }
        }
        return hasChange;
    }
    public void contourize(QuadTree quad, int levels){
        if(levels>0){
            boolean hasChange;
            if(slider_tolerance.getValue()==0){
                hasChange=hasColorChange(quad.getQuadrant());
            }else{
                hasChange=hasColorChange2ElectricBoogaloo(quad.getQuadrant());
            }
            if(hasChange){
                //Determine Quadrant Dimensions
                int x=quad.getQuadrant().getWidth(),y=quad.getQuadrant().getHeight();
                if(x%2==0){
                    x/=2;
                }else{
                    x=(x/2)-1;
                }
                if(y%2==0){
                    y/=2;
                }else{
                    y=(y/2)-1;
                }
                //Make Top Left Quadrant
                BufferedImage curImg;
                quad.setQ1(new QuadTree(new BufferedImage(x,y,BufferedImage.TYPE_INT_RGB)));
                curImg=quad.getQ1().getQuadrant();
                for(int i=0; i<y; i++){
                    for(int j=0; j<x; j++){
                        curImg.setRGB(j, i, quad.getQuadrant().getRGB(j, i));
                    }
                }
                //Make Top Right Quadrant
                quad.setQ2(new QuadTree(new BufferedImage(x,y,BufferedImage.TYPE_INT_RGB)));
                curImg=quad.getQ2().getQuadrant();
                for(int i=0; i<y; i++){
                    for(int j=0; j<x; j++){
                        curImg.setRGB(j, i, quad.getQuadrant().getRGB((quad.getQuadrant().getWidth()/2)+j, i));
                    }
                }
                //Make Bottom Left Quadrant
                quad.setQ3(new QuadTree(new BufferedImage(x,y,BufferedImage.TYPE_INT_RGB)));
                curImg=quad.getQ3().getQuadrant();
                for(int i=0; i<y; i++){
                    for(int j=0; j<x; j++){
                        curImg.setRGB(j, i, quad.getQuadrant().getRGB(j, (quad.getQuadrant().getHeight()/2)+i));
                    }
                }
                //Make Bottom Right Quadrant
                quad.setQ4(new QuadTree(new BufferedImage(x,y,BufferedImage.TYPE_INT_RGB)));
                curImg=quad.getQ4().getQuadrant();
                for(int i=0; i<y; i++){
                    for(int j=0; j<x; j++){
                        curImg.setRGB(j, i, quad.getQuadrant().getRGB((quad.getQuadrant().getWidth()/2)+j, (quad.getQuadrant().getHeight()/2)+i));
                    }
                }
                //Erase image in quad
                quad.setQuadrant(null);
                //Contourize Quadrants
                contourize(quad.getQ1(),levels-1);
                contourize(quad.getQ2(),levels-1);
                contourize(quad.getQ3(),levels-1);
                contourize(quad.getQ4(),levels-1);
            }
        }
    }
    public void generateImage(QuadTree contour){
        System.out.println("Generating image...");
        //Determine Image Size
        int depth=(int)sp_depth.getValue(), i=(int)sp_depth.getValue(), j=(int)sp_depth.getValue();
        int mersenne=(int)((Math.pow(2, depth))-1);
        int pieceW=img.getWidth(), pieceH=img.getHeight();
        while(i>0){
            if(pieceW%2==0){
                pieceW/=2;
            }else{
                pieceW=(pieceW/2)-1;
            }
            i--;
        }
        while(j>0){
            if(pieceH%2==0){
                pieceH/=2;
            }else{
                pieceH=(pieceH/2)-1;
            }
            j--;
        }
        int Rwidth=(int) (pieceW*(Math.pow(2, depth))+mersenne), Rheight=(int) (pieceH*(Math.pow(2, depth))+mersenne);
        System.out.println("Resulting image size: "+Rwidth+"x"+Rheight+".");
        //Build Image
        System.out.println("Bulding Image...");
        BufferedImage build=new BufferedImage(Rwidth,Rheight,BufferedImage.TYPE_BYTE_BINARY);
        for(int g=0; g<Rheight; g++){
            for(int h=0; h<Rwidth; h++){
                build.setRGB(h, g, Color.white.getRGB());
            }
        }
        paintDivisors(contour, build, 0, 0, build.getWidth(), build.getHeight());
        //Display Image
        img=build;
        lb_image.setIcon(new ImageIcon(img.getScaledInstance(200, 200, 0)));
        System.out.println("Generation succesful.");
    }
    public void paintDivisors(QuadTree ref, BufferedImage canvas, int xstart, int ystart, int xfinish, int yfinish){
        if(ref.getQ1()!=null){
            //Paint Divisor
            for(int i=ystart; i<yfinish; i++){
                canvas.setRGB(xstart+(xfinish-xstart)/2, i, Color.BLACK.getRGB());
            }
            for(int i=xstart; i<xfinish; i++){
                canvas.setRGB(i, ystart+(yfinish-ystart)/2, Color.BLACK.getRGB());
            }
            //Paint Quadrants
            paintDivisors(ref.getQ1(),canvas,xstart,ystart,xstart+(xfinish-xstart)/2,ystart+(yfinish-ystart)/2);
            paintDivisors(ref.getQ2(),canvas,xstart+(xfinish-xstart)/2,ystart,xfinish,ystart+(yfinish-ystart)/2);
            paintDivisors(ref.getQ3(),canvas,xstart,ystart+(yfinish-ystart)/2,xstart+(xfinish-xstart)/2,yfinish);
            paintDivisors(ref.getQ4(),canvas,xstart+(xfinish-xstart)/2,ystart+(yfinish-ystart)/2,xfinish,yfinish);
        }
    }
    public void loadBackup(){
        //Restore From Backup
        System.out.println("Restoring image from backup...");
        img=new BufferedImage(backup.getWidth(),backup.getHeight(),BufferedImage.TYPE_INT_RGB);
        for(int i=0; i<img.getHeight(); i++){
            for(int j=0; j<img.getWidth(); j++){
                img.setRGB(j, i, backup.getRGB(j, i));
            }
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Main">
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGUI().setVisible(true);
            }
        });
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Autogenerated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_contourize;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cb_filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel lb_tolerance;
    private javax.swing.JPanel panel_pic;
    private javax.swing.JProgressBar pb_convert;
    private javax.swing.JSlider slider_tolerance;
    private javax.swing.JSpinner sp_depth;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Custom Variables">
    BufferedImage img;
    BufferedImage backup;
    boolean settingsChanged;
    //</editor-fold>
}
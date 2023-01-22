/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imageviewer;

import imageviewer.architecture.ImageDisplay;
import imageviewer.architecture.ImageLoader;
import imageviewer.architecture.ImagePresenter;
import java.io.File;

public class ImageViewer {

    public static void main(String[] args) {
        ImageLoader loader = new FileImageLoader(new File("images"));        
        Frame frame = new Frame();        
        ImageDisplay imageDisplay = frame.imageDisplay();
        ImagePresenter.with(loader.load(), imageDisplay);        
        
        frame.setVisible(true);
    }
    
}
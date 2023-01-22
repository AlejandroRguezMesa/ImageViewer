/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package imageviewer.architecture;

/**
 *
 * @author aleja
 */
public interface Image {
    Object data();
    int width();
    Image prev();
    Image next();
    
}

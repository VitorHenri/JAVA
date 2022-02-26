/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacotryPolygons;

import Polygons.Pentagon;
import Polygons.Square;
import Polygons.Triangle;
import Polygons.Polygons;

/**
 *
 * @author dell-vitor
 */
public class Factory {

    public static Polygons createPolygons(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangle();
            
        } else if (numberOfSides == 4) {
            return new Square();
            
        } else if(numberOfSides==5){
            return new Pentagon();
        }
        return null;
    }
}
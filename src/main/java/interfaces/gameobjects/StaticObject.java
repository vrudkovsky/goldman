package interfaces.gameobjects;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import enums.GameObjectType;
import objects.Coordinate;

import javax.swing.*;

/**
 *
 * @author Tim
 */
public interface StaticObject {
 
    // объект должен иметь иконку
    Icon getIcon();

    // координаты
    Coordinate getCoordinate();

    // тип объекта
    GameObjectType getType();
    
            
}

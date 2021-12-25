package interfaces.gameobjects;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import abstracts.AbstractGameMap;
import enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    void move(MovingDirection direction, AbstractGameMap abstractGameMap);
    
    int getStep();
   
}

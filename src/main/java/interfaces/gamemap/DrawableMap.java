package interfaces.gamemap;

import abstracts.AbstractGameMap;

import java.awt.Component;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}

package com.wj.factoryPattern;

import com.wj.factoryPattern.shape.Circle;
import com.wj.factoryPattern.shape.Rectangle;
import com.wj.factoryPattern.shape.Shape;
import com.wj.factoryPattern.shape.Square;

public class ShapeFactory {
    
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;
        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}

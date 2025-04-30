import greenfoot.*;

/**
  * The World our hero lives in.
  * 
  * @author Guo
  * @ version April 2025
  */
public class MyWorld extends World {
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        Apple apple = new Apple();
        addObject(apple, 300, 0);
    }
}

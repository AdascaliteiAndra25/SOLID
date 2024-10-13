package com.solid.l.good;

import com.solid.l.bad.BadRectangle;
import com.solid.l.bad.BadSquare;

public class GoodGraphicsService {

    public void checkForArea(Shape shape) {
  //   shape.getArea();

        System.out.printf("The area of our %s is %d\n ",shape.getClass(),shape.getArea());

    }
}

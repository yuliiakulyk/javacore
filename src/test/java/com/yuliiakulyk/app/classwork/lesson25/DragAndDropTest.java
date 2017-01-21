package com.yuliiakulyk.app.classwork.lesson25;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by Yuliia Kulyk on 18.01.2017.
 */
public class DragAndDropTest {
    WebDriver driver;
    By fromElement = By.id("one");
    By toElement = By.id("bin");

    @Test
    public void myDragDropTest() {
        driver = new FirefoxDriver();
        driver.get("http://html5demos.com/drag#");
        driver.manage().window().maximize();

        WebElement dragFrom = driver.findElement(fromElement);
        WebElement dragTo = driver.findElement(toElement);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.setAutoDelay(500);
        driver.manage().window().maximize();

        Point fromCenter = new Point(dragFrom.getLocation().getX() + dragFrom.getSize().getWidth() / 2,
                dragFrom.getLocation().getY() + dragFrom.getSize().getHeight() / 2);
        Point toCenter = new Point(dragTo.getLocation().getX() + dragTo.getSize().getWidth() / 2,
                dragTo.getLocation().getY() + dragTo.getSize().getHeight() / 2);

        robot.mouseMove(-2000, -2000);
        robot.mouseMove(fromCenter.x, -fromCenter.y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseMove(toCenter.x - fromCenter.x, toCenter.y - fromCenter.y);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);





//
//        Robot robot = null;
//        try {
//            robot = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        robot.setAutoDelay(500);
//
//        robot.mouseMove(200, 200);
//        robot.mousePress(InputEvent.BUTTON1_MASK);
//
//
//        // Get size of elements
//        Dimension fromSize = dragFrom.getSize();
//        Dimension toSize = dragTo.getSize();
//
//        //Get centre distance
//        int xCentreFrom = fromSize.width / 2;
//        int yCentreFrom = fromSize.height / 2;
//        int xCentreTo = toSize.width / 2;
//        int yCentreTo = toSize.height / 2;
//
//        Point toLocation = dragTo.getLocation();
//        Point fromLocation = dragFrom.getLocation();
//        System.out.println(fromLocation.toString());
//
//
//
//        //Make Mouse coordinate centre of element
//        toLocation.x += xOffset + xCentreTo;
//        toLocation.y += yOffset + yCentreTo;
//        fromLocation.x += xOffset + xCentreFrom;
//        fromLocation.y += yOffset + yCentreFrom;
//
//        System.out.println(fromLocation.toString());
//
//        //Move mouse dragTo drag dragFrom location
//        robot.mouseMove(fromLocation.x, fromLocation.y);
//        //robot.mouseMove(175,250);
//
////        Thread.sleep(1000);
//        //Click and drag
//        robot.mousePress(InputEvent.BUTTON1_MASK);
//
//        //robot.mousePress(InputEvent.
//        //Drag events require more than one movement dragTo register
//        //Just appearing at destination doesn't work so move halfway first
//        robot.mouseMove(((toLocation.x - fromLocation.x) / 2) + fromLocation.x, ((toLocation.y
//                - fromLocation.y) / 2) + fromLocation.y);
//
//        //Move dragTo final position
//        robot.mouseMove(toLocation.x, toLocation.y);
//
//        //robot.mouseMove(175,200);
//
//        //Drop
//        robot.mouseRelease(InputEvent.BUTTON1_MASK);

    }
}

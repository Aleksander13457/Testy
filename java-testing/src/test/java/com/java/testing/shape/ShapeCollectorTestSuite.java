package com.java.testing.shape;

import com.java.testing.forum.ForumUser;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        shapeCollector.addFigure(circle);

        Assert.assertEquals(1, shapeCollector.getSize());
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle1);
        shapeCollector.removeFigure(circle1);

        Assert.assertEquals(1, shapeCollector.getSize());
    }

    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        shapeCollector.addFigure(circle);

        Assert.assertEquals(circle.toString(), shapeCollector.showFigures(circle));
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 3);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        Assert.assertEquals(triangle, shapeCollector.getFigure(1));
    }
}

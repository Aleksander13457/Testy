package com.java.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> tab = new ArrayList<>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(tab);

        Assert.assertEquals(tab, result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(2);
        tab.add(3);
        tab.add(5);
        tab.add(8);
        ArrayList<Integer> correctTab = new ArrayList<>();
        correctTab.add(2);
        correctTab.add(8);
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(tab);
        Assert.assertEquals(result, correctTab);
    }

}

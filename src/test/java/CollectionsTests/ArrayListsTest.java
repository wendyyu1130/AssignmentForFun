package CollectionsTests;

import Collections.ArrayLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

// Please rewrite the test part as the format I gave here.

public class ArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShit1() {
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(3);
        original1.add(3);
        original1.add(3);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShit2() {
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(3);
        original1.add(3);
        original1.add(3);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(8);
        original2.add(8);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(8);
        original1.add(8);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTogether() {
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(4);
        original2.add(9);
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 13;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogether1() {
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(3);
        original1.add(8);
        original1.add(4);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(2);
        original2.add(9);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 26;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(2);
        original.add(2);
        original.add(4);
        original.add(6);
        original.add(7);
        // When
        Integer toRemove = null;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAll1() {
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(2);
        original.add(2);
        original.add(4);
        original.add(6);
        original.add(7);
        // When
        Integer toRemove = 2;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(0);
        original.remove(0);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void happyList() {
        ArrayList<String> original = new ArrayList<String>();
        original.add("looking");
        original.add("this");
        original.add("picture");
        original.add("is");
        original.add("fantastic");
        boolean actual = arrayLists.happyList(original);
        Assert.assertTrue(actual);
    }

    @Test
    public void happyList1() {
        ArrayList<String> original = new ArrayList<String>();
        original.add("It is amazing!");
        boolean actual = arrayLists.happyList(original);
        Assert.assertTrue(actual);
    }

    @Test
    public void happyList2() {
        ArrayList<String> original = new ArrayList<String>();
        original.add("did");
        original.add("he");
        original.add("feel");
        original.add("happy");
        boolean actual = arrayLists.happyList(original);
        Assert.assertFalse(actual);
    }

}

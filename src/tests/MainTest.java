package tests;

import main.MyArrayList;
import main.MyArrayListImpl;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void myArrayListImplGetArray() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        Assert.assertArrayEquals(new String[]{"2", "3"}, myArrayList.getArray());
    }

    @Test
    public void myArrayListImplGetSize() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        Assert.assertEquals(2, myArrayList.getSize());
    }

    @Test
    public void myArrayListImplConstructorNoArgs() {
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        Assert.assertArrayEquals(new String[0], myArrayList.getArray());
    }

    @Test
    public void myArrayListImplConstructorWithArgs() {
        String[] test = new String[]{"2", "3"};
        MyArrayListImpl myArrayList = new MyArrayListImpl(test);
        Assert.assertArrayEquals(test, myArrayList.getArray());
    }

    @Test
    public void myArrayListImplAddElemWithBlankArray() {
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        myArrayList.addElem("4");
        Assert.assertArrayEquals(new String[]{"4"}, myArrayList.getArray());
    }

    @Test
    public void myArrayListImplAddElemWithGivenArray() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        myArrayList.addElem("4");
        Assert.assertArrayEquals(new String[]{"2", "3", "4"}, myArrayList.getArray());
    }

    @Test
    public void myArrayListImplGetElemByIndexException() {
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        Throwable exception = Assert.assertThrows(IndexOutOfBoundsException.class,
                () -> myArrayList.getElemByIndex(3));
        Assert.assertEquals("Incorrect index", exception.getMessage());
    }

    @Test
    public void myArrayListImplGetElemByIndexNoException() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        String a = myArrayList.getElemByIndex(1);
        Assert.assertEquals("3", a);
    }

    @Test
    public void myArrayListImplDeleteElemByIndex() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        String a = myArrayList.deleteElemByIndex(1);
        Assert.assertArrayEquals(new String[]{"2"}, myArrayList.getArray());
        Assert.assertEquals("3", a);
    }

    @Test
    public void myArrayListImplDeleteElemByValue() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        int a = myArrayList.deleteElemByValue("3");
        Assert.assertArrayEquals(new String[]{"2"}, myArrayList.getArray());
        Assert.assertEquals(1, a);
    }

    @Test
    public void myArrayListImplFindIndex() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        int a = myArrayList.findIndex("3");
        Assert.assertEquals(1, a);
    }

    @Test
    public void myArrayListImplExists() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        boolean a = myArrayList.exists("4");
        Assert.assertFalse(a);
    }

    @Test
    public void myArrayListImplToString() {
        MyArrayListImpl myArrayList = new MyArrayListImpl(new String[]{"2", "3"});
        Assert.assertEquals("2 3 ", myArrayList.toString());
    }
}

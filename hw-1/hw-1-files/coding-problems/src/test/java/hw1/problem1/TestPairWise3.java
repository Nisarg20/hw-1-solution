package hw1.problem1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class TestPairWise3 {

    //    s1 = null, s2 = null
    @Test
    public void test1() {
        Set<Integer> s1 = null;
        Set<Integer> s2 = null;
        Set<Integer> expected = new HashSet<Integer>();
        assertEquals(expected, Sets.intersection(s1, s2));
    }

    //    s1 = {}, s2 = {}
    @Test
    public void test2() {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        Set<Integer> expected = new HashSet<Integer>();
        assertEquals(expected, Sets.intersection(s1, s2));
    }

    //    s1 = null, s2 = {...}
    @Test
    public void test3() {
        Set<Integer> s1 = null;
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(1,2));
        Set<Integer> expected = new HashSet<Integer>();
        assertEquals(expected, Sets.intersection(s1, s2));
    }

    //    s1 = {}, s2 = {...}
    @Test
    public void test4() {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(1,2,3));
        Set<Integer> expected = new HashSet<Integer>();
        assertEquals(expected, Sets.intersection(s1, s2));
    }


    //    s1 = {...}, s2 = {...}
    @Test
    public void test5() {
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(1,2,3));
        Set<Integer> expected = new HashSet<Integer>(Arrays.asList(1,2,3));
        assertEquals(expected, Sets.intersection(s1, s2));
    }

    //    s1 = {ab}, s2 = {abc}
    @Test
    public void test6() {
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(4,5,6));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));
        Set<Integer> expected = new HashSet<Integer>(Arrays.asList(4,5,6));
        assertEquals(expected, Sets.intersection(s1, s2));
    }

    //    s1 = {abc}, s2 = {ab}
    @Test
    public void test7() {
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(4,5,6));
        Set<Integer> expected = new HashSet<Integer>(Arrays.asList(4,5,6));
        assertEquals(expected, Sets.intersection(s1, s2));
    }

    //    s1 = {abc}, s2 = {cde}
    @Test
    public void test8() {
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(4,5,6));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(6,7,8));
        Set<Integer> expected = new HashSet<Integer>();
        expected.add(6);
        assertEquals(expected, Sets.intersection(s1, s2));
    }

    //    s1 = {abc}, s2 = {def}
    @Test
    public void test9() {
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(4,5,6));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(1,2,3));
        Set<Integer> expected = new HashSet<Integer>();
        assertEquals(expected, Sets.intersection(s1, s2));
    }


}
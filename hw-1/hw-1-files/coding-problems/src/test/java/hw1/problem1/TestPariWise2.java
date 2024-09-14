//package hw1.problem1;
//// [TODO] use Junit and write the test cases below
//// Total test cases = 7 (Thala for a reason)
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.Set;
//import java.util.HashSet;
//import java.util.Arrays;
//
//public class TestPariWise2 {
//
//    //    s1 = null, s2 = null
//    @Test
//    public void test1() {
//        Set<Integer> s1 = null;
//        Set<Integer> s2 = null;
//        assertTrue(Sets.intersection(s1, s2).isEmpty());
//    }
//
//    //    s1 = {}, s2 = {}
//    @Test
//    public void test2() {
//        Set<Integer> s1 = new HashSet<>();
//        Set<Integer> s2 = new HashSet<>();
//        assertTrue(Sets.intersection(s1, s2).isEmpty());
//    }
//
//    //    s1 = {}, s2 = null
//    @Test
//    public void test3() {
//        Set<Integer> s1 = new HashSet<>();
//        Set<Integer> s2 = null;
//        assertTrue(Sets.intersection(s1, s2).isEmpty());
//    }
//
//
//    //    s1 = {}, s2 = {...}
//    @Test
//    public void test4() {
//        Set<Integer> s1 = new HashSet<>();
//        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3));
//        Set<Integer> expected = new HashSet<>();
//        assertEquals(expected, Sets.intersection(s1, s2));
//    }
//
//
//    //    s1 = {...}, s2 = null
//    @Test
//    public void test5() {
//        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
//        Set<Integer> s2 = null;
//        Set<Integer> expected = new HashSet<>();
//        assertEquals(expected, Sets.intersection(s1, s2));
//    }
//
//    //    s1 = {...}, s2 = {...}
//    @Test
//    public void test6() {
//        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
//        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3));
//        Set<Integer> expected = new HashSet<>(Arrays.asList(1,2,3));
//        assertEquals(expected, Sets.intersection(s1, s2));
//    }
//
//    //    s1 = {abc}, s2 = {def}
//    @Test
//    public void test7() {
//        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
//        Set<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6));
//        Set<Integer> expected = new HashSet<>();
//        assertEquals(expected, Sets.intersection(s1, s2));
//    }
//}

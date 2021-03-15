package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {

    private final int[] singleSeq = {16};
    private final int[] seq = {10, 34, 123, 767};
    private final int[] bigSeq = {4, 67, 99, 517, 900, 8912, 90000};
    private SearchResult searchResult;

    @BeforeEach
    void setUp() throws Exception {
    }


    @Test
    void keyInSingleSeq() {
        int key = 16;
        searchResult = BinarySearch.search(key, singleSeq);
        assertTrue(searchResult.isFound());
    }

    @Test
    void keyNotInSingleSeq() {
        int key = 786;
        searchResult = BinarySearch.search(key, singleSeq);
        assertFalse(searchResult.isFound());
    }

    @Test
    void keyAsFirstElement() {
        int key = 10;
        searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
        assertEquals(1, searchResult.getPosition());
    }

    @Test
    void keyAsLastElement() {
        int key = 767;
        searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
        assertEquals(seq.length, searchResult.getPosition());
    }

    @Test
    void keyInSeq() {
        int key = 123;
        searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
    }

    @Test
    void keyNotInSeq() {
        int key = 99;
        searchResult = BinarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
    }

    @Test
    void keyAsMidElement() {
        int key = 517;
        searchResult = BinarySearch.search(key, bigSeq);
        assertEquals(true, searchResult.isFound());
        assertEquals(4, searchResult.getPosition());
    }

}

package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {

    private int[] singleSeq = {16};
    private int[] seq = {10, 34, 123, 767};
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
        assertEquals(key, seq[0]);
    }

    @Test
    void keyAsLastElement() {
        int key = 767;
        searchResult = BinarySearch.search(key, seq);
        assertEquals(key, seq[seq.length - 1]);
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

}

package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {

    private int[] singleSeq = {16};
    private int[] seq = {10, 34, 123, 767};
    private SearchResult searchResult;
    @BeforeEach
    void setUp() throws Exception {};

    @Test
    void keyInSingleSeq(){
        int key = 16;
        searchResult = BinarySearch.search(key, singleSeq);
        assertTrue(searchResult.isFound());
    }

    @Test
    void keyNotInSingleSeq() {
        int key = 786;
        searchResult = BinarySearch.search(key, singleSeq);
        assertTrue(!searchResult.isFound());
    }

    @Test
    void keyAsFirstElement(){
        int key = 10;
        searchResult = BinarySearch.search(key, seq);
        assertTrue(seq[0] == key);
    }

    @Test
    void keyAsLastElement(){
        int key = 767;
        searchResult = BinarySearch.search(key, seq);
        assertTrue(seq[seq.length-1] == key);
    }

}

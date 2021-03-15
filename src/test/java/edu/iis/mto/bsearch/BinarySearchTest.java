package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {

    private int[] seq = {10, 34, 123, 767};
    private SearchResult searchResult;
    @BeforeEach
    void setUp() throws Exception {};

    @Test
    void keyInSeq(){
        int key = 34;
        int[] seq = {10, 34, 123, 767};
        searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
    }

    @Test
    void keyNotInSeq() {
        int key = 786;
        int[] seq = {10, 34, 123, 767};
        searchResult = BinarySearch.search(key, seq);
        assertTrue(!searchResult.isFound());

    }
}

package org.example.rs.android_stage1_task4

import org.example.rs.android_stage1_task4.subtask4.FullBinaryTrees
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class FullBinaryTreesTests {

    private val solution = FullBinaryTrees()


    private fun sanitize(string: String): String {
        return string.split("\\s+".toRegex()).joinToString(separator = "")
    }

    @Test
    fun test1() {
        val output = sanitize(solution.stringForNodeCount(1))
        assertEquals("[[0]]", output)
    }

    @Test
    fun test2() {
        assertEquals("[]", solution.stringForNodeCount(0))
    }

    @Test
    fun test3() {
        assertEquals("[]", solution.stringForNodeCount(4))
    }

    @Test
    fun test4() {
        val output = sanitize(solution.stringForNodeCount(7))
        assertTrue(output.contains("[0,0,0,null,null,0,0,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,null,null,0,0,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,null,null,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,null,null,0,0]"))
    }

    @Test
    fun test5() {
        val output = sanitize(solution.stringForNodeCount(9))
        assertTrue(output.contains("[0,0,0,null,null,0,0,null,null,0,0,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,null,null,0,0,null,null,0,0,0,0]"))
        assertTrue(output.contains("[0,0,0,null,null,0,0,0,0,0,0]"))
        assertTrue(output.contains("[0,0,0,null,null,0,0,0,0,null,null,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,null,null,0,0,0,0,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,0,0,null,null,null,null,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,0,0,null,null,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,0,0,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,0,0,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,null,null,null,null,0,0,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,null,null,null,null,0,0,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,null,null,0,0,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,null,null,0,0,null,null,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0,null,null,0,0,null,null,0,0]"))
    }

    @Test
    fun test6() {
        val output = sanitize(solution.stringForNodeCount(5))
        assertTrue(output.contains("[0,0,0,null,null,0,0]"))
        assertTrue(output.contains("[0,0,0,0,0]"))
    }
}
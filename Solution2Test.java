import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @description:
 *
 * 测试类的总体原则：
 * 1. 等价类划分：根据输入字符串的不同情况，将测试用例分为不同的等价类，如字符串中没有重复字符、有重复字符、字符串为空等。
 * 2. 边界测试：测试字符串长度为1和最大长度的情况。
 * 3. 特殊情况：包含所有字母、所有相同字母、以及非字母字符等情况。
 */
public class Solution2Test {

    // 实例化被测试类
    private final Solution2 solution = new Solution2();

    /**
     * 测试目的：
     * 测试一般情况，字符串含有重复字母，需去重并保持字典序最小。
     *
     * 测试用例：
     * 输入："bcabc"
     * 预期输出："abc"
     */
    @Test
    public void testRemoveDuplicateLettersGeneralCase() {
        String input = "bcabc";
        String expected = "abc";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * 测试目的：
     * 测试字符串中包含多个重复字母，并且需要保证字典序最小。
     *
     * 测试用例：
     * 输入："cbacdcbc"
     * 预期输出："acdb"
     */
    @Test
    public void testRemoveDuplicateLettersWithManyDuplicates() {
        String input = "cbacdcbc";
        String expected = "acdb";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * 测试目的：
     * 测试字符串没有重复字母，结果应与输入一致。
     *
     * 测试用例：
     * 输入："abc"
     * 预期输出："abc"
     */
    @Test
    public void testRemoveDuplicateLettersNoDuplicates() {
        String input = "abc";
        String expected = "abc";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * 测试目的：
     * 测试字符串中所有字母相同，只应保留一个字母。
     *
     * 测试用例：
     * 输入："aaaaa"
     * 预期输出："a"
     */
    @Test
    public void testRemoveDuplicateLettersAllSameLetters() {
        String input = "aaaaa";
        String expected = "a";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * 测试目的：
     * 测试边界情况，字符串长度为1，应返回该字符。
     *
     * 测试用例：
     * 输入："a"
     * 预期输出："a"
     */
    @Test
    public void testRemoveDuplicateLettersSingleCharacter() {
        String input = "a";
        String expected = "a";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * 测试目的：
     * 测试所有字母均出现一次的情况，应返回字母表序列。
     *
     * 测试用例：
     * 输入："abcdefghijklmnopqrstuvwxyz"
     * 预期输出："abcdefghijklmnopqrstuvwxyz"
     */
    @Test
    public void testRemoveDuplicateLettersAllAlphabet() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * 测试目的：
     * 测试包含重复字母，字母顺序已经符合字典序的情况。
     *
     * 测试用例：
     * 输入："aabbcc"
     * 预期输出："abc"
     */
    @Test
    public void testRemoveDuplicateLettersSortedWithDuplicates() {
        String input = "aabbcc";
        String expected = "abc";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }
}
// new comment

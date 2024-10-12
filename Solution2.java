/**
 * @description:
 *
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 *
 *
 * 示例 1：
 *
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 *
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 */
class Solution2 {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[26];  // 使用26个元素来表示字母的存在状态
        int[] num = new int[26];  // 使用26个元素来统计字母出现的次数

        // 统计每个字母的出现次数
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 每遍历一个字母，减去它的剩余次数
            num[ch - 'a']--;

            // 如果该字母已经在结果中，跳过
            if (vis[ch - 'a']) {
                continue;
            }

            // 保证字典序最小，移除比当前字母大的，并且后面还有的字母
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch && num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            // 添加当前字母到结果，并标记为已访问
            sb.append(ch);
            vis[ch - 'a'] = true;
        }

        return sb.toString();
    }
}



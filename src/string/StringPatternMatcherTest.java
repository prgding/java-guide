package string;

public class StringPatternMatcherTest {
    public static void main(String[] args) {
        String parentString = "Hello, this is a test string. This is another test string.";
        String subString = "test";
        String newString = "sample";

        // 测试方法1
        int firstOccurrence = StringPatternMatcher.findFirstOccurrence(parentString, subString);
        System.out.println("子串首次出现位置: " + firstOccurrence);

        // 测试方法2
        System.out.println("子串出现的所有位置:");
        StringPatternMatcher.findAllOccurrences(parentString, subString);

        // 测试方法3
        String replacedString = StringPatternMatcher.replaceSubstring(parentString, subString, newString);
        System.out.println("替换后的结果: " + replacedString);
    }
}

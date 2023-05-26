package string;

public class StringPatternMatcher {
    public static int findFirstOccurrence(String parent, String pattern) {
        for (int i = 0; i <= parent.length() - pattern.length(); i++) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if (parent.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == pattern.length())
                return i;
        }
        return -1;
    }

    public static void findAllOccurrences(String parent, String pattern) {
        for (int i = 0; i <= parent.length() - pattern.length(); i++) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if (parent.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == pattern.length())
                System.out.println("匹配成功，位置在: " + i);
        }
    }

    public static String replaceSubstring(String parent, String pattern, String replacement) {
        System.out.println("原始串: " + parent);
        System.out.println("被替换串为: " + pattern + "\t替换串为: " + replacement);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i <= parent.length() - pattern.length()) {
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (parent.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                sb.append(replacement);
                i += pattern.length();
            } else {
                sb.append(parent.charAt(i));
                i++;
            }
        }
        sb.append(parent.substring(i));
        return sb.toString();
    }
}

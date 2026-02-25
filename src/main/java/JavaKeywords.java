import java.util.Set;

public class JavaKeywords {
    private static final Set<String> javaKeywords = Set.of(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
    );

    public boolean containsJavaKeyword(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String[] words = input.split("\\W+");

        for (String word : words) {
            if (javaKeywords.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

package interview;
import java.util.HashMap;
import java.util.Map;

public class ProductFamilyMatcher {

    // Trie Node class
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String familyName = null;  // This will store the family name at the leaf node
    }

    // Root of the Trie
    private static final TrieNode root = new TrieNode();

    // Method to insert family codes into the Trie
    private static void insertFamilyCode(String familyCode, String familyName) {
        TrieNode currentNode = root;

        // Traverse each character in the family code
        for (char c : familyCode.toCharArray()) {
            currentNode = currentNode.children.computeIfAbsent(c, k -> new TrieNode());
        }

        // Set the family name at the leaf node
        currentNode.familyName = familyName;
    }

    // Method to find the family for a given product code
    public static String findProductFamily(String productCode) {
        TrieNode currentNode = root;

        TrieNode lastMatchNode = root;
        // Traverse the Trie based on the product code
        for (char c : productCode.toCharArray()) {
            currentNode = currentNode.children.get(c);
            if (currentNode == null) {
                break;
            } else {
                lastMatchNode = currentNode;
            }
        }


        // Return the family name at the last matched node
        return lastMatchNode.familyName != null ? lastMatchNode.familyName : "No matching family found";
    }

    public static void main(String[] args) {
        // Insert family codes into the Trie
        insertFamilyCode("1", "family_1");
        insertFamilyCode("3", "family_2");
        insertFamilyCode("301", "family_3");
        insertFamilyCode("3010", "family_4");
        insertFamilyCode("4010", "family_5");

        // Test cases
        System.out.println(findProductFamily("301020"));  // Expected output: family_4
        System.out.println(findProductFamily("3015010")); // Expected output: family_3
        System.out.println(findProductFamily("401234"));  // Expected output: family_5
        System.out.println(findProductFamily("12345"));   // Expected output: family_1
    }
}

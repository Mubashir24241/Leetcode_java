//Approach-1
//T.C : Linear
//S.C : Extra space map
// public class Solution {
//     public char findTheDifference(String s, String t) {
//         Map<Character, Integer> mp = new HashMap<>();
        
//         for (char ch : s.toCharArray()) {
//             mp.put(ch, mp.getOrDefault(ch, 0) + 1);
//         }
        
//         for (char ch : t.toCharArray()) {
//             mp.put(ch, mp.getOrDefault(ch, 0) - 1);
            
//             if (mp.get(ch) < 0)
//                 return ch;
//         }
        
//         return 'a'; // send any random character; it will never reach here
//     }
// }


//Approach-2 (Using Sum Difference)
//T.C : Lines
//S.C : constant
public class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        
        for (char ch : t.toCharArray())
            sum += ch;
        
        for (char ch : s.toCharArray())
            sum -= ch;
        
        return (char) sum;
    }
}


//Approach-3 (Using XOR property)
//T.C : Linear
//S.C : constant
// public class Solution {
//     public char findTheDifference(String s, String t) {
//         int xor = 0;
        
//         for (char ch : t.toCharArray())
//             xor ^= ch;
        
//         for (char ch : s.toCharArray())
//             xor ^= ch;
        
//         return (char) xor;
//     }
// }
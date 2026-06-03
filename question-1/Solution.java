public class Solution
{
    public Account(String requestedName) {
        String result = requestedName;
        int i = 0;
        while (!isAvailable(result)) {
            result = result + i;
            ++i;
        }
        username = result;
    }

    public String getShortenedName() {
        String result = username;
        while (username.indexOf("-") != -1) {
            int begin = username.indexOf("-") - 1;
            int end = start + 2;
        
            result = result.substring(0, begin) + result.substring(begin, end);
        }   
        return result;
    }
}
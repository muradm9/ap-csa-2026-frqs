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
}
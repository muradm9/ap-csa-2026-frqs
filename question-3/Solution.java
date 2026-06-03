public class Solution
{
    public int moreHistoryThanMathAbsences() {
        int result = 0;
        for (CourseRecord sH : historyList) {
            for (CourseRecord sM : mathList) {
                if (sM.getStudentID().equals(sH.getStudentID()) && (sH.getAbsences() > sM.getAbsences()) {
                    result++;
                }
            }
        }
        return result;
    }
}
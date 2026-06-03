public class Solution
{
    public int getPointsForRow(int targetRow) {
        Space[] row = board[targetRow];
        boolean sameColor = true;
        int score = row[0].getPoints();
        String color = row.getColor();

        for (int i = 1; i < row.length; i++) {
            if (!color.equals(row[i].getColor())) {
                sameColor = false;
            }
            score += row[i].getPoints();
        }

        if (sameColor) {
            score *= 2;
        }

        return score;
    }
}
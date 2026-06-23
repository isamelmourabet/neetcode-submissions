class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char number = board[r][c];

                if (number != '.') {
                    String rowKey = number + " found in row " + r;
                    String colKey = number + " found in col " + c;
                    String boxKey = number + " found in box " + (r / 3) + "-" + (c / 3);

                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

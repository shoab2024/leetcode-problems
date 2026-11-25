class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startC = image[sr][sc];
        if (startC != color) {
            dfs(image, sr, sc, startC, color);
        }
        return image;
    }

    private void dfs(int[][] image, int x, int y, int startC, int color) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != startC) {
            return;
        }

        image[x][y] = color;

        dfs(image, x - 1, y, startC, color);
        dfs(image, x + 1, y, startC, color);
        dfs(image, x, y - 1, startC, color);
        dfs(image, x, y + 1, startC, color);
    }
}
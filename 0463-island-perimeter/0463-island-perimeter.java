class Solution {
    private int solvedfs(int x,int y, int[][] grid,int[][] visited){
        int r=grid.length;
        int c=grid[0].length;
        if(x<0 || y<0 || x >=r || y >=c || grid[x][y]==0){
            return 1;
        }

        if(visited[x][y]==1){
            return 0;
        }
        visited[x][y]=1;


        int peri=0;

        peri+= solvedfs(x-1,y,grid,visited);
        peri+= solvedfs(x+1,y,grid,visited);
        peri+= solvedfs(x,y-1,grid,visited);
        peri+= solvedfs(x,y+1,grid,visited);

        return peri;
    }
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;

        int[][] visited=new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0;j<c; j++){
                if(grid[i][j]==1){
                   return solvedfs(i,j,grid,visited);

                }
            }
        }

        return 0;
    }
}
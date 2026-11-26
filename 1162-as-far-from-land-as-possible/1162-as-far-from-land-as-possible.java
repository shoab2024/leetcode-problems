class Solution {
    class pair{
        int r;
        int c;
        int d;
        pair(int r, int c, int d){
            this.r=r;
            this.c=c;
            this.d=d;
        }
    }
    public int maxDistance(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        Queue<pair> q=new LinkedList<>();

        boolean[][] vis=new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    q.add(new pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
            int dx[]={-1,0,+1,0};
            int dy[]={0,-1,0,+1};
            int[][] ans=new int[m][n];
        while(!q.isEmpty()){
            int qrow=q.peek().r;
            int qcol=q.peek().c;
            int qstep=q.peek().d;
            q.poll();
            ans[qrow][qcol]=qstep;
            for(int i=0; i<4; i++){
                int newr=qrow+dx[i];
                int newc=qcol+dy[i];

                if(newr>=0 && newr<m && newc>=0 && newc<n && !vis[newr][newc]){
                    vis[newr][newc]=true;
                    q.add(new pair(newr,newc,qstep+1));
                }
            }

        }

        int max=0;
        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                max=Math.max(max,ans[i][j]);
            }
        }
        if(max==0){
            return -1;
        }
        return max;
    }
}
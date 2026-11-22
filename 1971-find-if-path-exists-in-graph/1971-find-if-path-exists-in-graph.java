class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);


        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.add(source);

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == destination) {
                return true;
            }
            for (int x : adj.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }

        }
        return false;
    }
}
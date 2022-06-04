The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.


Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 
 
 
============================================================


class Solution {
    List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
        //combination of DFS and BACKTRACKING
        result=new ArrayList<>();
        char[][] board=new char[n][n];
        //Fill with (.) 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    board[i][j]='.';
            }
        }
        // Fill the queens position
        List<int[]> queens=new ArrayList<>();
        dfs(board,0,queens);
        return result;
        
    }
    public void dfs(char[][] board,int r, List<int[]> queens){
        //Check all queens are placed or not
        if(board.length==queens.size()){
            // Construct the output
            List<String> rows=new ArrayList<>();
            for(char[] row: board){
                rows.add(new String(row));
            }
            result.add(rows);
        }
        // Adding a queen
        for(int c=0;c<board.length;c++){
            if(canAddQueen(r,c,queens)){
                board[r][c]='Q';
                queens.add(new int[]{r,c});
                dfs(board,r+1,queens);
                board[r][c]='.';
                queens.remove(queens.size()-1);
                
            }
        }
      
    }
    private boolean canAddQueen(int r, int c, List<int[]> queens){
           for(int[] q: queens){
                int dx=Math.abs(r-q[0]);
                int dy=Math.abs(c-q[1]);
               if(dx==0 || dy==0 || dx==dy){
                   return false;
               }
           }
            return true;
        }
}


/* 
QUEEN cannot be placed in
1. same row (dx!=0)
2. same col (dy!=0)
3. same diagonal (dx!=dy)*/


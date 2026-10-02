import java.util.*;
class Solution {
    int count = 0;
    List<List<String>> answer;
    Set<Integer> cols;
    Set<Integer> diag1;
    Set<Integer> diag2;
    public int solution(int n) {
        char[][] board = new char[n][n];
        
        for(char[] c : board) {
            Arrays.fill(c,'.');
        }
        
        answer = new ArrayList<>();
        cols = new HashSet<>();
        diag1 = new HashSet<>();
        diag2 = new HashSet<>();
        
        // dfs(n, 0);
        
        dfs2(board, n,0);
        return answer.size();
    }
    
    private void dfs(int n, int row) {
        if(row == n) {
            count++;
            return;
        }
        
        for(int col=0; col<n; col++) {
            if(cols.contains(col) || diag1.contains(row-col) || diag2.contains(row+col)) {
                continue;
            }
            
            cols.add(col);
            diag1.add(row-col);
            diag2.add(row+col);
            
            dfs(n, row+1);
            
            cols.remove(col);
            diag1.remove(row-col);
            diag2.remove(row+col);
        }
    }
    
    private void dfs2(char[][] board, int n, int row) {
        if(row == n) {
            List<String> solution = new ArrayList<>();
            for(char[] c : board) {
                solution.add(new String(c));
            }
            answer.add(solution);
            return;
        }
        
        for(int col=0; col<n; col++) {
            if(cols.contains(col) || diag1.contains(row-col) || diag2.contains(row+col)) {
                continue;
            }
            
            board[row][col] = 'Q';
            cols.add(col);
            diag1.add(row-col);
            diag2.add(row+col);
            
            dfs2(board, n, row+1);
            
            board[row][col] = '.';
            cols.remove(col);
            diag1.remove(row-col);
            diag2.remove(row+col);
        }
    }
}
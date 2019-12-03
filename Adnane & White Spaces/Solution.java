import java.util.Scanner;

/**
 * Problem : whitespaces
*/
public class whitespacesSolution {

    private int n;
    private int m;

    public int countWhiteSpaces(char[][] paper){
        int count = 0;

        n = paper.length;
        if(n == 0) return 0;

        m = paper[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(paper[i][j] == '0'){
                    dfs(paper, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] paper, int i, int j){

        if(i < 0 || j < 0 || i >= n || j >= m  || paper[i][j] != '0') return;

        paper[i][j] = '*';
        dfs(paper, i+1, j);
        dfs(paper, i-1, j);
        dfs(paper, i, j+1);
        dfs(paper, i, j-1);
    }

    public static void main(String[] args) {
        
        whitespacesSolution ws = new whitespacesSolution();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        char[][] paper = new char[n][m];
        for(int i = 0; i < n; i++){
            String str = s.next();
            for(int j = 0; j < m; j++){
                paper[i][j] = str.charAt(j);
            }
        }

        System.out.println(ws.countWhiteSpaces(paper));
        s.close();
    }
}

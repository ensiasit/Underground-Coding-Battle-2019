#include<bits/stdc++.h>

using namespace std;

#define N 50
string s[N];
int n, m;

void dfs(int i, int j){

    if(i < 0 || j < 0 || i >= n || j >= m  || s[i][j] != '0') return;

    s[i][j] = '*';
    dfs(i+1, j);
    dfs(i-1, j);
    dfs(i, j+1);
    dfs(i, j-1);
}

int countWhiteSpaces(){
    int count = 0;

    if(n == 0) return 0;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(s[i][j] == '0'){
                dfs(i, j);
                count++;
            }
        }
    }
    return count;
}

int main(int argc, const char** argv) {

    cin >> n >> m;

    for(int i = 0; i < n; i++) cin >> s[i];

    cout << countWhiteSpaces() << endl;
    
    return 0;
}



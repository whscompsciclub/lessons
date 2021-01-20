/*
 * Given an N x N matrix like so in perimeter.in:
 *  ##....
 *  ....#.
 *  .#..#.
 *  .#####
 *  ...###
 *  ....##
 *  (# = ice cream)
 *  Find the blob that has maximum contigious area
 *  of ice cream. If multiple blobs have equal area,
 *  use the one that has the least perimeter.
 *  Save its area and perimeter in perimeter.out.
 **/

#include <bits/stdc++.h>
using namespace std;

const int L = 20;
int N;
bool cfg[L][L];
bool visited[L][L];
int cmp[L][L];
vector<int> p; // perimeter
vector<int> a; // area

void dfs(int b, int i, int j) {
    if (visited[i][j]) return;
    cmp[i][j] = b;
    a[b]++;

    if (i < 1 || !cfg[i - 1][j])      p[b]++;
    if (j < 1 || !cfg[i][j - 1])      p[b]++;
    if (i == N - 1 || !cfg[i + 1][j]) p[b]++;
    if (j == N - 1 || !cfg[i][j + 1]) p[b]++;

    if (i >= 1 && cfg[i - 1][j])     dfs(b, i - 1, j);
    if (j >= 1 && cfg[i][j - 1])     dfs(b, i, j - 1);
    if (i < N - 1 && cfg[i + 1][j])  dfs(b, i + 1, j);
    if (j < N - 1 && cfg[i][j + 1])  dfs(b, i, j + 1);
}

int main(int argc, char *argv[]) {
    cin.tie(0)->sync_with_stdio(0);
    freopen("perimeter.in", "r", stdin);
    freopen("perimeter.out", "w", stdout);
    cin >> N;
    for (int i = 0; i < N; i++) {
        string line;
        cin >> line;
        for (int j = 0; j < N; j++) {
            cfg[i][j] = line[j] == '#';
            visited[i][j] = false;
        }
    }

    int blob = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (cfg[i][j] && !visited[i][j]) {
                a.push_back(0);
                p.push_back(0);
                dfs(blob++, i, j);
            }
        }
    }

    int ba = 0; // best area
    int bp = 0; // best perimeter
    for (int i = 0; i < a.size(); i++)
        // if the current blob is better
        if (a[i] > ba || a[i] == ba && p[i] < bp)
            // update
            ba = a[i], bp = p[i];
    cout << ba << ' ' << bp;
    return 0;
}

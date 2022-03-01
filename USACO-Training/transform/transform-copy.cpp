/*
ID: vishal_7
PROG: transform
LANG: C++11
*/

#include <cstdio>
#include <cstring>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

typedef long long LL;
const int maxn = 12;
char a[maxn][maxn], b[maxn][maxn], c[maxn][maxn], d[maxn][maxn];

void rotate(int n, char a[][maxn], char b[][maxn]) {
  for (int i = 0; i < n; ++i) {
    for (int j = 0; j < n; ++j) {
      b[i][j] = a[n - 1 - j][i];
    }
  }
}

bool check(int n, char a[][maxn], char b[][maxn]) {
  for (int i = 0; i < n; ++i) {
    for (int j = 0; j < n; ++j) {
      if (a[i][j] != b[i][j]) {
        return false;
      }
    }
  }
  return true;
}

int main() {
  freopen("transform.in","r",stdin);
  freopen("transform.out","w",stdout);
  int n;
  scanf("%d", &n);
  for (int i = 0; i < n; ++i) {
    scanf("%s", a[i]);
  }
  for (int i = 0; i < n; ++i) {
    scanf("%s", b[i]);
  }
  rotate(n, a, c);
  if (check(n, b, c)) {
    puts("1");
    return 0;
  }
  rotate(n, c, d);
  if (check(n, b, d)) {
    puts("2");
    return 0;
  }
  rotate(n, d, c);
  if (check(n, b, c)) {
    puts("3");
    return 0;
  }
  for (int i = 0; i < n; ++i) {
    for (int j = 0; j < n; ++j) {
      c[i][j] = a[i][n - 1 - j];
    }
  }
  if (check(n, b, c)) {
    puts("4");
    return 0;
  }
  rotate(n, c, d);
  if (check(n, b, d)) {
    puts("5");
    return 0;
  }
  rotate(n, d, c);
  if (check(n, b, c)) {
    puts("5");
    return 0;
  }
  rotate(n, c, d);
  if (check(n, b, d)) {
    puts("5");
    return 0;
  }
  puts(check(n, a, b) ? "6" : "7");
  return 0;
}


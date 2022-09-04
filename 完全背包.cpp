#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
const int N = 1010;
int n,m,v[N],w[N],f[N];
int main()
{
    scanf("%d%d",&n,&m);
    for(int i=1;i<=n;i++)
    {
        scanf("%d%d",&v[i],&w[i]);
    }
    
    for(int i=1;i<=n;i++)
    {
        for(int j=v[i];j<=m;j++)
        {
            //f[i][j]=max(f[i-1][j],f[i][j-v[i]]+w[i])
            f[j]=max(f[j],f[j-v[i]]+w[i]);
        }
    }
    cout<<f[m]<<endl;
    return 0;
}
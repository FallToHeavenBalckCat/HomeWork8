#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;
const int N = 1010;
int v[N],w[N],f[N];//f[i][j]表示(i,j)这个状态下的最大值
int main()
{
    int n,m;
    scanf("%d%d",&n,&m);
    for(int i=1;i<=n;i++){
        scanf("%d%d",&v[i],&w[i]);
    }
    
    //f[0][n]默认是0了，因为没有拿物品，所以自然是0,所以从1开始枚举即可
    for(int i=1;i<=n;i++)
    {
        for(int j=m;j>=v[i];j--)
        {
            //右边不一定存在，当j<vaa[i]的时候放不下第i个物品
            f[j]=max(f[j],f[j-v[i]]+w[i]);
        }
    }
    cout<<f[m];
    return 0;
}

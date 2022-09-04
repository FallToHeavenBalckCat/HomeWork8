#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
const int N=1e5+10;
int q[N],n,f;
double s[N];
bool check(double avg)
{
    for(int i=1;i<=n;i++) s[i]=s[i-1]+q[i]-avg;
    
    double mins=0;
    for(int i=0,j=f;j<=n;i++,j++)
    {
        mins=min(mins,s[i]);
        if(s[j]-mins>=0) return true;
    }
    return false;
}
int main()
{
    scanf("%d%d",&n,&f);
    double l=0,r=0;
    for(int i=1;i<=n;i++) 
    {
        scanf("%d",&q[i]);
        r=max(r,(double)q[i]);
    }
    while(r-l>1e-5)
    {
        double mid=(l+r)/2;
        if(check(mid)) l=mid;
        else r=mid;
    }
    cout<<int(r*1000)<<endl;//对一个浮点数向下取整：int(r);
    return 0;
}
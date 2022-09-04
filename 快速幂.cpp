#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
typedef long long LL;

LL pmi(int a,int k,int p){
    LL res=1%p;
    while(k){
        //只要二进制数k的个位是1，更新答案，
        if(k&1) res=res*a%p;
        //反复平方法
        a=a*(LL)a%p;
        k>>=1;
    }
    return res;
}

int main()
{
    int n;
    scanf("%d",&n);
    while(n--){
        int a,k,p;
        scanf("%d%d%d",&a,&k,&p);
        printf("%d\n",pmi(a,k,p));
    }
    return 0;
}

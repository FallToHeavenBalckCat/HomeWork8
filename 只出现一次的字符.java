#include <iostream>
#include <cstring>
#include <string>
#include <algorithm>
#include <queue>
#include <unordered_map>
#include <vector>
using namespace std;
const int N=100010;
unordered_map<char,int> h;

int main()
{
    char str[N];
    scanf("%s",str);
    for(int i=0;str[i];i++)
    {
        h[str[i]]++;
    }
    bool flag=false;
    for(int i=0;str[i];i++)
    {
        if(h[str[i]]==1) 
        {
            cout<<str[i]<<endl;
            flag=true;
            break;
        }
        else continue;
    }
    if(!flag) cout<<"no"<<endl;
    return 0;
}

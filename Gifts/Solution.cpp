#include <iostream>
#include <vector>
#include <string>
 
using namespace std;
 
int main()
{
	long n;
	cin>>n;
	vector <long> res(n+1,0);
	for(long i=1;i<=n;i++)
	{
		long temp;
		cin>>temp;
		res[temp]=i;
	}
	for(long i=1;i<=n;i++)
		cout<<res[i]<<" ";	
}
i#include<iostream>
#include<string.h>
using namespace std;
bool palindrome_check(char *str)
{
	char *head=str;
	char *tail=str+strlen(str)-1;
	while(head<tail)
	{
		if(*head!=*tail)
		return false;
		head++;
		tail--;
	}
	return true;
}

int main()//main function
{
	char ch[20];
	cout<<"enter string for palindrom check::"<<endl;
	gets(ch);
	if(palindrome_check(ch))
	cout<<ch<<" "<<"is palindrome"<<endl;
	else 
	cout<<ch<<" "<<"is not palindrome"<<endl;
	return 0;
}


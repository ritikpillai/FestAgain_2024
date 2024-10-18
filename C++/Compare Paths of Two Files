// C++ Program to Compare Paths of Two Files
#include <iostream>
using namespace std;

// function to compare two paths
void pathCompare(string p1, string p2)
{

	// stores compared value 0 or >0 or <0
	const int res = p1.compare(p2);
	if (res > 0)
		cout << p1 << " is greater than " << p2;
	else if (res == 0)
		cout << p1 << " is equal to " << p2;
	else
		cout << p1 << " is less than " << p2;
	cout << "\n";
}

// Driver code
int main()
{
	string p1 = "/a/b/c";
	string p2 = "/a/b/";
	string p3 = "/a/b";
	string p4 = "/a/b";
	string p5 = "/a/b";
	string p6 = "/a/b.";
	pathCompare(p1, p2); // function call
	pathCompare(p3, p4); // function call
	pathCompare(p5, p6); // function call
	return 0;
}

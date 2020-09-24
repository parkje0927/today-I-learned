#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int m) {
    vector<int> answer;
    
    int gcd = 0, lcm = 0;
    int a = n, b = m;
    
    while (true) {
        int r = a % b;
        
        if (r == 0) {
            gcd = b;
            break;
        }
        
        a = b;
        b = r;
    }
    
    lcm = (n*m) / gcd;
    answer.push_back(gcd);
    answer.push_back(lcm);
    
    return answer;
}
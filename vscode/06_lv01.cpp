#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    
    int count = 0;
    
    string day[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    for (int i=0;i<a-1;i++) {
        count += month[i];
    }
    
    count += b-1;
    count %= 7;
    answer = day[count];
    
    return answer;
}
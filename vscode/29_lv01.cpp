#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int answer = 0;
    
    if (num == 1) {
        answer = 0;
        return answer;
    }
    
    for (int i=1;i<=500;i++) {
        if (num % 2 == 0) {
            num /= 2;
        }
        else if (num % 2 == 1) {
            num *= 3;
            num += 1;
        }
        
        if (num == 1) {
            answer = i;
            break;
        }
    }
    
    
    if (num != 1) {
        answer = -1;
    }
    
    return answer;
}
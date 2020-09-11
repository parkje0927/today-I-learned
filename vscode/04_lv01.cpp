#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    
    vector <int> total;
    for (int i=1;i<=n;i++) {
        total.push_back(1);
        
        for (int j=0;j<lost.size();j++) {
            if (lost[j] == i) {
                total[i-1] -= 1;
            }
        }
        
        for (int j=0;j<reserve.size();j++) {
            if (reserve[j] == i) {
                total[i-1] += 1;
            }
        }
    }
    
    for (int i=0;i<n;i++) {
        if (total[i] == 0) {
            if (i == 0 && i+1 < n) {
                if (total[i+1] == 2) {
                    total[i+1] -= 1;
                    total[i] = 1;
                }
            }
            else if (i-1 >= 0 && i+1 < n) {
                if (total[i-1] == 2) {
                    total[i-1] -= 1;
                    total[i] = 1;
                }
                else if (total[i+1] == 2) {
                    total[i+1] -= 1;
                    total[i] = 1;
                }
            }
            else if (i+1 == n-1) {
                if (total[i+1] == 2) {
                    total[i+1] -= 1;
                    total[i] = 1;
                }
            }
        }
    }
    
    for (int i=0;i<n;i++) {
        if (total[i] == 1 || total[i] == 2) {
            answer++;
        }
    }
    
    return answer;
}
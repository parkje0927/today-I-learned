#include <algorithm>
#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    
    for (int i=0;i<numbers.size()-1;i++) {
        for (int j=i+1;j<numbers.size();j++) {
            int sum = numbers[i] + numbers[j];
            
            bool flag = true;
            for (int k=0;k<answer.size();k++) {
                if (answer[k] == sum) {
                    flag = false;
                    break;
                }
            }
            
            if (flag == true) {
                answer.push_back(sum);    
            }            
        }
    }
    
    sort(answer.begin(), answer.end());
    
    return answer;
}
#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    
    int size = progresses.size();
    int temp[size];
    for (int i=0;i<size;i++) {
        
        int cnt = 0;        
        while (true) {
            
            progresses[i] += speeds[i];
            cnt++;
            if (progresses[i] >= 100) {
                break;
            }            
        }
        
        temp[i] = cnt; 
    }
    
    int max = temp[0];
    int count = 1;
    int len = sizeof(temp) / sizeof(int);
    for (int i=1;i<len;i++) {
 
        if (temp[i] > max) {
            max = temp[i];
            answer.push_back(count);
            count = 1;
        }
        else {
            count++;
        } 
        
        if (i == len-1) {
            answer.push_back(count);
        }
    }
    
    return answer;
}
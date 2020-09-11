#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int A[5] = {
  1, 2, 3, 4, 5  
};

int B[8] = {
  2, 1, 2, 3, 2, 4, 2, 5  
};

int C[10] = {
  3, 3, 1, 1, 2, 2, 4, 4, 5, 5  
};

vector<int> solution(vector<int> answers) {
    vector<int> ans;
    
    //1번은 1 2 3 4 5 반복
    //2번은 2 1 2 3 2 4 2 5 반복
    //3번은 3 3 1 1 2 2 4 4 5 5 반복
    
    int mymax = -1;
    int max_idx = -1;
    int idx;

    // printf("%d\n", sizeof(B) / sizeof(int));
    
    //A
    int A_count = 0;
    for (int i=0;i<answers.size();i++) {
        idx = i % 5;  
        if (answers[i] == A[idx]) {
           A_count++; 
        }      
    }
    mymax = A_count;
    ans.push_back(1);
    
    //B
    int B_count = 0;
    for (int i=0;i<answers.size();i++) {
        idx = i % 8;
        if (answers[i] == B[idx]) {
            B_count++;
        }        
    }
    if (B_count > mymax) {
        mymax = B_count;
        ans.pop_back();
        ans.push_back(2);
    }
    else if (B_count == mymax) {
        ans.push_back(2);
    }
    
    //C
    int C_count = 0;
    for (int i=0;i<answers.size();i++) {
        idx = i % 10;
        if (answers[i] == C[idx]) {
            C_count++;
        }
    }
    if (C_count > mymax) {
        ans.clear();
        ans.push_back(3);
    }
    else if (C_count == mymax) {
        ans.push_back(3);
    }
    
    return ans;
}
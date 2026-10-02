def solution(s):
    answer = -1

    # 스택을 만들기
    stk = []
    # 모든 데이터 확인
    for i in s:    
        # 비어 있다면
        if len(stk) == 0:
            # 넣고
            stk.append(i)
        # 아니면
        else:
            # 마지막 데이터가 지금의 데이터와 같다면
            if stk[-1] == i:
                # 빼고
                stk.pop()
            # 아니면
            else:
                # 넣고
                stk.append(i)
    # 끝나고
    # 데이터가 존재하면 제거 안 됨
    if len(stk) != 0:
        return 0
    # 데이터가 없다면 제거됨
    return 1

    return answer
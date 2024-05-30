def solution(spell, dic):
    # spell의 모든 글자를 정렬하여 하나의 문자열로 만듭니다.
    spell_sorted = ''.join(sorted(spell))
    
    # dic에 있는 모든 단어들을 순회하면서 비교합니다.
    for word in dic:
        # 각 단어를 정렬하여 spell_sorted와 비교합니다.
        if ''.join(sorted(word)) == spell_sorted:
            return 1
    
    # 일치하는 단어가 없으면 2를 반환합니다.
    return 2

# 예시
spell = ["p", "o", "s"]
dic = ["sop", "ops", "sos", "pop"]

print(solution(spell, dic))  # 1을 반환합니다.

def solution(letter):
    letter=list(letter.split())
    mos = [".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
           ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."]
    cg = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
           "w", "x","y","z"]
    idx = 0
    for i in mos:
        for u in range(len(letter)):
            if letter[u]==i:
                letter[u]=cg[idx]
        idx+=1
        
    answer="".join(letter)
    return answer

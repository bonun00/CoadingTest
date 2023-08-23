def solution(numbers):
    answer = ""
    result=""
    num= {
        "zero":'0', "one":'1', "two":'2', "three":"3", "four":"4", "five":"5", "six":"6", "seven":"7","eight":"8", "nine":"9"
    }
    numm=["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
]
    listnum=list(numbers)

    for i in listnum:
        result+=i
        if result in numm:
            answer+=num[result]
            result=""
    return int(answer)
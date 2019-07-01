def solution():
    Test_Case =  int(input())
    for i in range(0,Test_Case):
        num  =  int(input())
        count =0
        while num >1:
            if num%2 ==0:
                num = num/2
                count = count+1
            else:
                num = num-1
                count = count+1
        print(count)

solution()
from itertools import permutations
import itertools
#list1  =  [1,2,3,4,5,6,7,8,1,1,2,3,4,9,5,6,7,1,2,3,4,5,6,7]
list2 = [1,1,2,2,3,3,3,4,4,5,5,6,6,7,8,9,10,10,10,11,11,23,23,22,24,34,34,45,46,48]
list3 = [1,2,3,4,5,6,8,9,10,11,12,13]


ar1 = [1, 5, 10, 20, 40, 80]
ar2 = [6, 7, 20, 80, 100]
ar3 = [3, 4, 15, 20, 30, 70, 80, 120]
rl = []
position  = 13
a = "300 36 895 704 812 323"


for i in range(0,2):
    print(i)
#ll =  a.split(" ")
#print(type(ll[0]))
# for i in range(0,6-1):
#     if int(ll[i])>int(ll[i+1]):
#         print(ll[i+1],end=" ")
#     else:
#         print(-1,end =" ")
# print(-1)

# le  =  len(list3)
# print(le)

# sum1  =  round((le+1)*((le+2)/2))
# lsum   =  sum(list3)

# print(sum1-lsum)


# num1 =180
# num2 =100
# print(num1%num2)
# if (num1%num2 <num2/2):
#      print(num1-num1%num2)
# else:
#     print(num1 + (num2-num1%num2))
abc =  "468 335 501 170 725 479 359 963 465 706 146 282 828 962 492 996 943 828 437 392 605 903 154 293 383 422 717 719 896 448 727 772 539 870 913 668 300 36 895 704 812 323"
el = abc.split(" ")
ind  = 10
list1 = el[ind::]
list1.extend(el[:ind:])
for i in list1:
    print(i ,end=" ")
    




name  = "Difficulty of sentence Difficulty of sentence"

def check_hard():
    hard_word = {}
    easy_word = {}
    h_sum =0
    e_sum =0
    vovel = "aeiouAEIOU"
    v_count = 0
    vc_count = 0
    words = name.split(" ")
    for i in words:
        if len(i)>3:
            for j in i:
                if j  in vovel:
                    v_count +=1
                    vc_count +=1
                else:
                    vc_count  = 0

            if (len(i)-v_count > v_count  or vc_count>4 ):
                print(len(i)-v_count)
                hard_word.update({i:hard_word[i]+1 if hard_word.get(i) else 1})
            else:
                easy_word.update({i:easy_word[i]+1 if easy_word.get(i) else 1})
        else:
            easy_word.update({i:easy_word[i]+1 if easy_word.get(i) else 1})
        v_count  =0
        vc_count =0
    for v in hard_word.values():
        h_sum +=  v*5 
    
    for k,v in easy_word.items():
        e_sum +=  v*3     
    print(hard_word)
    print(easy_word) 
    return h_sum+e_sum

#print(check_hard())


def sum_elements():
    t = itertools.permutations(list3, r=2)
    print(list(t))
    for a,b in t:
        if (a+b  ==  position and position in list3):
            return a,b 
#print(sum_elements())

def rotate_array():
    rl = list3[position::]
    rl.extend(list3[:position:])
    print(rl)
#rotate_array()

def sinlge_element() :
    c=0
    for i in list1:
        if list1.count(i) ==1:
            c+=1
            print(i)
            if c==2:
                exit
#sinlge_element()
def sinlge_element_dic() :
    di ={}
    for i in list1:
         di[i] = list1.count(i) 
    for p,q in di.items():
        if q ==1:
            print(p)
#sinlge_element()
def unique_list() :
    return sorted(set(list2))
#print(unique_list())








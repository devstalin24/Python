# count occurance of care in string 
string = "Aman Kumar Yadav"

# method 1
new =""
for i in string:
    if i not in new:
        print(f"{i}: {string.count(i)}", end ="    ")
        new+=i
print()
new =""
# metod 2 with dict
count_dict = {key:string.count(key) for key in string}
print(count_dict)        

print()


#------------------------------------------
# count values in list 
new =""
print("list count")
# method 1
list1 = [1,2,3,4,1,2,3,5,7,4,8,3,5,7,9,2,5,3]
for i in list1:
    if str(i) not in new:
        print(f"{i}: {list1.count(i)}", end ="    ")
        new+=str(i)

new = ""
print()
# method 2
my_set = set(list1)
for i in my_set:
    print(f"{i}: {list1.count(i)}", end ="    ")

new = ""
print()
# mrthod 3
dict_count_list  = {key:list1.count(key) for key in list1}
print(dict_count_list)
new =""
#print(""+[f"{i} : {list1.count(i)}" if str(i) not in new  else new+=str(i) for i in list1 ])


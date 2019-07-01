# with open('IPLSoulutionResult.txt') as fs: 
#     while fs.readline()!="":
#         a = fs.readline()
#         print(a,end='')

# with open("IPLSoulutionResult.txt") as f:
#     a = f.readlines()

# for line in a:
#     print(line,end='')
# print(len(a))

# with open("Abc.txt",'r+') as f:
    # f.write("\nAman KUmar Yadav 24")

with open('file1.txt') as f:
    with open('Abc.txt','a') as fs:
        lines = f.readlines()
        print(lines)
        for line in lines:
           # fs.seek(len(fs.readlines()))
            name,salary = line.split(",")
            fs.write(f"{name}'s  salay is {salary}")

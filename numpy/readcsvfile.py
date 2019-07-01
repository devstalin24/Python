from csv import reader
from collections import OrderedDict
td ={}
with open('matches.csv' ,'r') as m:
    csv_reader = reader(m)
    next(csv_reader)
    for row in csv_reader:
        year = int(row[1])
        team = row[6]
        tos = row[7]
        if  year == 2017  and tos == "field" or year == 2016 and tos == "field":
            k = str(year)+"_"+team
            td.update({k:(td[k] +1 if td.get(k) else 1)})

match = OrderedDict(sorted(td.items(), key = lambda item:item[1], reverse=True))
print("Year\tTeam\tCount")
a ="_"
for key , value in match.items():
    print(f"{key.split(a)[0]}\t{key.split(a)[1]}\t{value}") 

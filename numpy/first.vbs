option explicit
Function ArrayExample()
    Dim num1,num2,num3,i
    Dim array1()
    Dim array3(6)
    Dim array2(3)
    'array3 = Array(1,2,3,4,5,6)
    Redim array1(5)
    for i = 0 To ubound(array1)
        array1(i) = i
    Next
    for i =0 to ubound(array1)
        num1 = num1 & " "& array1(i)
    Next
    msgbox(num1)
    redim preserve array1(7)
    msgbox array1(0)
   ' Redim array1(7)
    msgbox array1(0)
    array2(0) = "Aman"
    array2(1) = 24
    array2(2) = "Engineer"

    msgbox array2(0) & " " & array2(1) & " " & array2(2) 
    msgbox join(array1,",")
    Dim cv 
    cv = split("a,r,r,a,y,1", ",")
    msgbox cv(0)
End Function
call ArrayExample()
'msgbox weekdayName(1)
Function IFExample()
    Dim a,b,c,d
    'if End
    a =10
    b=12
    c =13
    d = 14
    if a < b Then
        msgbox a
    End if
    'if else End 
    if a>b Then
        msgbox a
    elseif d>b AND d>c and a>b Then
        msgbox d
    elseif a>b OR a<c Then
        msgbox c
    End if 
     
End Function

'call IFExample()

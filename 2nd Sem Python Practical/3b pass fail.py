m1,m2=int(input("Enter marks of maths")),int(input("Enter marks of English"))
att=int(input("Enter attendance"))
if (att>75):
  if(m1>35 and m2>35):
    print("Pass")
else:
 print("Fail")
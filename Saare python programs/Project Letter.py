letter = '''Hello Dear, <Name>
Here is a good news for you.
You are Selected In Our Company.
Thanks and Regards!
Date:-<Date>
'''
name=input("Enter Your Name:-\n")
date=input("Enter Date\n")
letter=letter.replace("<Name>",name)
letter=letter.replace("<Date>",date)
print(letter)
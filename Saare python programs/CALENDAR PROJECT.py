import calendar
Date = int(input("Enter The Date: "))
Month = int(input("Enter The Month: "))
Year = int(input("Enter The Year: "))

Day = calendar.weekday(Year,Month,Date)
WeekDay = calendar.day_name[Day]

print('''
The Day On The Date Is: 
''', WeekDay)
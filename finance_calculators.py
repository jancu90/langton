import math

print("Choose either 'investment' or 'bond' from the menu below to proceed: ")
print()
print()
print("investment       -to calculate the amount of interest you will earn on interest")
print("bond             -to calculate the amount you will have to pay on a home loan")
print()
calculator=input("Please enter 'Investment' or 'Bond' " )
calculator_case=calculator.lower()
calculator_caseB=False
if calculator_case == 'investment' or calculator_case == 'bond':
   calculator_caseB=True
else:   
   calculator=input("Error. Please enter 'Investment' or 'Bond' " )
   
   
total_amnt_simple=float()
total_amnt_compound=float()
repayment_bond=float()

if calculator_caseB:
   if calculator_case == 'investment':
      deposit_amnt=float(input("Enter the amount you wish to deposit "))
      interest_rate=float(input("Input interest rate "))
      interest_rate_final=(interest_rate/100)
      years_period=int(input("Period for investment in years "))
      interest=input("Type of interest: Compound or Simple ")
      interest_case=interest.lower()
      if interest_case == 'simple':
            total_amnt_simple=deposit_amnt*(1+interest_rate_final*years_period)
            print("Investment simple interest " + str(total_amnt_simple))
      elif interest_case == 'compound':
            total_amnt_compound= deposit_amnt * math.pow((1+interest_rate_final), years_period)
            print ("Investment compound interest " + str(round(total_amnt_compound,2)))
   elif calculator_case == 'bond':
      value_house=float(input("Enter the value of the house "))
      interest_rate_bond=int(input("Enter interest rate "))
      interest_rate_bond_monthly=round((interest_rate_bond/12),1)/100
      period_month_bond=int(input("Enter the period for repayment in months "))
      repayment_bond=(interest_rate_bond_monthly * value_house) \
      /(1- math.pow((1+interest_rate_bond_monthly),(-period_month_bond)))
      print ("Repayment monthly amounts to " + str(round(repayment_bond,2)))
      
   
         
   


    



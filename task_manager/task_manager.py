from datetime import date 
logged_in = False
username=input("Username:# ")
password=input("Password:# ")
user_vm=""
# Logging in module
with open('user.txt','r') as users:
    for row in users:
        if username and password in row:
            logged_in = True
            user_vm=username
            break
        
        if username and password not in row:
            print ("Your username or password is invalid. Please enter valid credentials")
            username=input("Username:# ")
            password=input("Password:# ")          

while logged_in:#Display menu options
    print("Print select one of the following options \n r- register \n a - add task \n va - view all tasks \n vm - view my tasks \n m - administor menu \n e - exit ")
    
    menu=input("Enter an option ")
    #user registration module
    if menu=="r": 
        if user_vm=="admin":      
            with open('user.txt','a+') as add_users:
                add=input("Do you want to add a user y/n ")
                while add == "y":
                        add_user=input("Please enter a Username:# ")
                        add_pass=input("Enter your Password:# ")
                        user_rec=add_user+", "+add_pass
                        add_users.write(user_rec)
                        add_users.write("\n")
                        add=input("Do you want to add another user y/n ")
            add_users.close()
        else:
            print("\n")
            print("Only admin is allowed to register users")
            print("\n")
    elif menu=="a":
    #Add a task module
        with open('tasks.txt','a+') as tasks:
            add_task=input("Do you want to add a task y/n ")
            while add_task == "y":
                username_task=input("Enter the username of the assigned ")
                title_task=input("Enter the title of the task ")
                descr_task=input("Enter the description of the task ")
                due_date_task=input("Enter the due date dd-mm-yy ")
                creation_date=date.today()
                complete="N"
                task_rec=username_task+", "+title_task+", "+descr_task+", "+due_date_task+", "+str(creation_date)+", "+complete
                tasks.write(task_rec)
                tasks.write('\n')
                add_task=input("Do you want to add another task y/n ")
        tasks.close()
    
    elif menu=="va":
    #View all tasks module
        with open('tasks.txt','r') as tasks:
            for row in tasks.readlines():
                print(row)
        tasks.close()
        print("\n")
    elif menu=="vm":
    #view your tasks module
        with open('tasks.txt','r') as tasks:
            for row in tasks.readlines():
                if user_vm in row:
                    print (row)
                    break
        tasks.close() 
        print("\n")
    elif menu=="m":
    #Administrator module
        if user_vm=="admin": 
            current_date=str(date.today())
            number_of_lines_tasks=0
            number_of_lines_users=0
            with open('tasks.txt','r') as tasks:
                for line in tasks:
                     line = line.strip("\n")
                     number_of_lines_tasks += 1
                print ( "NUMBER OF TASKS as of "+current_date +" is "+str(number_of_lines_tasks))
                print("\n")
            with open('user.txt','r') as read_users:
                for line in read_users:
                    line = line.strip("\n")
                    number_of_lines_users += 1
                print ( "NUMBER OF USERS as of "+current_date +" is "+str(number_of_lines_users))
                print("\n")
        else:
            print("\n")
            print("Only Admin user is allowed into this menu")
            print("\n")
    
    else:
        #exit
        logged_in=False
        
                
        #print(user)username_task=input("Enter the username of the assigned")
        #print(passwd)
        #if user == username and passwd == password:
         #   print(user)
          #  print(passwd)            
         
         
         #   logged_in = True
         #   print(logged_in)
            
        
           
            #logged_in = passwd == password
            
        
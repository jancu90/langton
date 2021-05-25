from datetime import date 
user_vm=""
logged_in = False


def login():
    username=input("Username:# ")
    password=input("Password:# ")
    # Logging in module
    with open('user.txt','r') as users:
        for row in users:
            if username and password in row:
                print ("Login successful!")
                global user_vm
                user_vm=username
                global logged_in
                logged_in = True
                return logged_in
            print ("Your username or password is invalid. Please enter valid credentials")
            username=input("Username:# ")
            password=input("Password:# ")               

user_db = True
def check_user(x):
    with open('user.txt','r+') as tasks:
        for row in tasks.readlines():
            row_list=row.split(',')
            if x == row_list[0]:
                print("User already created. Please use another name")
                global user_db
                user_db=False
    tasks.close()
    return user_db


def reg_user():
    with open('user.txt','a+') as add_users:
                    add=input("Do you want to add a user y/n ")
                    while add == "y":     
                        global user_db
                        user_db = True
                        add_user=input("Please enter a Username:# ")
                        log=check_user(add_user)
                        if log == False:
                            print(" Please enter 'y' to add a user")
                         #add=input("Do you want to add a user y/n")                                     
                        elif log == True:               
                            add_pass=input("Enter your Password:# ")
                            user_rec=add_user+", "+add_pass
                            add_users.write(user_rec)
                            add_users.write("\n")
                        
                        add=input("Do you want to add a user y/n ")
                             
    add_users.close()
    return
             
def key_generator():
    counter=0
    with open('tasks.txt') as f:
        for line in f:
            pass
            counter+=1
       # last_line = line
    f.close()
    return counter
    
    
def add_task():
    with open('tasks.txt','a+') as tasks:
                add_task=input("Do you want to add a task y/n ")
                id_key=key_generator()
                while add_task == "y":
                    id_key=id_key+1
                    username_task=input("Enter the username of the assigned ")
                    title_task=input("Enter the title of the task ")
                    descr_task=input("Enter the description of the task ")
                    due_date_task=input("Enter the due date dd-mm-yy ")
                    creation_date=date.today()
                    complete="N"
                    task_rec="000"+str(id_key)+", "+username_task+", "+title_task+", "+descr_task+", "+due_date_task+", "+str(creation_date)+", "+complete
                    tasks.write(task_rec)
                    tasks.write('\n')
                    add_task=input("Do you want to add another task y/n ")
    tasks.close()
    return

def view_all():
    with open('tasks.txt','r') as tasks:
                for row in tasks.readlines():
                    print(row)
    tasks.close()
    return
 

def view_mine():            
    with open('tasks.txt','r') as tasks:
        for row in tasks.readlines():
            if user_vm in row:
                print (row)
                
    
    
def admin_user():
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
                        return    
                        

log = login()
while log:#Display menu options
    print("Print select one of the following options : \n r- register \n a - add task \n va - view all tasks \n vm - view my tasks \n gr - generate reports \n ds - display statistics \n e - exit ")
    
    menu=input("Enter an option ")
    #Enter menu option
    if menu=="r":
        #user registration module
        if user_vm=="admin":
            reg_user()
        else:
            print("\n")
            print("Only admin is allowed to register users")
            print("\n") 
            
    elif menu=="a":        
    #Add a task module
        add_task()
    
    elif menu=="va":
    #View all tasks module
        view_all()
        print("\n")  
    elif menu=="vm":
    #view your tasks module
        view_mine()
        print("\n")
    elif menu=="m":
    #Administrator module
        if user_vm=="admin":
            admin_user()
            print("\n")
        else:
            print("\n")
            print("Only Admin user is allowed into this menu")
            print("\n")
    
    else:
        #exit
        log=False
        
                
       
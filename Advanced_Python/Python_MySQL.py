"""Python MySQL:
    MySQL is a widely used open-source relational database for managing structured data. Integrating it with Python enables efficient data 
    storage, retrieval and manipulation within applications. """

"""Why do we need MySQL in Python?
    1. Store Large Data: MySQL helps store and manage large amounts of data efficiently.
    2. Data Persistence: Data stays saved even after Python program ends.
    3. Easy Data Access: Python can easily fetch, insert, update or delete data from MySQL.
    4. Supports Multiple Users: MySQL allows many users to access and work with data at the same time.
    5. Works Well with Python Libraries: It integrates smoothly with Python tools like Pandas for data analysis."""

'Example: Connecting to MySQL Server:'
import mysql.connector # importing required library

dataBase = mysql.connector.connect(
    host = "localhost",         # Localhost for local connection
    user = "user",
    passwd = "password"
)

print (dataBase)
dataBase.close() # Disconnection from the server

print()

'Example: Creating a MySQL database with Python:'
import mysql.connector

dataBase = mysql.connector.connect(
    host = "localhost",         
    user = "user",
    passwd = "password"
)
# preparing a cursor object
cursorObject = dataBase.cursor()

# creating database 
cursorObject.execute("CREATE DATABASE gfg")

print()

###### --- MASSIVE SPACE FOR LONG SHOWCASE OF USAGES --- ######




'Example: Creating a MySQL table using Python:'
import mysql.connector

dataBase = mysql.connector.connect(
    host = "localhost",         
    user = "user",
    passwd = "password",
    database = "gfg"
)

# preparing a cursor object
cursorObject = dataBase.cursor()

# creating table
studentRecord = """CREATE TABLE STUDENT (
                   NAME  VARCHAR(20) NOT NULL,
                   BRANCH VARCHAR(50),
                   ROLL INT NOT NULL,
                   SECTION VARCHAR(5),
                   AGE INT
                   )"""
# table created
cursorObject.execute(studentRecord)

'Inserting Data into Tables:'
'- To insert data into the MySQL table, Insert into query is used.'

# Example 1. Inserting Single Row
sql = "INSERT INTO STUDENT (NAME, BRANCH, ROLL, SECTION, AGE)\
VALUES (%s, %s, %s, %s, %s)"
val = ("Ram", "CSE", "85", "B", "19")

cursorObject.execute(sql, val)
dataBase.commit()

# Example 2. Inserting Multiple Rows:
sql2 = "INSERT INTO STUDENT (NAME, BRANCH, ROLL, SECTION, AGE)\
VALUES (%s, %s, %s, %s, %s)"
val2 = [("Nikhil", "CSE", "98", "A", "18"),
       ("Nisha", "CSE", "99", "A", "18"),
       ("Rohan", "MAE", "43", "B", "20"),
       ("Amit", "ECE", "24", "A", "21"),
       ("Anil", "MAE", "45", "B", "20"), 
       ("Megha", "ECE", "55", "A", "22"), 
       ("Sita", "CSE", "95", "A", "19")]

cursorObject.executemany(sql2, val2)
dataBase.commit()

'Fetching Data:'
'We can use the select query on the MySQL tables in the following ways :'
'- In order to select particular attribute columns from a table, we write the attribute names.'
    # SELECT attr1, attr2 FROM table_name

query = "SELECT NAME, ROLL FROM STUDENT"
cursorObject.execute(query)

myresult = cursorObject.fetchall()

for x in myresult:
    print(x)

"""Where Clase:
    Where clause is used in MySQL database to filter the data as per the condition required. You can fetch, delete or update a particular set 
    of data in MySQL database by using where clause."""

query2 = "SELECT * FROM STUDENT where AGE >= 20" # where method here
cursorObject.execute(query2)

myresult = cursorObject.fetchall()
  
for x in myresult:
    print(x)


import sqlite3 as s

con = s.connect('store.db')
cur = con.cursor()

user = ("""
    CREATE TABLE USER (
        id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
        name TEXT,
        age INTEGER
    );
""")

car = ("""
    CREATE TABLE CAR (
        registration VARCHAR(7) PRIMARY KEY,
        model VARCHAR(40),
        owner TEXT
    );
""")

cur.execute(car)

con.commit()
con.close()

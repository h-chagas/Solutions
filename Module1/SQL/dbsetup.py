import sqlite3 as s

con = s.connector('my-test.db')

user = ("""
    CREATE TABLE USER (
        id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
        name TEXT,
        age INTEGER
    );
""")

with con:
    con.execute(user)
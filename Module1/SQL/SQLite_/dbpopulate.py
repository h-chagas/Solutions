import sqlite3 as s

con = s.connect('store.db')
cur = con.cursor()

"""sql = 'INSERT INTO USER (id, name, age) values(?, ?, ?)' """
sql = 'INSERT INTO CAR (registration, model, owner) values(?, ?, ?)'


dataUser = [
    (1, 'Alice', 21),
    (2, 'Bob', 22),
    (3, 'Chris', 23),
    (4, 'Daphne', 40),
    (5, 'Edith', 12),
    (6, 'Fiona', 22)
]

dataCar = [
    ('AS12RTG', 'Ford Ka', 1),
    ('RE23PLU', 'VW Golf',  3),
    ('VY13SDF', 'C4 Picasso',  1),
    ('BV19ALH', 'BMW X1',  4),
    ('PL18FMZ', 'Peugeot 3008',  5),
    ('UM20IUY','Fiat 500',  6)
]

cur.executemany(sql, dataCar)

con.commit()
con.close()

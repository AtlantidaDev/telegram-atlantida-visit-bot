
## How to build?

1. Create db
   - *run commands:*
   ```commandline
   sqlite3 atlantida-visit.db
   
   CREATE TABLE IF NOT EXISTS user(
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        name CHAR(70) NOT NULL,
        is_admin INTEGER NOT NULL
   );
   
   CREATE TABLE IF NOT EXISTS visit(
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        status INTEGER,
        date REAL,
        id_user INTEGER,
        FOREIGN KEY(id_user) REFERENCES user(id)
   );
   
   ```
   
2. Install [gradle](https://gradle.org/)
      
   - *run command:*
    ```commandline
       gradle build
    ```
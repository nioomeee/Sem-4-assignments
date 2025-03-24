-- Create a procedure to display the users record
CREATE TABLE USERS (
    USER_ID NUMBER PRIMARY KEY,
    USER_NAME VARCHAR2(100),
    USER_EMAIL VARCHAR2(100)
);

-- Inserting some sample data
INSERT INTO USERS (USER_ID, USER_NAME, USER_EMAIL) VALUES (1, 'Alice', 'alice@example.com');
INSERT INTO USERS (USER_ID, USER_NAME, USER_EMAIL) VALUES (2, 'Bob', 'bob@example.com');
INSERT INTO USERS (USER_ID, USER_NAME, USER_EMAIL) VALUES (3, 'Charlie', 'charlie@example.com');
COMMIT;

CREATE OR REPLACE PROCEDURE display_records 
IS
    CURSOR user_cursor IS
        SELECT USER_ID, USER_NAME, USER_EMAIL FROM USERS;
    user_record user_cursor%ROWTYPE;

BEGIN
    
    OPEN user_cursor;

    LOOP
        FETCH user_cursor INTO user_record;
        EXIT WHEN user_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('User id = ' || user_record.USER_ID || ' User name = ' || user_record.USER_NAME || ' User Email = ' || user_record.USER_EMAIL);
    END LOOP;

    CLOSE user_cursor;
END;
/

BEGIN 
    display_records;
END;
/

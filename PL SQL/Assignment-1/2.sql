-- Write a program to print the numbers from 1 to 100.
DECLARE
    I NUMBER := 1;

BEGIN
    FOR I IN 1..100 LOOP
        DBMS_OUTPUT.PUT_LINE(I || ' ');
    END LOOP;
END;
/
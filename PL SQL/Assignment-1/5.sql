-- Write a program for multiplication table
DECLARE
    i NUMBER := 1;
    n NUMBER := 5;
    ans NUMBER;

BEGIN

    for i in 1..10 loop
        ans := n * i;
        DBMS_OUTPUT.PUT_LINE(n || ' x ' || i || ' = ' || ans);
    end loop;

END;
/
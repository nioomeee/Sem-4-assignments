-- Write a program to print the odd numbers from 1 to 100
DECLARE
    i NUMBER := 1;

BEGIN

    for i in 1..100 loop
        if mod(i, 2) = 1 THEN
            dbms_output.put_line(i || ' ');
        end if;
    end loop;
END;
/
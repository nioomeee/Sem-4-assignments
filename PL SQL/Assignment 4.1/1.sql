-- Create a function to calculate reverse of a number. 
DECLARE
    num NUMBER := &num;
    rev_num NUMBER;

    FUNCTION reverse_number(n IN NUMBER) RETURN NUMBER IS
        rev NUMBER := 0;
        temp NUMBER := n;
    BEGIN
        WHILE temp > 0 LOOP
            rev := (rev * 10) + MOD(temp, 10);
            temp := TRUNC(temp / 10);
        END LOOP;
        RETURN rev;
    END;

BEGIN
    rev_num := reverse_number(num);
    DBMS_OUTPUT.PUT_LINE('The reverse number = ' || rev_num);
END;
/ 

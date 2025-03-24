-- Create user defined an Exception and raise it: Find maximum from 3 no.
CREATE OR REPLACE FUNCTION find_max(num1 NUMBER, num2 NUMBER, num3 NUMBER)
RETURN VARCHAR2
IS
    invalid_num EXCEPTION;
    max_num NUMBER;
BEGIN
    IF num1 <= 0 OR num2 <= 0 OR num3 <= 0 THEN
        RAISE invalid_num;
    END IF;

    max_num := num1;

    IF num2 > max_num THEN
        max_num := num2;
    END IF;

    IF num3 > max_num THEN
        max_num := num3;
    END IF;

    RETURN 'The maximum number = ' || max_num;

EXCEPTION

    WHEN invalid_num THEN
        RETURN 'The entered number should be greater than 0';
END;
/

DECLARE
    answer VARCHAR2(100);
    num1 NUMBER := &num1;
    num2 NUMBER := &num2;
    num3 NUMBER := &num3;
    

BEGIN
    answer := find_max(num1, num2, num3);
    DBMS_OUTPUT.PUT_LINE(answer);
END;
/
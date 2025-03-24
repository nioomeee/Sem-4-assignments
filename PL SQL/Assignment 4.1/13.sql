-- Create a function to find a factorial of a number.
CREATE OR REPLACE FUNCTION factorial(n IN NUMBER)
RETURN NUMBER
IS
    answer NUMBER := 1;
BEGIN
    IF n <= 1 THEN
        RETURN 1;
    ELSE
        FOR i IN 1..n LOOP
            answer := answer * i;
        END LOOP;
        RETURN answer;
    END IF;
END;
/

DECLARE
    Answer NUMBER;
BEGIN
    Answer := factorial(5);
    DBMS_OUTPUT.PUT_LINE('The factorial of 5 = ' || answer);
END;
/

-- Create an Exception, if one numbe ris divide by zero. 
CREATE OR REPLACE FUNCTION divide_numbers (num1 NUMBER, num2 NUMBER)
RETURN VARCHAR2
IS 
    divide_by_zero EXCEPTION;
    answer NUMBER;
BEGIN

    IF num2 = 0 THEN
        RAISE divide_by_zero;
    ELSE 
        answer := num1 / num2;

        RETURN 'The result of division = ' || answer;
    END IF;

EXCEPTION

    --inbuilt exception
    -- WHEN ZERO_DIVIDE THEN
    --     Return 'ERROR: Division by 0 is not allowed';

    --custom exception
    WHEN divide_by_zero THEN 
        RETURN 'ERROR: Division by 0 not allowed';
END;
/

DECLARE
    answer VARCHAR2(100);
BEGIN
    answer := divide_numbers(10, 2);
    DBMS_OUTPUT.PUT_LINE(answer);

    answer := divide_numbers(5, 0);
    DBMS_OUTPUT.PUT_LINE(answer);
END;
/
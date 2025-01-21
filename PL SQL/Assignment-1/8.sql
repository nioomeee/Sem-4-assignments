-- fibonacci series

DECLARE
    n NUMBER := &n;
    a NUMBER := 0;
    b NUMBER := 1;
    nextNum NUMBER;

BEGIN

    DBMS_OUTPUT.PUT_LINE('Fibonacci series till ' || n || ' number');

    IF n >= 1 THEN
        DBMS_OUTPUT.PUT_LINE(a);
    END IF;

    IF n >= 2 THEN
        DBMS_OUTPUT.PUT_LINE(b);
    END IF;

    -- fibonacci series up to n numbers

    FOR i IN 3..n LOOP
        nextNum := a + b;
        DBMS_OUTPUT.PUT_LINE(nextNum);
        a := b;
        b := nextNum;
    END LOOP;
END;
/
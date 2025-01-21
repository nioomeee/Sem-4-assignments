-- Write a program to find the sum of numbers from 1 to 100
DECLARE
    sumAll NUMBER := 0;
    sumEven NUMBER := 0;
    sumOdd NUMBER := 0;

BEGIN
    FOR i IN 1..100 LOOP
        sumAll := sumAll + i;
    end LOOP;

    FOR i IN 1..100 LOOP
        IF MOD(i, 2) = 0 THEN
            sumEven := sumEven + i;
        END IF;
    end LOOP;

    FOR i IN 1..100 LOOP
        IF MOD(i, 2) = 1 THEN
            sumOdd := sumOdd + i;
        END IF;
    end LOOP;


    DBMS_OUTPUT.PUT_LINE('the sum of all 100 numbers = ' || sumAll);
    DBMS_OUTPUT.PUT_LINE('the sum of even numbers from 1 to 100 numbers = ' || sumEven);
    DBMS_OUTPUT.PUT_LINE('the sum of odd numbers from 1 to 100 numbers = ' || sumOdd);
END;
/
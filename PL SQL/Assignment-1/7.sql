-- Write a program to check if a given number is prime and also check if it's an it's arsmstrong number, 
-- palindrome and reverse.
DECLARE
    n NUMBER(3) := &n;
    temp1 NUMBER := n;
    reverse1 NUMBER := 0;
    reminder1 NUMBER := 0;
    armstrong NUMBER(3) := 0;
    counter NUMBER := 0;

BEGIN

    WHILE temp1 != 0 LOOP
        reminder1 := mod(temp1, 10);
        reverse1 := (reverse1 * 10) + reminder1;
        armstrong := armstrong + (reminder1 * reminder1 * reminder1);
        temp1 := TRUNC(temp1 / 10);
    END LOOP; 

    if(armstrong = n) THEN
        DBMS_OUTPUT.PUT_LINE('The entered number is armstrong');
    else 
        DBMS_OUTPUT.PUT_LINE('The entered number is not armstrong');
    end if;

    DBMS_OUTPUT.PUT_LINE('The revserse of the entered number = ' || reverse1);

    IF(reverse1 = n) THEN
        DBMS_OUTPUT.PUT_LINE('The entered number is a palindrome');
    ELSE
        DBMS_OUTPUT.PUT_LINE('The entered number is not a palindrome');
    END IF;

    FOR i IN 2..SQRT(n) LOOP
        IF MOD(n, i) = 0 THEN
            counter := counter+1;
        END IF;
    END LOOP;

    IF (counter != 0) THEN
        DBMS_OUTPUT.PUT_LINE('The entered number is prime');
    ELSE
        DBMS_OUTPUT.PUT_LINE('The entered number is not prime');
    END IF;

END;
/
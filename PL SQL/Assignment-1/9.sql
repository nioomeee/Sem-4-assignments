-- binary format

DECLARE
    n NUMBER := &n;
    num NUMBER := n;
    reminder NUMBER := 0;
    bin VARCHAR(100);

BEGIN

    WHILE num>0 LOOP
        reminder := MOD(num, 2);
        bin := reminder || bin;
        num := TRUNC(num / 2);
    END LOOP; 

    DBMS_OUTPUT.PUT_LINE('The binary format of entered number ' || bin);
END;
/
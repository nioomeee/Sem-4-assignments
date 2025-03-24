-- Create a procedure to find the square and cube of a number. Only 1 input should be taken
-- as IN and OUT.

CREATE OR REPLACE PROCEDURE powers(num IN NUMBER)
IS
    sq NUMBER;
    cub NUMBER;

BEGIN

    sq := (num * num);
    cub := (num * num * num);

    DBMS_OUTPUT.PUT_LINE('The square of ' || num || ' = ' || sq);
    DBMS_OUTPUT.PUT_LINE('The cube of ' || num || ' = ' || cub);
    
END;
/

DECLARE
    
    num NUMBER := &num;

BEGIN

    powers(num);

END;
/

-- Create a procedure to Just print a message on prompt.
CREATE OR REPLACE PROCEDURE print_message IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Message printed from the procedure');
END;
/

BEGIN
    print_message;
END;
/
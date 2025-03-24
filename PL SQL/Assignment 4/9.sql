-- Create a procedure to perform both operation IN aand OUT as a parameter.
CREATE OR REPLACE PROCEDURE calculate_square (
    num_in IN NUMBER, --IN parameter
    square_out OUT NUMBER --OUT parameter
)
IS
BEGIN
    square_out := num_in * num_in;
    DBMS_OUTPUT.PUT_LINE('Square of ' || num_in || ' = ' || square_out);
END;
/

DECLARE 
    answer NUMBER;
BEGIN
    calculate_square(5, answer); --calling the procedure
    DBMS_OUTPUT.PUT_LINE('The result = ' || answer);
END;
/
-- Create an Exception, if many rows are fetching from the table.
INSERT INTO CUSTOMERS VALUES (107, 'Rakesh', 9876543);

CREATE OR REPLACE FUNCTION find_customer
RETURN VARCHAR2
IS
    many_rows EXCEPTION; --exception declared if many rows 
    customer_name VARCHAR2(100);
    row_count NUMBER;
BEGIN
    SELECT COUNT(*) INTO row_count
    FROM CUSTOMERS;

    IF row_count > 10 THEN
        RAISE many_rows;
    END IF;

    RETURN 'Limited rows found';

EXCEPTION
    WHEN many_rows THEN
        RETURN 'Many rows found';
END;
/

DECLARE
    answer VARCHAR2(100);
BEGIN
    answer := find_customer;
    DBMS_OUTPUT.PUT_LINE(answer);
END;
/

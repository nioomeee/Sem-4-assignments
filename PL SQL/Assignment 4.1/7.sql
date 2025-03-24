-- Create the table and insert sample records
CREATE TABLE CUSTOMERS (
    Cust_id NUMBER PRIMARY KEY, 
    Cust_name VARCHAR2(20), 
    Contact NUMBER(10)
);

INSERT INTO CUSTOMERS VALUES (101, 'Malika', 789454);
INSERT INTO CUSTOMERS VALUES (103, 'Shreya', 123456);
INSERT INTO CUSTOMERS VALUES (102, 'Nancy', 456789);
INSERT INTO CUSTOMERS VALUES (104, 'Paprti', 852963);
INSERT INTO CUSTOMERS VALUES (105, 'Helly', 147258);
INSERT INTO CUSTOMERS VALUES (106, 'Yesha', 3265987);

COMMIT;

-- Create the function to find customer
CREATE OR REPLACE FUNCTION find_customer
RETURN VARCHAR2
IS
    no_customer_found EXCEPTION;  -- Declare custom exception
    customer_name VARCHAR2(100);
BEGIN
    -- Attempt to fetch customer "Rakesh"
    BEGIN
        SELECT Cust_name INTO customer_name 
        FROM CUSTOMERS 
        WHERE Cust_name = 'Rakesh';
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            -- Raise custom exception if no record is found
            RAISE no_customer_found;
    END;

    RETURN 'Customer Rakesh found';

EXCEPTION
    -- Handle custom exception
    WHEN no_customer_found THEN
        RETURN 'No record found for customer Rakesh';
END;
/

-- Call the function and display the result
DECLARE 
    result VARCHAR2(200);
BEGIN
    result := find_customer;
    DBMS_OUTPUT.PUT_LINE(result);
END;
/

-- Create a function to find total salary of all employee.
CREATE TABLE EMPLOYEES6(Emp_id VARCHAR2(5), Emp_name VARCHAR2(20), Department VARCHAR2(20), Emp_sal NUMBER(10, 2));

INSERT INTO EMPLOYEES6 VALUES ('E101', 'Aaryan', 'Finance', 20000.50);
INSERT INTO EMPLOYEES6 VALUES ('E102', 'Dhruv', 'IT', 30000);
INSERT INTO EMPLOYEES6 VALUES ('E103', 'Shreya', 'Accounting', 25000);
INSERT INTO EMPLOYEES6 VALUES ('E104', 'Riya', 'Socials', 15000.50);
INSERT INTO EMPLOYEES6 VALUES ('E105', 'Simran', 'HR', 75000.50);

COMMIT;

CREATE OR REPLACE FUNCTION total_salary
RETURN NUMBER
IS
    total_sal NUMBER;
BEGIN
    SELECT SUM(Emp_sal) INTO total_sal FROM EMPLOYEES6;
    RETURN total_sal;
END;
/

DECLARE
    tot_sal NUMBER;
BEGIN
    tot_sal := total_salary;
    DBMS_OUTPUT.PUT_LINE('The total salary of the employees = ' || tot_sal);
END;
/
-- Create a function to find maximum salary of an employee.
CREATE TABLE EMPLOYEES3(Emp_id VARCHAR2(5), Emp_name VARCHAR2(20), Department VARCHAR2(20), Emp_sal NUMBER(10, 2));

INSERT INTO EMPLOYEES3 VALUES ('E101', 'Aaryan', 'Finance', 20000.50);
INSERT INTO EMPLOYEES3 VALUES ('E102', 'Dhruv', 'IT', 30000);
INSERT INTO EMPLOYEES3 VALUES ('E103', 'Shreya', 'Accounting', 25000);
INSERT INTO EMPLOYEES3 VALUES ('E104', 'Riya', 'Socials', 15000.50);
INSERT INTO EMPLOYEES3 VALUES ('E105', 'Simran', 'HR', 75000.50);

COMMIT;

CREATE OR REPLACE FUNCTION max_salary
RETURN NUMBER
IS
    max_sal NUMBER;
BEGIN
    SELECT MAX(Emp_sal) INTO max_sal FROM EMPLOYEES3;
    RETURN max_sal;
END;
/

DECLARE
    highest  NUMBER;
BEGIN
    highest := max_salary;
    DBMS_OUTPUT.PUT_LINE('The maximum salary from the Employees table = ' || highest);
END;
/

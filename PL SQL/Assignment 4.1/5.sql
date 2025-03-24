-- Create a function to find average salary of an employee.

CREATE TABLE EMPLOYEES5(Emp_id VARCHAR2(5), Emp_name VARCHAR2(20), Department VARCHAR2(20), Emp_sal NUMBER(10, 2));

INSERT INTO EMPLOYEES5 VALUES ('E101', 'Aaryan', 'Finance', 20000.50);
INSERT INTO EMPLOYEES5 VALUES ('E102', 'Dhruv', 'IT', 30000);
INSERT INTO EMPLOYEES5 VALUES ('E103', 'Shreya', 'Accounting', 25000);
INSERT INTO EMPLOYEES5 VALUES ('E104', 'Riya', 'Socials', 15000.50);
INSERT INTO EMPLOYEES5 VALUES ('E105', 'Simran', 'HR', 75000.50);

COMMIT;

CREATE OR REPLACE FUNCTION avg_salary
RETURN NUMBER
IS
    avg_sal NUMBER;
BEGIN
    SELECT AVG(Emp_sal) INTO avg_sal FROM EMPLOYEES5;
    RETURN avg_sal;
END;
/

DECLARE
    average_salary NUMBER;
BEGIN
    average_salary := avg_salary;
    DBMS_OUTPUT.PUT_LINE('The average salary of employees = ' || average_salary);
END;
/

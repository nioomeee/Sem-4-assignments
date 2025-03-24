-- Create user defined an Exception and raise it: Calculate 5% increment in salary of an
-- employee, if salary is greater than 25000, raise an exception “Salary is Out of the Limit”.

SELECT * FROM EMPLOYEES5;
CREATE OR REPLACE FUNCTION raise_salary (employee_id VARCHAR2)
RETURN VARCHAR2
IS
    salary NUMBER;
    out_limits EXCEPTION;
BEGIN 
    SELECT (Emp_sal) INTO salary 
    FROM EMPLOYEES5 
    WHERE Emp_id = employee_id;

    IF salary > 25000 THEN
        Raise out_limits;
    END IF;

    UPDATE EMPLOYEES5 SET Emp_sal = (Emp_sal * 0.05) + Emp_sal WHERE Emp_id = employee_id;

    Return 'Successfully incremented the salary by 5% for employee with id ' || employee_id;

EXCEPTION
    WHEN out_limits THEN
        RETURN 'ERROR : The employee salary is above 25000';
END;
/

DECLARE 
    answer VARCHAR2(100);
BEGIN
    answer := raise_salary('E104');
    DBMS_OUTPUT.PUT_LINE(answer);

    answer := raise_salary('E105');
    DBMS_OUTPUT.PUT_LINE(answer);
END;
/






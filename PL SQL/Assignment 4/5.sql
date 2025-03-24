-- Create a procedure to update the salary of an employee whose name is ‘Dinesh’. 
CREATE TABLE EMPLOYEES45(Emp_id VARCHAR2(5), Emp_name VARCHAR2(20), Department VARCHAR2(20), Emp_sal NUMBER(10, 2));

INSERT INTO EMPLOYEES45 VALUES ('E101', 'Aaryan', 'Finance', 20000.50);
INSERT INTO EMPLOYEES45 VALUES ('E102', 'Dinesh', 'IT', 30000);
INSERT INTO EMPLOYEES45 VALUES ('E103', 'Shreya', 'Accounting', 25000);
INSERT INTO EMPLOYEES45 VALUES ('E104', 'Riya', 'Socials', 15000.50);
INSERT INTO EMPLOYEES45 VALUES ('E105', 'Simran', 'HR', 75000.50);

CREATE OR REPLACE PROCEDURE update_employees45 IS
BEGIN
    UPDATE EMPLOYEES45 SET Emp_sal = 50000 WHERE Emp_name = 'Dinesh';
    DBMS_OUTPUT.PUT_LINE('The salary of Dinesh is now 50000');
END;
/

BEGIN
    update_employees45;
END;
/
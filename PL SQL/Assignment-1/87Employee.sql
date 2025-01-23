-- WAP to accept the mgrno and display the empno,ename,sal,dname and grade of all emps working under
-- that mgr
drop table employee; 

CREATE TABLE employee(
    empno NUMBER PRIMARY KEY,
    ename VARCHAR2(20), --importantly use varchar2 only
    sal NUMBER,
    managerNo NUMBER,
    dname VARCHAR2(20),
    grade VARCHAR2(20)
)

INSERT INTO employee (empno, ename, sal, managerNo, dname, grade) VALUES (1001, 'Joey', 20000, 105, 'Entertainment', 'A');
INSERT INTO employee (empno, ename, sal, managerNo, dname, grade) VALUES (1002, 'Monica', 25000, 101, 'Food', 'A');
INSERT INTO employee (empno, ename, sal, managerNo, dname, grade) VALUES (1003, 'Rachael', 20000, 103, 'Fashion', 'B');
INSERT INTO employee (empno, ename, sal, managerNo, dname, grade) VALUES (1004, 'Chandler', 20000, 105, 'Entertainment', 'A');
INSERT INTO employee (empno, ename, sal, managerNo, dname, grade) VALUES (1005, 'Phoebe', 25000, 101, 'Sales', 'C');
INSERT INTO employee (empno, ename, sal, managerNo, dname, grade) VALUES (1006, 'Ross', 25000, 103, 'Fashion', 'A');

SELECT * FROM employee;

SET SERVEROUTPUT on;

DECLARE 
    mgrno NUMBER;

BEGIN

    mgrno := &manager_number;

    FOR emp_rec IN (
        SELECT empno, ename, sal, dname, grade
        FROM employee
        WHERE managerNo = mgrno
    )LOOP
        DBMS_OUTPUT.PUT_LINE('Employee name = ' || emp_rec.ename || 'Employee id = ' || emp_rec.empno || 'Employee salary = ' || emp_rec.sal || 'Employee Department = ' || emp_rec.dname || 'Employee grade = ' || emp_rec.grade);
    END LOOP;
    
END;
/
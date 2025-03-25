-- Use a cursor to count the number of employees in each department and display results.
CREATE OR REPLACE PROCEDURE count_emps_by_dept
IS
    CURSOR dept_cursor IS
        SELECT Dept_id, COUNT(*) AS emp_count
        FROM EMPLOYEES
        GROUP BY Dept_id;
    
    v_dept_id EMPLOYEES45.department
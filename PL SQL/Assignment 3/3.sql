-- 3(A) Create a table Product with column name (Prod_id, Prod_name, Prod_amt, Prod_comp,
-- Prod_mfgdate, Prod_expdate). Insert at least 5 records.
-- 3(B) Create a trigger on product table for before insert and back up the old data in new table
-- Product_new.

Insert into Product111 Values ('P106', 'Handwash', 56.25, 'Dettol', TO_DATE('2023-03-06', 'YYYY-MM-DD'), TO_DATE('2024-05-01', 'YYYY-MM-DD'));

Create OR REPLACE TRIGGER Product_backup_2
BEFORE INSERT ON Product111
FOR EACH ROW 
BEGIN

    INSERT INTO Product_new (Prod_id, Prod_name, Prod_amt, Prod_comp, Prod_mfgdate, Prod_expdate) 
    VALUES (:NEW.Prod_id, :NEW.Prod_name, :NEW.Prod_amt, :NEW.Prod_comp, :NEW.Prod_mfgdate, :NEW.Prod_expdate);

END;
/

Select * from Product111;

INSERT INTO Product111 VALUES ('P106', 'Handwash', 56.25, 'Dettol', TO_DATE('2023-03-06', 'YYYY-MM-DD'), TO_DATE('2024-05-01', 'YYYY-MM-DD'));

Select * from Product111;

Select * from Product_new;

SELECT table_name FROM user_tables;
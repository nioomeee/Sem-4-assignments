-- 2(A) Create a table Product with column name (Prod_id, Prod_name, Prod_amt, Prod_comp,
-- Prod_mfgdate, Prod_expdate). Insert at least 5 records.
-- 2(B) Create a trigger on product table for before delete and back up the new data in new table
-- Product_new. Condition for deletion: Where Product Id=’P103’.
CREATE OR REPLACE TRIGGER product_backup_1
BEFORE DELETE ON PRODUCT111
FOR EACH ROW 
BEGIN

    INSERT INTO Product_new (Prod_id, Prod_name, Prod_amt, Prod_comp, Prod_mfgdate, Prod_expdate) 
    VALUES (:OLD.Prod_id, :OLD.Prod_name, :OLD.Prod_amt, :OLD.Prod_comp, :OLD.Prod_mfgdate, :OLD.Prod_expdate);
END;
/

DELETE from PRODUCT111 where Prod_id = 'P103';

Select * from Product111;

Select * from Product_new;

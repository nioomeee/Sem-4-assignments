-- 5(A) Create a table Product with column name (Prod_id, Prod_name, Prod_amt, Prod_comp, 
-- Prod_mfgdate, Prod_expdate). Insert at least 5 records.
-- 5(B) Create a trigger on product table for after update and back up the new data in new table
-- Product_new. Condition for updating: Where Product Id=’P100’ and change the product
-- company name

CREATE TABLE PRODUCT5 (Prod_id VARCHAR2(5) PRIMARY KEY, Prod_name VARCHAR2(20), Prod_amt NUMBER(5, 2), Prod_comp VARCHAR2(20), Prod_mfgdate DATE, Prod_expdate DATE);
INSERT INTO PRODUCT5 VALUES('P098', 'Soap', 25.25, 'CompanyA', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT5 VALUES('P099', 'Shampoo', 152.25, 'CompanyB', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT5 VALUES('P100', 'Serum', 120, 'CompanyC', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT5 VALUES('P101', 'Lotion', 150.00, 'CompanyD', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT5 VALUES('P102', 'Bag', 520.30, 'CompanyE', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));

SELECT * FROM PRODUCT5;

CREATE TABLE PRODUCT_NEW5 (Prod_id VARCHAR2(5) PRIMARY KEY, Prod_name VARCHAR2(20), Prod_amt NUMBER(5, 2), Prod_comp VARCHAR2(20), Prod_mfgdate DATE, Prod_expdate DATE);

CREATE OR REPLACE TRIGGER product_backup5
AFTER UPDATE ON PRODUCT5
FOR EACH ROW
BEGIN

    INSERT INTO PRODUCT_NEW5 (Prod_id, Prod_name, Prod_amt, Prod_comp, Prod_mfgdate, Prod_expdate)
    VALUES (:NEW.Prod_id, :NEW.Prod_name, :NEW.Prod_amt, :NEW.Prod_comp, :NEW.Prod_mfgdate, :NEW.Prod_expdate);

END;
/

UPDATE PRODUCT5 SET Prod_comp = 'Cinthol' WHERE Prod_id = 'P100';

SELECT * FROM PRODUCT5;

SELECT * FROM PRODUCT_NEW5;
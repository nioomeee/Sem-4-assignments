-- 6(A) Create a table Product with column name (Prod_id, Prod_name, Prod_amt, Prod_comp,
-- Prod_mfgdate, Prod_expdate). Insert at least 5 records.
-- 6(B) Create a trigger on product table for before update and back up the old data in new table
-- Product_new. Condition for deletion: Where Product Id=’P105’ and change the product
-- expdate.

CREATE TABLE PRODUCT6 (Prod_id VARCHAR2(5), Prod_name VARCHAR2(20), Prod_amt NUMBER(5, 2), Prod_comp VARCHAR2(20), Prod_mfgdate DATE, Prod_expdate DATE);
INSERT INTO PRODUCT6 VALUES('P101', 'Soap', 25.25, 'CompanyA', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT6 VALUES('P102', 'Shampoo', 152.25, 'CompanyB', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT6 VALUES('P103', 'Serum', 120, 'CompanyC', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT6 VALUES('P104', 'Lotion', 150.00, 'CompanyD', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));
INSERT INTO PRODUCT6 VALUES('P105', 'Bag', 520.30, 'CompanyE', TO_DATE('2024-05-09', 'YYYY-MM-DD'), TO_DATE('2026-12-05', 'YYYY-MM-DD'));

SELECT * FROM PRODUCT6;
CREATE TABLE PRODUCT_NEW6 (Prod_id VARCHAR2(5), Prod_name VARCHAR2(20), Prod_amt NUMBER(5, 2), Prod_comp VARCHAR2(20), Prod_mfgdate DATE, Prod_expdate DATE);

CREATE OR REPLACE TRIGGER product_backup6
BEFORE UPDATE ON PRODUCT6
FOR EACH ROW
BEGIN

    INSERT INTO PRODUCT_NEW6 (Prod_id, Prod_name, Prod_amt, Prod_comp, Prod_mfgdate, Prod_expdate)
    VALUES (:OLD.Prod_id, :OLD.Prod_name, :OLD.Prod_amt, :OLD.Prod_comp, :OLD.Prod_mfgdate, :OLD.Prod_expdate);

END;
/

UPDATE PRODUCT6 SET Prod_expdate = TO_DATE('2001-08-18', 'YYYY-MM-DD') WHERE Prod_id = 'P105';

SELECT * FROM PRODUCT6;

SELECT * FROM PRODUCT_NEW6;


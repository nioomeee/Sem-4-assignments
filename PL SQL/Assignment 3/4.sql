-- 4(A) Create a table Product with column name (Prod_id, Prod_name, Prod_amt, Prod_comp,
-- Prod_mfgdate, Prod_expdate). Insert at least 5 records.
-- 4(B) Create a trigger on product table for after insert and back up the new data in new table
-- Product_new. 

CREATE TABLE Product4 (Prod_id VARCHAR2(5) PRIMARY KEY, Prod_name VARCHAR2(20), Prod_amt NUMBER(5, 2), Prod_comp VARCHAR2(20), Prod_mfgdate DATE, Prod_expdate DATE);

INSERT INTO Product4 VALUES ('P401', 'Shampoo', 185.00, 'Dove', TO_DATE('2024-05-06', 'YYYY-MM-DD'), TO_DATE('2023-10-16', 'YYYY-MM-DD'));
INSERT INTO Product4 VALUES ('P402', 'Conditioner', 153.25, 'Loreal', TO_DATE('2024-05-06', 'YYYY-MM-DD'), TO_DATE('2023-10-16', 'YYYY-MM-DD'));
INSERT INTO Product4 VALUES ('P403', 'Hair gel', 240.60, 'Nivea', TO_DATE('2024-05-06', 'YYYY-MM-DD'), TO_DATE('2023-10-16', 'YYYY-MM-DD'));
INSERT INTO Product4 VALUES ('P404', 'Curling cream', 120.00, 'Tresseme', TO_DATE('2024-05-06', 'YYYY-MM-DD'), TO_DATE('2023-10-16', 'YYYY-MM-DD'));
INSERT INTO Product4 VALUES ('P405', 'Serum', 210.00, 'Streax', TO_DATE('2024-05-06', 'YYYY-MM-DD'), TO_DATE('2023-10-16', 'YYYY-MM-DD'));

SELECT * FROM Product4;

CREATE TABLE PRODUCT_NEW4 (Prod_id VARCHAR2(5) PRIMARY KEY, Prod_name VARCHAR2(20), Prod_amt NUMBER(5, 2), Prod_comp VARCHAR2(20), Prod_mfgdate DATE, Prod_expdate DATE);

CREATE OR REPLACE TRIGGER product_backup4
AFTER INSERT ON Product4
FOR EACH ROW
BEGIN

    INSERT INTO Product_new4 (Prod_id, Prod_name, Prod_amt, Prod_comp, Prod_mfgdate, Prod_expdate) 
    VALUES (:NEW.Prod_id, :NEW.Prod_name, :NEW.Prod_amt, :NEW.Prod_comp, :NEW.Prod_mfgdate, :NEW.Prod_expdate);

END;
/

SELECT * FROM Product4;

INSERT INTO Product4 VALUES ('P406', 'Lotion', 130.50, 'Yardley', TO_DATE('2024-05-06', 'YYYY-MM-DD'), TO_DATE('2023-10-16', 'YYYY-MM-DD'));

SELECT * FROM Product4;

SELECT * from Product_new4;

-- Step 1: Create the Product111 table
CREATE TABLE Product111 (
    Prod_id VARCHAR2(10) PRIMARY KEY,
    Prod_name VARCHAR2(20),
    Prod_amt NUMBER(5, 2),
    Prod_comp VARCHAR2(20),
    Prod_mfgdate DATE,
    Prod_expdate DATE
);

-- Step 2: Insert sample data into Product111
INSERT INTO Product111 VALUES ('P101', 'Shampoo', 100, 'CompanyA', TO_DATE('2024-04-26', 'YYYY-MM-DD'), TO_DATE('2026-11-12', 'YYYY-MM-DD'));
INSERT INTO Product111 VALUES ('P102', 'Soap', 50, 'CompanyB', TO_DATE('2023-01-12', 'YYYY-MM-DD'), TO_DATE('2026-12-06', 'YYYY-MM-DD'));
INSERT INTO Product111 VALUES ('P103', 'Toothpaste', 70, 'CompanyC', TO_DATE('2024-10-21', 'YYYY-MM-DD'), TO_DATE('2026-01-05', 'YYYY-MM-DD'));
INSERT INTO Product111 VALUES ('P104', 'Lotion', 120, 'CompanyD', TO_DATE('2024-05-15', 'YYYY-MM-DD'), TO_DATE('2026-07-09', 'YYYY-MM-DD'));
INSERT INTO Product111 VALUES ('P105', 'Soap', 65, 'CompanyE', TO_DATE('2024-08-30', 'YYYY-MM-DD'), TO_DATE('2026-10-01', 'YYYY-MM-DD'));

-- Verify the data in Product111
SELECT * FROM Product111;

-- Step 3: Create the backup table Product_new
CREATE TABLE Product_new (
    Prod_id VARCHAR2(10),
    Prod_name VARCHAR2(20),
    Prod_amt NUMBER(5, 2),
    Prod_comp VARCHAR2(20),
    Prod_mfgdate DATE,
    Prod_expdate DATE
);

-- Step 4: Create the AFTER DELETE trigger
CREATE OR REPLACE TRIGGER product_backup
AFTER DELETE ON Product111
FOR EACH ROW
BEGIN
    -- Backup the deleted row into Product_new
    INSERT INTO Product_new (Prod_id, Prod_name, Prod_amt, Prod_comp, Prod_mfgdate, Prod_expdate)
    VALUES (:OLD.Prod_id, :OLD.Prod_name, :OLD.Prod_amt, :OLD.Prod_comp, :OLD.Prod_mfgdate, :OLD.Prod_expdate);
END;
/

-- Step 5: Test the trigger by deleting rows where Prod_name is 'Soap'
DELETE FROM Product111 WHERE Prod_name = 'Soap';

-- Step 6: Verify the remaining rows in Product111
SELECT * FROM Product111;

-- Step 7: Verify the deleted rows are backed up in Product_new
SELECT * FROM Product_new;
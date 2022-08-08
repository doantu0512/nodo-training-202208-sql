--bai7
--1.Tạo bảng PROJECT với các column được chỉ ra dưới đây, PROJID là prImary key, và
-- P_END_DATE > P_START_DATE.
CREATE TABLE PROJECT_KANZY(
PROJID NUMBER(4) not null CONSTRAINT  PK_PROJECT_KANZY PRIMARY KEY,
P_DESC VARCHAR(20),
P_END_DATE date ,
P_START_DATE date ,
BUDGET_AMOUNT NUMBER(7,2),
MAX_NO_STAFF NUMBER (2),
check (P_END_DATE > P_START_DATE)
);
--2Tạo bảng ASSIGNMENTS với các column được chỉ ra dưới đây, đồng thời cột
-- PROJID là foreign key tới bảng PROJECT, cột EMPNO là foreign key tới bảng EMP
create table ASSIGNMENTS_KANZY(
PROJID NUMBER(4) not null CONSTRAINT  FK_ASSIGNMENTS_KANZY  REFERENCES SCOTT.PROJECT_KANZY(PROJID) ,
EMPNO number (4 )not null,
A_START_DATE date ,
A_END_DATE date ,
BILL_RATE NUMBER(4,2),
ASSIGN_TYPE varchar2 (2)
);
--3Thêm column COMMENTS kiểu LONG vào bảng PROJECTS. Thêm column HOURS kiểu
-- NUMBER vào bảng ASSIGNMENTS.
ALTER TABLE PROJECT_KANZY
    ADD (
        COMMENTS  Long
        )
ALTER TABLE ASSIGNMENTS_KANZY
    ADD (
        HOURS  NUMBER
        )
--4Sử dụng view USER_OBJECTS hiển thị tất cả các đối tượng user sở hữu.

--5Thêm ràng buộc duy nhất (UNIQUE) cho 2 column PROJECT_ID và EMPNO của bảng
-- ASSIGNMENTS.
ALTER TABLE ASSIGNMENTS_KANZY
    MODIFY(
        CONSTRAINT UNQ_ASSIGNMENTS_KANZY UNIQUE(PROJID, EMPNO)
        )
--6. Xem các thông tin về các ràng buộc trong USER_CONSTRAINTS.
select * from USER_CONSTRAINTS
--7Xem trong USER hiện tại có tất cả bao nhiêu bảng
SELECT COUNT(TABLE_NAME) COUNT_TABLE FROM DICTIONARY;





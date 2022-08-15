-- 2.1.2
SELECT * FROM EMP;
--2.1.3
SELECT ENAME, SAL *12, COMM FROM EMP;
SELECT ENAME, (SAL+250)*12 FROM EMP;
SELECT EMPNO || ENAME EMPLOYEE FROM EMP;
-- SELECT empno || ename || ‘ WORK IN DEPARTMENT ’
-- || deptno ‘Employee Detail’
-- FROM emp;
--BAITAP 2.3
--1. Chọn toàn bộ thông tin trong bảng SALGRADE
SELECT *FROM  SALGRADE;
--2. Chọn toàn bộ thông tin trong bảng EMP
SELECT *FROM EMP;
--3. Hiển thị mọi loại nghề nghiệp
SELECT *FROM JOB;
--4. Hiển thị tên nhân viên và thu nhập trong một năm (REMUNERATION)
SELECT ENAME , SAL *12  REMUNERATION FROM EMP;
--5. Hiển thị theo nội dung dưới đây Who,What, when
select ENAME || ' HAS HELP THE POSITION OF PRESIDENT IN DEPT ' || NVL(DEPTNO,0) || ' SINCE ' || TO_CHAR(HIREDATE,'dd-MM-yyyy')
from EMP;
--6. Hiển thị cấu trúc bảng emp;
DESCRIBE SCOTT.EMP;

--7
COLUMN SAl JUSTIFY LEFT FORMAT $ 99,990.00
COLUMN hiredate FORMAT A9 NULL 'Not hired


--BAITAP 3
--1. Chọn nhân viên trong bảng EMP có mức lương từ 1000 đến 2000 (chọn các trường
-- ENAME, DEPTNO, SAL).
SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL BETWEEN 1000 AND 2000 ;
--2. Hiển thị mã phòng ban, tên phòng ban, sắp xếp theo thứ tự tên phòng ban.
SELECT DEPTNO, DNAME
FROM DEPT
ORDER BY  DEPTNO ASC;
--3. Hiển thị danh sách những nhân viên làm tại phòng 10 và 20 theo thứ tự A,B,C
SELECT * FROM EMP WHERE DEPTNO IN (10, 20);
--4Hiển thị tên và nghề nghiệp những nhân viên làm nghề thư ký (cleck) tại phòng 20.
SELECT *FROM EMP
WHERE JOB LIKE 'CLERK%';
--5. Hiển thị tất cả những nhân viên mà tên có các ký tự TH và LL
SELECT *FROM EMP
WHERE ENAME LIKE '%TH' or ENAME LIKE '%LL';
--6. Hiển thị tên nhân viên, nghề nghiệp, lương của những nhân viên có giám đốc quản lý
SELECT ENAME, JOB, SAL  FROM EMP
WHERE JOB != 'PRESIDENT';
--7. Hiển thị tên nhân viên, mã phòng ban, ngày gia nhập công ty sao cho gia nhập công ty trong năm 1983.
SELECT ENAME , DEPTNO, HIREDATE
FROM EMP
WHERE HIREDATE LIKE '%_83';
--8 Hiển thị tên nhân viên, lương một năm (ANUAL_SAL ), thưởng sao cho lương lớn
-- hơn thưởng và nghề nghiệp là SALEMAN, sắp theo thứ tự lương giảm dần và tên tăng
-- dần
SELECT ENAME, SAL *12 AS ANUAL_SAL, NVL(COMM,0) AS COMM, JOB
FROM EMP
WHERE SAL >COMM  and JOB LIKE 'SALESMAN'
ORDER BY SAL desc , ENAME asc ;


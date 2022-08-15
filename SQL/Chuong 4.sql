--4.5.1. Hàm trên từng dòng dữ liệu
--Bai4
--1. Liệt kê tên nhân viên, mã phòng ban và lương nhân viên được tăng 15% (PCTSAL).
SELECT ENAME, DEPTNO, SAL + SAL *0.15 PCTSAL
FROM EMP;
--2
SELECT CONCAT(RPAD(ENAME,8,'*') , LPAD(JOB, 10,'*')) AS EMPLOYEE_AND_JOB
FROM EMP;
--3
SELECT (ENAME||''||'('||JOB||')') EMPLOYEE
FROM EMP;
--4
SELECT ENAME,DEPTNO,JOB
FROM EMP;
--5Tìm ngày thứ 6 đầu tiên cách 2 tháng so với ngày hiện tại hiển thị ngày dưới dạng 09
-- February 1990.
SELECT NEXT_DAY(ADD_MONTHS(SYSDATE,2),'FRIDAY') AS FIRSTDATE
FROM DUAL;
--6Tìm thông itn về tên nhân viên, ngày gia nhập công ty của nhân viên phòng số 20,
-- sao cho hiển thị như sau:
SELECT ENAME,NVL(to_char(HIREDATE,'MONTH/DAY/yyyy'),0) as HIREDATE
FROM EMP
WHERE DEPTNO=20;
--7Hiển thị tên nhân viên, ngày gia nhập công ty, ngày xét nâng lương (sau ngày gia
-- nhập công ty 1 năm), sắp xếp theo thứ tự ngày xét nâng lương.
SELECT ENAME,HIREDATE,ADD_MONTHS(HIREDATE,12) AS REVIEW
FROM EMP
ORDER BY HIREDATE ASC;
--8
SELECT ENAME,(CASE WHEN SAL<1500  THEN 'BELOW 1500'
    WHEN SAL=1500 THEN 'ON TARGET'
    WHEN SAL >1500 THEN TO_CHAR(SAL) END) AS SAL
FROM EMP;
--9. Cho biết thứ của ngày hiện tại
SELECT TO_CHAR(CURRENT_DATE,'DAY') AS DAY
FROM DUAL;
--10 Đưa chuỗi dưới dạng nn/nn, kiểm tra nếu khúng khuôn dạng trả lời là YES, ngược lại
-- là NO. Kiểm tra với các chuỗi 12/34, 01/1a, 99\88
SELECT DECODE('99\88','12/34','YES','01/1a','NO','99\88','NO','undefined') AS CHECKVALUE
FROM DUAL;

--11.Hiển thị tên nhân viên, ngày gia nhập công ty, ngày lĩnh lương sao cho ngày lĩnh
-- lương phải vào thứ 6, nhân viên chỉ được nhận lương sau ít nhất 15 ngày làm việc tại
-- công ty, sắp xếp theo thứ tự ngày gia nhập công ty
SELECT ENAME, HIREDATE, NEXT_DAY(HIREDATE+15, 'FRIDAY') AS SALDATE
FROM EMP
WHERE ((CURRENT_DATE-HIREDATE)>15);


--4.5.2. Hàm trên nhóm dữ liệu
--1. Tìm lương thấp nhất, lớn nhất và lương trung bình của tất cả các nhân viên
SELECT MAX(SAL) AS LUONGCN, MIN(SAL) AS LUONGNN, ROUND(AVG(SAL),2)  AS LUONGTB
FROM EMP;
--2. Tìm lương nhỏ nhất và lớn của mỗi loại nghề nghiệp
SELECT JOB, MAX(SAL) AS LUONGLN, MIN(SAL) AS LUONGNN
FROM EMP
GROUP BY JOB;
--3.Tìm xem có bao nhiêu giám đốc trong danh sách nhân viên.
SELECT COUNT(*) AS GIAMDOC FROM EMP
WHERE JOB LIKE 'PRESIDENT%';
--4.Tìm tất cả các phòng ban mà số nhân viên trong phòng >3
SELECT DEPTNO AS PBAN
FROM EMP
GROUP BY DEPTNO
HAVING COUNT (*)>3;
--5.Tìm ra mức lương nhỏ nhất của mỗi nhân viên làm việc cho một giám đốc nào đó
-- sắp xếp theo thứ tự tăng dần của mức lương.
SELECT JOB , MIN(SAL) AS LUONGNN
FROM EMP
WHERE JOB !='MANAGER'
GROUP BY JOB;

--bai5
--1 Hiển thị toàn bộ tên nhân viên và tên phòng ban làm việc sắp xếp theo tên phòng
-- ban.
SELECT ENAME,DNAME
FROM EMP, DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO
ORDER BY DNAME;
--2Hiển thị tên nhân viên, vị trí địa lý, tên phòng với điều kiện lương >1500.
SELECT ENAME,LOC, DNAME
FROM EMP
INNER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO
WHERE SAL>1500;
--3.Hiển thị tên nhân viên, nghề nghiệp, lương và mức lương.
SELECT ENAME, JOB,SAL, GRADE
FROM EMP, SALGRADE
WHERE SAL>=losal and SAL<= hisal
ORDER BY GRADE;

--4Hiển thị tên nhân viên, nghề nghiệp, lương và mức lương, với điều kiện mức
-- lương=3.
SELECT ENAME,JOB,SAL,GRADE
FROM EMP,SALGRADE
WHERE GRADE LIKE '3';

--5.. Hiển thị những nhân viên tại DALLAS
SELECT ENAME, LOC, SAL
FROM EMP,DEPT
WHERE LOC LIKE 'DALLAS';
--6.Hiển thị tên nhân viên , nghề nghiệp, lương, mức lương, tên phòng làm việc trừ nhân
-- viên có nghề là cleck và sắp xếp theo chiều giảm
SELECT ENAME,JOB,SAL,GRADE
FROM EMP,SALGRADE
WHERE JOB !='CLERK'
ORDER BY JOB DESC ;
--7 Hiển thị chi tiết về những nhân viên kiếm được 36000 $ 1 năm hoặc nghề là cleck.
-- (gồm các trường tên, nghề, thu nhập, mã phòng, tên phòng, mức lương)
SELECT ENAME,JOB,(SAL*12),EMP.DEPTNO,DNAME,GRADE

FROM EMP INNER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO,SALGRADE

WHERE  (SAL*12)=36000 or JOB='CLERK';
--8. Hiển thị những phòng không có nhân viên nào làm việc
SELECT DEPTNO,DNAME,LOC
FROM DEPT WHERE DEPTNO NOT IN (SELECT EMP.DEPTNO FROM EMP);
--9 .Hiển thị mã nhân viên, tên nhân viên, mã người quản lý, tên người quản lý
SELECT E1.ENAME AS EMP_NAME,E2.SAL AS EMP_SAL,E2.ENAME AS MGR_NAME,E1.SAL AS MGR_SAL
FROM EMP E1,EMP E2
WHERE E1.MGR = E2.EMPNO;
--10.Như câu 9 hiển thị thêm thông tin về ông KING.
SELECT E1.ENAME AS EMP_NAME,E2.SAL AS EMP_SAL,E2.ENAME AS MGR_NAME,E1.SAL AS MGR_SAL
FROM EMP E1,EMP E2
WHERE E1.MGR = E2.EMPNO ;
--11Hiển thị nghề nghiệp được tuyển dụng vào năm 1981 và không được tuyển dụng vào
-- năm 1994.
SELECT DISTINCT JOB
FROM EMP
WHERE (EXTRACT(YEAR FROM HIREDATE) = 1981) AND  JOB NOT IN ( SELECT JOB FROM EMP WHERE EXTRACT(YEAR FROM HIREDATE) = 1994);
--12Tìm những nhân viên gia nhập công ty trước giám đốc của họ.
SELECT E.ENAME EMP_NAME
FROM EMP E, EMP M
WHERE E.DEPTNO=M.DEPTNO AND M.JOB LIKE 'PRESIDENT'
AND EXTRACT(YEAR FROM E.HIREDATE)< EXTRACT(YEAR FROM M.HIREDATE);
--13Tìm tất cả các nhân viên, ngày gia nhập công ty, tên nhân viên, tên người giám đốc
--  và ngày gia nhập công ty của người giám đốc ấy
SELECT E.ENAME EML_NAME, E.HIREDATE EMP_DATE,M.ENAME MGR_NAME ,M.HIREDATE MGR_HIREDATE
FROM EMP E, EMP M
WHERE E.DEPTNO = M.DEPTNO AND M.JOB LIKE 'PRESIDENT';
--14Tìm những nhân viên kiếm được lương cao nhất trong mỗi loại nghề nghiệp.
SELECT DISTINCT E.ENAME, M.JOB, MAX(M.SAL) AS MAXSAL
FROM EMP E, EMP M
WHERE E.JOB= M.JOB
GROUP BY E.ENAME, M.JOB;
--15Tìm mức lương cao nhất trong mỗi phòng ban, sắp xếp theo thứ tự phòng ban.
SELECT JOB,DEPTNO,SAL
FROM EMP
WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO)
ORDER BY DEPTNO;
--16. Tìm nhân viên gia nhập vào phòng ban sớm nhất
SELECT ENAME, TO_CHAR(HIREDATE,'DD/MM/YYYY') AS HIREDATE,DEPTNO
FROM EMP
WHERE HIREDATE IN (SELECT MIN(HIREDATE) FROM EMP GROUP BY DEPTNO);
--17Hiển thị những nhân viên có mức lương lớn hơn lương TB của phòng ban mà họ làm
SELECT DISTINCT E.EMPNO,E.ENAME,E.SAL,M.DEPTNO
FROM EMP E, EMP M
WHERE E.DEPTNO=M.DEPTNO
GROUP BY M.DEPTNO, E.ENAME, E.SAL, E.EMPNO
HAVING E.SAL > AVG(M.SAL);
--18. Hiển thị tên nhân viên, mã nhân viên, mã giám đốc, tên giám đốc, phòng ban làm
-- việc của giám đốc, mức lương của giám đốc
SELECT E.EMPNO EMP_NUMBER, E.ENAME EMP_NAME, E.SAL EMP_SAL, S.EMPNO MGR_NUMBER,S.ENAME MGR_NAME ,G.GRADE MGR_GRADE
FROM EMP E, EMP S, SALGRADE G
WHERE E.DEPTNO=S.DEPTNO and S.job like 'MANAGER'  and (S.sal>=G.LOSAL  and S.sal<=HISAL);









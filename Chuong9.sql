--bai9
--Cau1  Tạo Index trên cột PROJID cho bảng ASSIGNMENT.
CREATE INDEX PROJID_INDEX_KANZY ON ASSIGNMENTS_KANZY(PROJID);
--CAU2Hiển thị danh sách của nhân viên thuộc sự quản lý của người
--có tên là 1 biến được nhập từ bàn phím
SELECT E.EMPNO,E.ENAME,E.JOB,M.MGR,E.HIREDATE,E.SAL,E.COMM,E.DEPTNO
FROM EMP E JOIN EMP M ON E.MGR=M.EMPNO
WHERE M.MGR =(SELECT MGR FROM EMP WHERE ENAME ='SALEMAN');





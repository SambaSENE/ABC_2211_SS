CREATE TABLE emp (
  empno int PRIMARY KEY,
  ename varchar(50),
  job varchar(50),
  mgr int,
  hiredate date,
  sal decimal(10, 2),
  comm decimal(10, 2),
  deptno int
);

ALTER TABLE emp
ADD CONSTRAINT fk_emp_mgr
FOREIGN KEY (mgr)
REFERENCES emp(empno);

CREATE TABLE dept (
  deptno int PRIMARY KEY,
  dname varchar(50),
  loc varchar(50)
);

exercice 1

Pour donner le nom, job, numéro et salaire de tous les employés, puis seulement des employés du département 10, vous pouvez utiliser les requêtes suivantes:
sql
Copy code
-- Tous les employés
SELECT ename, job, empno, sal FROM emp;

-- Employés du département 10
SELECT ename, job, empno, sal FROM emp WHERE deptno = 10;
Pour donner le nom, job et salaire des employés de type MANAGER dont le salaire est supérieur à 2800, vous pouvez utiliser la requête suivante:
sql
Copy code
SELECT ename, job, sal FROM emp WHERE job = 'MANAGER' AND sal > 2800;
Pour donner la liste des MANAGER n'appartenant pas au département 30, vous pouvez utiliser la requête suivante:
sql
Copy code
SELECT ename, job FROM emp WHERE job = 'MANAGER' AND deptno != 30;
Pour lister les employés dont le salaire est compris entre 1200 et 1400, vous pouvez utiliser la requête suivante:
sql
Copy code
SELECT ename, job, sal FROM emp WHERE sal BETWEEN 1200 AND 1400;
Pour lister les employés des départements 10 et 30 classés dans l'ordre alphabétique, vous pouvez utiliser la requête suivante:
sql
Copy code
SELECT ename, job, deptno FROM emp WHERE deptno IN (10, 30) ORDER BY ename ASC;
Pour lister les employés du département 30 classés dans l'ordre des salaires croissants, vous pouvez utiliser la requête suivante:
sql
Copy code
SELECT ename, job, sal FROM emp WHERE deptno = 30 ORDER BY sal ASC;
Pour lister tous les employés classés par emploi et salaires décroissants, vous pouvez utiliser la requête suivante:
sql
Copy code
SELECT ename, job, sal FROM emp ORDER BY job ASC, sal DESC;


Voici les requêtes correspondantes :

sql
Copy code
CREATE TABLE PROJET (
   NUM_PROJ NUMBER(3) PRIMARY KEY,
   NOM_PROJ VARCHAR2(5),
   BUDGET NUMBER(8,2)
);

INSERT INTO PROJET (NUM_PROJ, NOM_PROJ, BUDGET)
VALUES (101, 'ALPHA', 96000);

INSERT INTO PROJET (NUM_PROJ, NOM_PROJ, BUDGET)
VALUES (102, 'BETA', 82000);

INSERT INTO PROJET (NUM_PROJ, NOM_PROJ, BUDGET)
VALUES (103, 'GAMMA', 15000);
sql
Copy code
ALTER TABLE EMP ADD NUM_PROJ NUMBER(3);

UPDATE EMP
SET NUM_PROJ = 
  CASE 
    WHEN DEPTNO = 30 AND JOB = 'SALESMAN' THEN 101
    ELSE 102
  END;
sql
Copy code
CREATE VIEW EMPLOYEES_VIEW AS 
SELECT E.ENAME, E.JOB, D.DNAME, P.NOM_PROJ 
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
INNER JOIN PROJET P ON E.NUM_PROJ = P.NUM_PROJ;
vbnet
Copy code
SELECT * 
FROM EMPLOYEES_VIEW
ORDER BY DNAME, NOM_PROJ;
vbnet
Copy code
SELECT M.ENAME AS MANAGER_NAME, P.NOM_PROJ AS PROJECT_NAME
FROM EMP M
INNER JOIN EMP E ON M.EMPNO = E.MGR
INNER JOIN PROJET P ON E.NUM_PROJ = P.NUM_PROJ;



samba sene
17. Liste des employés (nom, salaire) dont le salaire est supérieur à la moyenne globale des salaires
18. Création d'une table PROJET avec comme colonnes numéro de projet (3 chiffres), nom de projet(5 caractères), budget. Entrez les valeurs suivantes:
101, ALPHA, 96000
102, BETA, 82000
103, GAMMA, 15000
19. Ajouter l'attribut numéro de projet à la table EMP et affecter tous les vendeurs du département 30 au projet 101, et les autres au projet 102
20. Créer une vue comportant tous les employés avec nom, job, nom de département et nom de projet
21. A l'aide de la vue créée précédemment, lister tous les employés avec nom, job, nom de département et nom de projet triés sur nom de département et nom de projet
22. Donner le nom du projet associé à chaque manager
Liste des employés (nom, salaire) dont le salaire est supérieur à la moyenne globale des salaires:
sql
Copy code
SELECT ename, sal
FROM emp
WHERE sal > (SELECT AVG(sal) FROM emp);
Création d'une table PROJET avec comme colonnes numéro de projet (3 chiffres), nom de projet(5 caractères), budget. Entrez les valeurs suivantes:
sql
Copy code
CREATE TABLE PROJET (
    PROJNO INT(3) PRIMARY KEY,
    PROJNAME VARCHAR(5),
    BUDGET INT(10)
);

INSERT INTO PROJET (PROJNO, PROJNAME, BUDGET) VALUES 
    (101, 'ALPHA', 96000), 
    (102, 'BETA', 82000), 
    (103, 'GAMMA', 15000);
Ajouter l'attribut numéro de projet à la table EMP et affecter tous les vendeurs du département 30 au projet 101, et les autres au projet 102:
sql
Copy code
ALTER TABLE emp ADD COLUMN projno INT(3);

UPDATE emp SET projno = 
    (CASE WHEN deptno = 30 AND job = 'SALESMAN' THEN 101 
          ELSE 102 
     END);
Créer une vue comportant tous les employés avec nom, job, nom de département et nom de projet:
vbnet
Copy code
CREATE VIEW emp_details AS 
SELECT emp.ename, emp.job, dept.dname, projet.projname 
FROM emp 
JOIN dept ON emp.deptno = dept.deptno 
JOIN projet ON emp.projno = projet.projno;
A l'aide de la vue créée précédemment, lister tous les employés avec nom, job, nom de département et nom de projet triés sur nom de département et nom de projet:
vbnet
Copy code
SELECT * 
FROM emp_details 
ORDER BY dname, projname;
Donner le nom du projet associé à chaque manager:
vbnet
Copy code
SELECT emp.ename, projet.projname 
FROM emp 
JOIN projet ON emp.projno = projet.projno 
WHERE emp.job = 'MANAGER';

Lister les employés du département RESEARCH embauchés le même jour que quelqu'un du département SALES.
sql
Copy code
SELECT *
FROM emp
WHERE deptno = 20
AND hiredate IN (
    SELECT hiredate
    FROM emp
    WHERE deptno = 30
)
Lister le nom des employés et également le nom du jour de la semaine correspondant à leur date d'embauche.
sql
Copy code
SELECT ename, TO_CHAR(hiredate, 'DAY')
FROM emp
Donner, pour chaque employé, le nombre de mois qui s'est écoulé entre leur date d'embauche et la date actuelle.
sql
Copy code
SELECT ename, MONTHS_BETWEEN(SYSDATE, hiredate) AS nb_months
FROM emp
Afficher la liste des employés ayant un M et un A dans leur nom.
sql
Copy code
SELECT ename
FROM emp
WHERE ename LIKE '%M%A%'
Afficher la liste des employés ayant deux 'A' dans leur nom.
sql
Copy code
SELECT ename
FROM emp
WHERE ename LIKE '%A%A%'
Afficher les employés embauchés avant tous les employés du département 10.
sql
Copy code
SELECT *
FROM emp
WHERE hiredate < ALL (
    SELECT hiredate
    FROM emp
    WHERE deptno = 10
)
Sélectionner le métier où le salaire moyen est le plus faible.
sql
Copy code
SELECT job
FROM emp
GROUP BY job
HAVING AVG(sal) = (
    SELECT MIN(avg_sal)
    FROM (
        SELECT AVG(sal) AS avg_sal
        FROM emp
        GROUP BY job
    )
)
Sélectionner le département ayant le plus d'employés.
sql
Copy code
SELECT deptno
FROM emp
GROUP BY deptno
HAVING COUNT(*) = (
    SELECT MAX(count_dept)
    FROM (
        SELECT COUNT(*) AS count_dept
        FROM emp
        GROUP BY deptno
    )
)
Donner la répartition en pourcentage du nombre d'employés par département selon le modèle ci-dessous.
Département	Répartition en %
10	21.43
20	35.71
30	42.86
sql
Copy code
SELECT deptno, ROUND(COUNT(*)*100/SUM(COUNT(*)) OVER(), 2) AS pct_emp
FROM emp
GROUP BY deptno
ORDER BY deptno





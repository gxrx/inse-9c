CREATE USER 'sign' IDENTIFIED BY 'sign';
GRANT SELECT (ID, First_Name, Last_Name) ON T_X.Student TO 'sign';
GRANT SELECT (ID, Name) ON T_X.Unit TO 'sign';
GRANT SELECT (U_ID, S_ID, Mark) ON T_X.Enrolment TO 'sign';
GRANT SHOW VIEW, SELECT ON T_X.PassedStudents TO 'sign';

Changes
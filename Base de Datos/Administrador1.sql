select * from dba_users where username='MIGUELANGEL';

select * from dba_profiles where profile='DEFAULT';

CREATE PROFILE REPONEDOR LIMIT
  SESSIONS_PER_USER 1
  CONNECT_TIME 2;

ALTER USER MIGUELANGEL PROFILE REPONEDOR;

ALTER PROFILE REPONEDOR LIMIT
  FAILED_LOGIN_ATTEMPTS 3;

ALTER USER MIGUELANGEL ACCOUNT UNLOCK;

ALTER USER MIGUELANGEL PROFILE DEFAULT;

select * from user_users;
select * from all_users;
select * from dba_users;
SELECT * FROM dba_profiles;


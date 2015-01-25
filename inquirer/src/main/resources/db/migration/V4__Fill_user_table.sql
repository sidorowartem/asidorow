insert into user_info (username, user_pass) values ('test', 'test1');
insert into user_info (username, user_pass) values ('root', 'root1');

insert into user_role (user_id, role_id)
values (
  (select
     user_id
   from user_info
   where username = 'test'),
  (select
     role_id
   from role
   where role_name = 'user'));
insert into user_role (user_id, role_id)
values (
  (select
     user_id
   from user_info
   where username = 'root'),
  (select
     role_id
   from role
   where role_name = 'user'));
insert into user_role (user_id, role_id)
values (
  (select
     user_id
   from user_info
   where username = 'root'),
  (select
     role_id
   from role
   where role_name = 'admin'));
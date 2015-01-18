create table user_info (
  user_id   serial,
  username  varchar(255) not null unique,
  user_pass varchar(255) not null
);

alter table user_info add constraint user_info_pk primary key (user_id);

create table role (
  role_id   serial,
  role_name varchar(255) not null unique
);

alter table role add constraint role_pk primary key (role_id);

create table user_role (
  user_id int8 not null,
  role_id int8 not null
);

alter table user_role add constraint user_role_pk primary key (user_id, role_id);
alter table user_role add foreign key (user_id) references user_info (user_id) on update no action on delete no action;
alter table user_role add foreign key (role_id) references role (role_id) on update no action on delete no action;

insert into role (role_name) values ('user');
insert into role (role_name) values ('admin');

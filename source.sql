drop database javatestdb;
create user javadmin with password 'password';
create database javatestdb with template=template0 owner=javadmin;
\connect javatestdb;
alter default privileges grant all on table to javaadmin;
alter default privileges grant all on sequence to javadmin;

create table users
(
    user_id integer primary key not null,
    first_name varchar not null,
    last_name varchar not null,
    email varchar not null,
    password text not null
);

create table cateasd
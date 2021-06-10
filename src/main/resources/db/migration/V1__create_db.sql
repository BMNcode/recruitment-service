create sequence hibernate_sequence start 1 increment 1;

create table user_role (
	user_id int8 not null,
	roles varchar(255)
);

create table users (
	user_id int8 not null,
	active boolean not null,
	password varchar(255) not null, 
	username varchar(255) not null, 
	primary key (user_id)
);

alter table if exists user_role 
	add constraint user_role_users_fk
	foreign key (user_id) references users;

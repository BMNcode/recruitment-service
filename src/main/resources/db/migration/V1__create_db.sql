create sequence hibernate_sequence start 1 increment 1;

create table contacts (
        id_contact      int8            not null,
        detail          varchar(255)    not null,
        type_contact    varchar(255)    not null,
        id_manager      int8            not null,
        id_provider     int8            not null,
                        primary key (id_contact)
);

create table employees (
        id_employee     int8            not null,
        hourly_rate     float8          not null,
        description     varchar(255),
        firstname       varchar(255)    not null,
        lastname        varchar(255)    not null,
        middlename      varchar(255),
        note            varchar(255),
        id_position     int8,
        id_provider     int8,
                        primary key (id_employee)
);

create table managers (
        id_manager      int8            not null,
        firstname       varchar(255),
        lastname        varchar(255),
        middlename      varchar(255),
                        primary key (id_manager)
);

create table positions (
        id_position     int8            not null,
        position        varchar(255)    not null,
        qualification   varchar(255),
                        primary key (id_position)
);

create table providers (
        id_provider     int8            not null,
        company         varchar(255),
        firstname       varchar(255)    not null,
        lastname        varchar(255)    not null,
        middlename      varchar(255),
                        primary key (id_provider)
);

create table skills (
        id_skill        int8            not null,
        level_skill     int2,
        skill           varchar(255),
        id_employee     int8            not null,
                        primary key (id_skill)
);

create table users (
        user_id int8 not null,
        email varchar(255) not null,
        password varchar(255) not null,
        role varchar(255) not null,
        status varchar(255) not null,
        id_manager int8,
        id_provider int8,
        primary key (user_id)
);

alter table if exists contacts
    add constraint contacts_managers_fk
    foreign key (id_manager) references managers;

alter table if exists contacts
    add constraint contacts_providers_fk
    foreign key (id_provider) references providers;

alter table if exists employees
    add constraint employees_positions_fk
    foreign key (id_position) references positions;

alter table if exists employees
    add constraint employees_providers_fk
    foreign key (id_provider) references providers;

alter table if exists skills
    add constraint skills_employees_fk
    foreign key (id_employee) references employees;

alter table if exists users
    add constraint users_managers_fk
    foreign key (id_manager) references managers;

alter table if exists users
    add constraint users_provides_fk
    foreign key (id_provider) references providers;






























--create sequence hibernate_sequence start 1 increment 1;
--
--create table users (
--    dtype varchar(31) not null,
--    user_id int8 not null,
--    email varchar(255) not null,
--    password varchar(255) not null,
--    role varchar(255) not null,
--    status varchar(255) not null,
--    firstname varchar(255),
--    lastname varchar(255),
--    middlename varchar(255),
--    primary key (user_id)
--);

--create table users (
--    user_id int8 not null,
--    email varchar(255) not null,
--    password varchar(255) not null,
--    role varchar(255) not null,
--    status varchar(30) not null,
--    primary key (user_id)
--);


--create table user_role (
--	user_id int8 not null,
--	roles varchar(255)
--);
--
--create table users (
--	user_id int8 not null,
--	active boolean not null,
--	password varchar(255) not null,
--	username varchar(255) not null,
--	primary key (user_id)
--);
--
--alter table if exists user_role
--	add constraint user_role_users_fk
--	foreign key (user_id) references users;

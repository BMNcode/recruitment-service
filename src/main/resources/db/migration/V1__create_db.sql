create sequence hibernate_sequence start 1 increment 1;

--ENTITY--

create table users (
	    user_id             int8                not null,
	    firstname           varchar(40)         not null,
	    middlename          varchar(40),
	    lastname            varchar(40)         not null,
	    email               varchar(40)         not null,
	    password            varchar(255)        not null,
	    created             timestamp,
	    modified            timestamp,
	    role                varchar(10)         not null,
	    status              varchar(10)         not null,
	                        primary key (user_id)
);

create table employees (
        user_id             int8                not null,
        provider_id         int8                not null,
        position_id         int8                not null,
	    employee_status     varchar(10)         not null,
	    hourly_rate         float8              not null,
	    manager_note        varchar(1020),
	    description         varchar(2040),
	                        primary key (user_id)
);

create table managers (
	    user_id             int8                not null,
	                        primary key (user_id)
);

create table providers (
        user_id             int8                not null,
	    company             varchar(50),
	                        primary key (user_id)
);

--MAPPING ENTITY--

create table contacts (
	    contact_id          int8                not null,
	    user_id             int8,
	    contact_type_id     int8                not null,
	    contact_detail      varchar(50)         not null,
	                        primary key (contact_id)
);

create table employee_skill_level_skill_mapping (
	    user_id             int8                not null,
	    skill_id            int8                not null,
	    skill_level_id      int8                not null,
	                        primary key (user_id, skill_id)
);

--DICTIONARY--

create table skills (
	    skill_id            int8                not null,
	    skill_name          varchar(15)         not null,
	    skill_group         varchar(15)         not null,
	                        primary key (skill_id)
);

create table skill_levels (
	    skill_level_id      int8                not null,
	    number_level        varchar(255),
	    qualification_level varchar(255),
	                        primary key (skill_level_id)
);

create table contact_types (
	    contact_type_id     int8                not null,
	    contact_type        varchar(15)         not null,
	                        primary key (contact_type_id)
);

create table employee_positions (
	    position_id         int8                not null,
	    position            varchar(20)        not null,
	                        primary key (position_id)
);

alter table if exists employee_skill_level_skill_mapping
    add constraint UK_employee_skill_level_skill
    unique (skill_level_id);

alter table if exists contacts
    add constraint FK_contacts_contact_types
    foreign key (contact_type_id) references contact_types;

alter table if exists contacts
    add constraint FK_contacts_users
    foreign key (user_id) references users;

alter table if exists employee_skill_level_skill_mapping
    add constraint FK_employee_skill_level_skill_mapping_skill_levels
    foreign key (skill_level_id) references skill_levels;

alter table if exists employee_skill_level_skill_mapping
    add constraint FK_employee_skill_level_skill_mapping_skills
    foreign key (skill_id) references skills;

alter table if exists employee_skill_level_skill_mapping
    add constraint FK_employee_skill_level_skill_mapping_employees
    foreign key (user_id) references employees;

alter table if exists employees
    add constraint FK_employees_employee_positions
    foreign key (position_id) references employee_positions;

alter table if exists employees
    add constraint FK_employees_providers
    foreign key (provider_id) references providers;

alter table if exists employees
    add constraint FK_employees_users
    foreign key (user_id) references users;

alter table if exists managers
    add constraint FK_managers_users
    foreign key (user_id) references users;

alter table if exists providers
    add constraint FK_providers_users
    foreign key (user_id) references users;































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

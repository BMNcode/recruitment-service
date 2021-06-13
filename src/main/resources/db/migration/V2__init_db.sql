insert into users (user_id, email, password, role, status)
    values (1, '1', '1', 'MANAGER', 'ACTIVE'),
           (2, '2', '2', 'PROVIDER', 'ACTIVE');

insert into providers (id_provider, company, firstname, lastname, middlename, user_id)
    values (1, 'RT', 'Ivan', 'ivanov', 'ivanovich', 2);

insert into managers (id_manager, firstname, lastname, middlename, user_id)
    values (1, 'Petr', 'Petrov', 'Petrovich', 1);




--insert into users (user_id, username, password, active)
--    values (1, '1', '1', true);
--
--insert into user_role (user_id, roles)
--    values (1, 'MANAGER');
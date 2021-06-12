insert into providers (id_provider, company, firstname, lastname, middlename)
    values (1, 'RT', 'Ivan', 'ivanov', 'ivanovich');

insert into managers (id_manager, firstname, lastname, middlename)
    values (1, 'Petr', 'Petrov', 'Petrovich');

insert into users (user_id, email, password, role, status, id_manager, id_provider)
    values (1, '1', '1', 'MANAGER', 'ACTIVE', 1, null),
           (2, '2', '2', 'PROVIDER', 'ACTIVE', null, 1);




--insert into users (user_id, username, password, active)
--    values (1, '1', '1', true);
--
--insert into user_role (user_id, roles)
--    values (1, 'MANAGER');
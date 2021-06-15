insert into users (user_id, firstname,  middlename,  lastname,           email,   password,     role,    status)
           values (     1,      'Ivan', 'Ivanovich',  'Ivanov',     '1@mail.ru',        '1', 'MANAGER', 'ACTIVE'),
                  (     2,      'Petr', 'Petrovich',  'Petrov',     '2@mail.ru',        '2', 'PROVIDER', 'ACTIVE'),
                  (     3,      'Roman', 'Romanovich', 'Romanov',    'locked',     'locked', 'EMPLOYEE', 'LOCKED');

insert into providers (user_id, company)
           values     (      2,    null);


insert into  employees (user_id, provider_id, position_id, employee_status, hourly_rate, manager_note, description)
    values (3, 2, 2, 'FREE', 15, 'best of the best', 'true')
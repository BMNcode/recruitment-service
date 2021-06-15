insert into skills (skill_id, skill_name, skill_group)
    values (1, 'Java', 'LANGUAGE'),
           (2, 'C++', 'LANGUAGE'),
           (3, 'C#', 'LANGUAGE'),
           (4, 'Spring', 'FRAMEWORK'),
           (5, 'Vaadin', 'FRAMEWORK'),
           (6, 'Spark', 'FRAMEWORK'),
           (7, 'Maven', 'TOOLS'),
           (8, 'JUnit', 'TOOLS');

insert into skill_levels (skill_level_id, number_level, qualification_level)
    values (1, 10, 'Junior'),
           (2, 20, 'Junior'),
           (3, 30, 'Junior'),
           (4, 40, 'Junior'),
           (5, 50, 'Middle'),
           (6, 60, 'Middle'),
           (7, 70, 'Middle'),
           (8, 80, 'Senior'),
           (9, 90, 'Senior'),
           (10, 100, 'Senior');

insert into contact_types (contact_type_id, contact_type)
    values (1, 'EMAIL'),
           (2, 'MOBILE_TELEFON'),
           (3, 'TELEGRAM'),
           (4, 'WHATSAPP'),
           (5, 'COMPANY_TELEFON');

insert into employee_positions (position_id, position)
    values (1, 'Frontend-developer'),
           (2, 'Backend-developer'),
           (3, 'Technical leader'),
           (4, 'QA Engineer'),
           (5, 'Project manager');
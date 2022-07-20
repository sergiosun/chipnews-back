INSERT INTO users (username, password, role) VALUES ('Chipnews', '123456', 'ADMIN')
INSERT INTO users (username, password, role) VALUES ('Guilherme', '123456', 'USER')
INSERT INTO users (username, password, role) VALUES ('Sergio', '123456', 'USER')


INSERT INTO tb_role values (gen_random_uuid(), 'ROLE_ADMIN');
INSERT INTO tb_role values (gen_random_uuid(), 'ROLE_USER');
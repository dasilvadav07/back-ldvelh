INSERT into roles (id, name) values (1, 'ROLE_USER'),
(2, 'ROLE_PLAYER'),
(3, 'ROLE_EDITOR');

INSERT INTO book (id, author, title) VALUES
(1, 'Charles', 'Charlito'),
(2, 'Charles', 'Charlito'),
(3, 'Charles', 'Mumuh apprend Java'),
(4, 'Lamalice', 'Denis le stremon'),
(5, 'dom', 'dominique');

INSERT INTO book_type (book_id, type_name) VALUES
(1, 'SCIFI'),
(1, 'HORROR'),
(2, 'SCIFI'),
(2, 'HORROR'),
(3, 'CONTEMPORARY'),
(4, 'FUN'),
(5, 'MEDFAN'),
(5, 'SCIFI');
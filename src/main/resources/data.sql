INSERT into roles (id, name) values (1, 'USER'),
(2, 'ADMIN');

INSERT INTO library (id) VALUES
(1);
--
--INSERT INTO `book` (`id`, `fk_user_id`, `title`) VALUES
--(1, '0', 'Charlito'),
--(2, '0', 'Charlito'),
--(3, '1', 'Mumuh apprend Java'),
--(4, '1', 'Denis le stremon'),
--(5, '2', 'dominique');
--
INSERT INTO users (id, email, password, username, library_id) VALUES
(NULL, 'lulu@gmail.com', '$2a$10$p4pYC3hT/Ft2Pl7kFKAH5.zyDM1qL7HdSWDjMUU0HGiq8WIIKd8om', 'lulu', '1');
--(NULL, 'lui@lui.com', NULL, 'lui', '1'),
--(NULL, 'toto@toto.com', NULL, 'toto', '2');
--

--
----
--INSERT INTO book_type (book_id, type_name) VALUES
--(1, 'SCIFI'),
--(1, 'HORROR'),
--(2, 'SCIFI'),
--(2, 'HORROR'),
--(3, 'CONTEMPORARY'),
--(4, 'FUN'),
--(5, 'MEDFAN'),
--(5, 'SCIFI');
----
--INSERT INTO `chapter` (`id`, `caption`, `chapter_role`, `content`, `question`, `status`) VALUES
--(1, 'legende', 'INTRO', 'im a legende', 'Rentrer ?', 'PARAM_START'),
--(2, 'salut � tous', 'INTRO', 'coucou', 'Dire Bonjour ?', 'PARAM_START');
----
----
--INSERT INTO `book_chapter` (`book_id`, `chapter_id`) VALUES
--(1, 1),
--(2, 2);
----
---- INSERT INTO `roles` (`id`, `name`) VALUES
---- (1, 'ROLE_USER'),
---- (2, 'ROLE_PLAYER'),
---- (3, 'ROLE_EDITOR');
----
--select  1;
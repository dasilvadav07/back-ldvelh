-- Database: `ldvelhdccf`

INSERT INTO `book` (`id`, `author`, `title`) VALUES
(1, 'Charles', 'Charlito'),
(2, 'Charles', 'Charlito'),
(3, 'Charles', 'Mumuh apprend Java'),
(4, 'Lamalice', 'Denis le stremon'),
(5, 'dom', 'dominique');

INSERT INTO `book_type` (`book_id`, `type_name`) VALUES
(1, 'SCIFI'),
(1, 'HORROR'),
(2, 'SCIFI'),
(2, 'HORROR'),
(3, 'CONTEMPORARY'),
(4, 'FUN'),
(5, 'MEDFAN'),
(5, 'SCIFI');

INSERT INTO `chapter` (`id`, `caption`, `chapter_role`, `content`, `question`, `status`) VALUES
(1, 'legende', 'INTRO', 'im a legende', 'Rentrer ?', 'PARAM_START'),
(2, 'salut à tous', 'INTRO', 'coucou', 'Dire Bonjour ?', 'PARAM_START');


INSERT INTO `book_chapter` (`book_id`, `chapter_id`) VALUES
(1, 1),
(2, 2);

-- INSERT INTO `roles` (`id`, `name`) VALUES
-- (1, 'ROLE_USER'),
-- (2, 'ROLE_PLAYER'),
-- (3, 'ROLE_EDITOR');


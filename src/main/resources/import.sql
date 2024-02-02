INSERT INTO tb_user (name , email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG' );
INSERT INTO tb_user (name , email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name , email, password) VALUES ('Pedro Henrique', 'ph4290245@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');


INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course(name , img_Uri , img_Gray_Uri) VALUES ('Bootcamp Html' , 'https://static.vecteezy.com/system/resources/thumbnails/010/869/731/small/online-education-concept-illustration-digital-classroom-online-teaching-metaphors-free-png.png' , 'https://icons.veryicon.com/png/o/miscellaneous/light-e-treasure-3/training-course.png');


INSERT INTO tb_offer(edition , start_Moment , end_Moment , course_id) VALUES ('1.0',TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z' ,TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:00Z','1' );
INSERT INTO tb_offer(edition , start_Moment , end_Moment , course_id) VALUES ('2.0',TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:00Z' ,TIMESTAMP WITH TIME ZONE '2025-11-20T03:00:00Z' ,'1');

INSERT INTO tb_resource(title , description , position , img_Uri , type , offer_id) VALUES ('trilha Html' , 'trilha principal do curso', 1, 'https://static.vecteezy.com/system/resources/thumbnails/010/869/731/small/online-education-concept-illustration-digital-classroom-online-teaching-metaphors-free-png.png', 'LESSON_TASK', 1);
INSERT INTO tb_resource(title , description , position , img_Uri , type , offer_id) VALUES ('Forum' , 'tire suas duvidas', 2, 'https://static.vecteezy.com/system/resources/thumbnails/010/869/731/small/online-education-concept-illustration-digital-classroom-online-teaching-metaphors-free-png.png', 'FORUM', 1);
INSERT INTO tb_resource(title , description , position , img_Uri , type , offer_id) VALUES ('lives' , 'lives exclusivas', 3, 'https://static.vecteezy.com/system/resources/thumbnails/010/869/731/small/online-education-concept-illustration-digital-classroom-online-teaching-metaphors-free-png.png', 'LESSON_ONLY', 1);

INSERT INTO tb_section(title , description , position , img_Uri ,resource_id , prerequisite_id) VALUES ('Capitulo 1' , 'Introdução', 1, 'https://static.vecteezy.com/system/resources/thumbnails/010/869/731/small/online-education-concept-illustration-digital-classroom-online-teaching-metaphors-free-png.png',1, null);
INSERT INTO tb_section(title , description , position , img_Uri ,resource_id , prerequisite_id) VALUES ('Capitulo 2' , 'Continuação', 2, 'https://static.vecteezy.com/system/resources/thumbnails/010/869/731/small/online-education-concept-illustration-digital-classroom-online-teaching-metaphors-free-png.png',1, 1);
INSERT INTO tb_section(title , description , position , img_Uri ,resource_id , prerequisite_id) VALUES ('Capitulo 3' , 'Final', 3, 'https://static.vecteezy.com/system/resources/thumbnails/010/869/731/small/online-education-concept-illustration-digital-classroom-online-teaching-metaphors-free-png.png',1, 2);


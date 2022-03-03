DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id int(20) NOT NULL COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT(11) NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

DELETE FROM user;
INSERT INTO user (id, name, age, email) VALUES
(1, 'Banana', 18, 'test1@pyy.com'),
(2, 'Jack', 20, 'test2@pyy.com'),
(3, 'Tom', 28, 'test3@pyy.com'),
(4, 'Milk', 21, 'test4@pyy.com'),
(5, 'Apple', 24, 'test5@pyy.com');


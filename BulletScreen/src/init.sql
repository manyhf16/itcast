use test;
drop table bullet;
create table bullet(
    id int primary key auto_increment,
    video_id int not null,
    time int not null,
    content varchar(60) not null,
    skin_id int,
    username varchar(24)
);


-- `t_account`
create table if not exists `t_account`
(
    `id`       varchar(50)  not null auto_increment comment 'id' primary key,
    `username` varchar(256) not null comment '用户名',
    `money`    int          not null comment '余额'
) comment '`t_account`';

insert into `t_account` (`id`, `username`, `money`)
values ('1', '蔡瑞霖', 48141);
insert into `t_account` (`id`, `username`, `money`)
values ('2', '周明轩', 64178);
insert into `t_account` (`id`, `username`, `money`)
values ('3', '董锦程', 11);
insert into `t_account` (`id`, `username`, `money`)
values ('4', '曾子轩', 19);
insert into `t_account` (`id`, `username`, `money`)
values ('5', '朱伟宸', 78);
insert into `t_account` (`id`, `username`, `money`)
values ('6', '雷文昊', 78423);
insert into `t_account` (`id`, `username`, `money`)
values ('7', '贺哲瀚', 16224);
insert into `t_account` (`id`, `username`, `money`)
values ('8', '姚天翊', 39511);
insert into `t_account` (`id`, `username`, `money`)
values ('9', '雷鹏涛', 51519);
insert into `t_account` (`id`, `username`, `money`)
values ('10', '卢健雄', 46878);
insert into `t_account` (`id`, `username`, `money`)
values ('11', '许修洁', 53722);
insert into `t_account` (`id`, `username`, `money`)
values ('12', '黎熠彤', 69);
insert into `t_account` (`id`, `username`, `money`)
values ('13', '邱文', 6824);
insert into `t_account` (`id`, `username`, `money`)
values ('14', '孙致远', 848);
insert into `t_account` (`id`, `username`, `money`)
values ('15', '孟文昊', 1722);
insert into `t_account` (`id`, `username`, `money`)
values ('16', '孟雨泽', 37772);
insert into `t_account` (`id`, `username`, `money`)
values ('17', '龙思源', 17775);
insert into `t_account` (`id`, `username`, `money`)
values ('18', '许伟祺', 24247);
insert into `t_account` (`id`, `username`, `money`)
values ('19', '薛潇然', 5555);
insert into `t_account` (`id`, `username`, `money`)
values ('20', '马思', 9782);


update `t_account`
set `money`=`money` - ?
where `username` = ?;
select *
from t_book;

SELECT COUNT(*)
FROM t_book;


-- `t_account`
drop table if exists `t_account`;

create table if not exists `t_account`
(
    `id`       int(50)      not null comment 'id' primary key,
    `username` varchar(256) not null comment '用户名',
    `money`    int          not null comment '余额'
) comment '`t_account`';



insert into `t_account` (`id`, `username`, `money`)
values ('1', '袁乐驹', 77);
insert into `t_account` (`id`, `username`, `money`)
values ('2', '程志强', 73);
insert into `t_account` (`id`, `username`, `money`)
values ('3', '邓立辉', 98673);
insert into `t_account` (`id`, `username`, `money`)
values ('4', '陶峻熙', 41727);
insert into `t_account` (`id`, `username`, `money`)
values ('5', '龚果', 8382);
insert into `t_account` (`id`, `username`, `money`)
values ('6', '任烨霖', 97319);
insert into `t_account` (`id`, `username`, `money`)
values ('7', '周伟祺', 69);
insert into `t_account` (`id`, `username`, `money`)
values ('8', '方琪', 24);
insert into `t_account` (`id`, `username`, `money`)
values ('9', '金天翊', 73846);
insert into `t_account` (`id`, `username`, `money`)
values ('10', '沈荣轩', 143);
insert into `t_account` (`id`, `username`, `money`)
values ('11', '雷烨霖', 693);
insert into `t_account` (`id`, `username`, `money`)
values ('12', '徐伟祺', 25);
insert into `t_account` (`id`, `username`, `money`)
values ('13', '秦思远', 558);
insert into `t_account` (`id`, `username`, `money`)
values ('14', '邱文轩', 67);
insert into `t_account` (`id`, `username`, `money`)
values ('15', '阎笑愚', 81);
insert into `t_account` (`id`, `username`, `money`)
values ('16', '白天宇', 586);
insert into `t_account` (`id`, `username`, `money`)
values ('17', '谢修洁', 85456);
insert into `t_account` (`id`, `username`, `money`)
values ('18', '朱嘉熙', 783);
insert into `t_account` (`id`, `username`, `money`)
values ('19', '覃伟泽', 4615);
insert into `t_account` (`id`, `username`, `money`)
values ('20', '汪峻熙', 97725);




create table LINKS_ALREADY_PROCESSED
(
    link varchar(2000)
);

create table LINKS_TO_BE_PROCESSED
(
    link varchar(2000)
);

create table NEWS
(
    id          bigint primary key auto_increment,
    title       text,
    content     text,
    url         varchar(2000),
    created_at  timestamp default now(),
    modified_at timestamp default now()
) Default CHARSET=utf8mb4;
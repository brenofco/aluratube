create table videos(

    id bigint not null auto_increment,
    title varchar(100) not null,
    description varchar(255) not null,
    url varchar(255) not null unique,
    category varchar(100) not null,

    primary key(id)

);
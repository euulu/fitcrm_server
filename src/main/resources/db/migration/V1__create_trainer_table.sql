create table if not exists trainers(
    id bigint generated always as identity primary key,
    name varchar(50) not null,
    biography varchar(500),
    picture bytea
);

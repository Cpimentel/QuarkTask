CREATE TABLE responsible (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);


CREATE TABLE task (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    responsible_id BIGINT,
    priority VARCHAR(50),
    deadline DATE,
    concluded BOOLEAN NOT NULL DEFAULT FALSE,
    CONSTRAINT fk_responsible FOREIGN KEY (responsible_id) REFERENCES responsible(id)
);


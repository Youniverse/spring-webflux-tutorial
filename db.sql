CREATE TABLE message
(
    id        SERIAL PRIMARY KEY,
    message   TEXT,
    user_name VARCHAR(50),
    date      TIMESTAMP
);

-- generate some data with 1000 rows
INSERT INTO message (message, user_name, date)
SELECT
    md5(random()::text),
    md5(random()::text),
    now() - (random() * interval '1 year')
FROM generate_series(1, 1000);
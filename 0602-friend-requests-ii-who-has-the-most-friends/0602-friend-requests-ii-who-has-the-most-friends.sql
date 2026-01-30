# Write your MySQL query statement below
WITH friends AS (
    SELECT requester_id AS id, accepter_id AS friend_id
    FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id, requester_id AS friend_id
    FROM RequestAccepted
),
friend_count AS (
    SELECT id, COUNT(*) AS num
    FROM friends
    GROUP BY id
)
SELECT id, num
FROM friend_count
ORDER BY num DESC
LIMIT 1;

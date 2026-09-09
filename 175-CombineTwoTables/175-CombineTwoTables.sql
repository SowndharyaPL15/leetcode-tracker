-- Last updated: 9/9/2026, 2:13:57 PM
# Write your MySQL query statement below
SELECT P.firstName, P.lastName, A.city, A.state
FROM Person P LEFT JOIN Address A
on P.personId = A.personId
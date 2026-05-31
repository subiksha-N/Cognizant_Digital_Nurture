SELECT DATE_FORMAT(registration_date,'%Y-%m') AS month,
       COUNT(*) AS total_registrations
FROM Registrations
GROUP BY month
ORDER BY month;

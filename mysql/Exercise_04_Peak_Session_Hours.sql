SELECT e.title, COUNT(*) AS session_count
    FROM Sessions s
    JOIN Events e ON e.event_id = s.event_id
    WHERE TIME(s.start_time) BETWEEN '10:00:00' AND '12:00:00'
    GROUP BY e.event_id;
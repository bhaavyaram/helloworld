-- Write your query below
select CUSTOMER_ID, CUSTOMER_NAME 
FROM customers
WHERE customer_id IN 
(select customer_id 
from orders 
WHERE product_name IN ('A','B')
GROUP BY customer_id
HAVING COUNT (DISTINCT product_name) = 2 
)
AND customer_id NOT IN (
    select customer_id from orders where product_name = 'C'
)
ORDER BY CUSTOMER_NAME;

select customer_id, count(customer_id) as count_no_trans
from visits v
left outer join transactions t on (v.visit_id = t.visit_id)
where transaction_id is null
group by customer_id;

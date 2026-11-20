//Find the department name and average salary for each department.
->select d.department_name , avg(e.salary) as avgSalary from employee e join department d on d.id = e.department_id group by d.department_name;


//Find the departments whose average salary is greater than 70,000.
->select d.department_name , avg(e.salary) as avgSalary from employee e join department d on d.id = e.department_id
 group by d.department_name having avg(e.salary) > 70000;
 
 //Find departments that have more than 2 employees.
 -> select d.department_name, count(e.department_id) from employee e join department d 
 on d.id = e.department_id group by d.department_name
 having count(e.department_id)>2;
 
 //Find the highest salary in each department.
 ->select d.department_name ,max(e.salary) from employee e join department d 
 on d.id = e.department_id group by d.department_name;
 
 //find the second-highest salary across the entire company
 -> select salary from employee order by salary DESC limit 1 offset 1;
 -> select max(salary) from employee where salary < (select max(salary) from employee);

//Third-Highest Salary Department-Wise
->select department_name, salary from 
  (select  d.department_name , e.salary, dense_rank() over(
  partition by d.department_name order by e.salary desc) as salry_rank
  from employee e join department d on d.id= e.department_id
  ) as emloyee_rank where salry_rank=3;
 
 
 //Using the same schema, find employees whose salary is greater than the average salary of the entire company.
 ->  select name ,salary from employee where salary>( select avg(salary) as avgSalary from employee);


//Using the same employee table, find each employee's name along with their manager's name.
->  select  m.name as managerName , e.name as employeeName from employee e left join employee m on e.manager_id = m.id;

 
////Third-Highest Salary Department-Wise
 select department , salary from(select d.department_namen,e.salary, dense_rank() over(partition by d.department_name
 order by e.salary DESC) as salaryRank from employee e join department d on 
 d.id=e.department_id) as employeeRank where salaryRank=3; 
 
 
 
 
 
 
 
 
 
package com.exampleDataJpa.DataJpaExample;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
  public List<Employee> findByIdGreaterThan(int id);
    public List<Employee> findByIdLessThan(int id);
    public List <Employee> findByIdBetween(int id1,int id2);
    public List<Employee> findAllByNameGreaterThan(String name);
   // @Query("from Employee where id=?1 and salary=?2")
   // public List<Employee> findByIdAndSalary(int id , int salary);
    @Query("from Employee order by salary ")
    public List<Employee> getEmployeeByAsc();
//    @Query("from Employee where id=?1 and salary=?2")
//	public List<Employee> findByIdAndSalary(int id, int salary);
    
    
    
}

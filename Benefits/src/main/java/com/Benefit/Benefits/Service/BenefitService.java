package com.Benefit.Benefits.Service;



import java.util.List;

import com.Benefit.Benefits.Exception.BenefitIDNotFound;
import com.Benefit.Benefits.Model.Benefit;

public interface BenefitService {
public Benefit addBenefit(Benefit benefit);
public List<Benefit> getBenefit();
public Benefit search(int benefit_Id) throws BenefitIDNotFound ;
 public List <Benefit> searchbenefitByEmp(int empid);

}

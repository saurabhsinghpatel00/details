package com.test.details.dao;

import com.test.details.entities.Details;
import com.test.details.repository.DetailsRepository;

@Component
public class DetailsDao {
    @Autowired
    DetailsRepository detailsRepository;
    public Details getDetailsById (long id){
        return detailsRepository.findById(id);
    }
}

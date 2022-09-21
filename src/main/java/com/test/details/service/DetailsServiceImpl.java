package com.test.details.service;

import com.test.details.dao.DetailsDao;
import com.test.details.entities.Details;

@Service
public class DetailsServiceImpl implements DetailsService{

    @Autowired
    private DetailsDao detailsDao;

    @Override
    public Details getDetailsById (long id){
        return detailsDao.getDetailsById(id);
    }
}

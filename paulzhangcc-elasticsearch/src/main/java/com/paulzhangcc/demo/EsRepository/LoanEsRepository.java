package com.paulzhangcc.demo.EsRepository;

import com.paulzhangcc.demo.EsModel.LoanEsBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * Created by paul on 2017/7/21.
 */
@Component
public interface  LoanEsRepository extends ElasticsearchRepository<LoanEsBean,Integer> {
}

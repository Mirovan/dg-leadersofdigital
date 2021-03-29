package ru.bigint.dg.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bigint.dg.dao.SourceDAO;
import ru.bigint.dg.model.Source;

import java.util.List;

@Service
public class SourceServiceImpl implements SourceService {

    private final SourceDAO sourceDAO;

    public SourceServiceImpl(SourceDAO sourceDAO) {
        this.sourceDAO = sourceDAO;
    }


    @Override
    public Source add(Source object) {
        Source res = sourceDAO.save(object);
        return res;
    }


    @Override
    public Source get(long id) {
        return sourceDAO.getOne(id);
    }


    @Override
    public List<Source> list() {
        return sourceDAO.findAll(Sort.by((Sort.Order.asc("id"))));
    }
}

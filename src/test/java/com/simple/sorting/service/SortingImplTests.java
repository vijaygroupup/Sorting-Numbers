package com.simple.sorting.service;

import com.simple.sorting.exception.SortingException;
import com.simple.sorting.dao.SortingHistoryDao;
import com.simple.sorting.formmodel.SortingResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SortingImplTests {

    @MockBean
    private SortingHistoryDao sortingHistoryDao;

    @InjectMocks
    SortingImpl sortingImpl;

    @Test
    public void testSortNumberInAsc() throws SortingException {
        SortingResponse sortingResponse = sortingImpl.sortNumberInAsc("7,2,9,1");
        Assert.assertEquals("[1, 2, 7, 9]", sortingResponse.getOutputResponse().toString());
    }

    @Test(expected = SortingException.class)
    public void testSortNumberInAscForException() throws SortingException {
        sortingImpl.sortNumberInAsc(null);
    }
}

package com.soft1851.server.study.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/7/21
 */
public class PageUtils {
    public static  <T> Page<T> listConvertToPage(List<T> list, Pageable pageable) {
        System.out.println(list);
        int start = (int) pageable.getOffset();

        int end = Math.min((start + pageable.getPageSize()), list.size());
        if (start > end) {
            start = end;
        }
        return new PageImpl<T>(list.subList(start, end), pageable, list.size());
    }
}

package com.tulingxueyuan.pms.service.impl;

import com.tulingxueyuan.pms.entity.Product;
import com.tulingxueyuan.pms.mapper.ProductMapper;
import com.tulingxueyuan.pms.service.ProductImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author xushu
 * @since 2021-02-22
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductImplService {

}

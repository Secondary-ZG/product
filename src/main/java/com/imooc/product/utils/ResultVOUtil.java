package com.imooc.product.utils;

import com.imooc.product.vo.ResultVO;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/4 15:35
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

}

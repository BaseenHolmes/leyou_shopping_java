package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName: LyException
 * @Description: TODO
 * @Author: Baseen
 * @Date: 2019/12/22 22:09
 **/
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

}

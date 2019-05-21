package com.bidewu.web.common.constant.resultcode;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :core-base-parent
 * @Author : kewei@nash.work
 * @Date : 2017-09-28 下午2:22 星期四
 * @Version : v1.0
 **/
public class RCFactory {
    /**
     * 模块码
     */
    private final Integer moduleCode;

    /**
     * 系统码
     */
    private final Integer systemCode;

    /**
     * 全参构造方法
     *
     * @param systemCode 系统码
     * @param moduleCode 模块码
     */
    public RCFactory(final Integer systemCode, final Integer moduleCode) {
        this.systemCode = systemCode;
        this.moduleCode = moduleCode;
    }

    /**
     * 创建结果码对象
     *
     * @param infoCode 信息码
     * @param message  信息描述
     * @return
     */
    public RC RC(final Integer infoCode, final String message) {
        return new RC(systemCode, moduleCode, infoCode, message);
    }

}

package com.bettem.platform.fegin.fallback;

import com.bettem.platform.fegin.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/23 16:27 <br>
 * @Author: 颜金星
 */
@Component
public class SchedualServiceHiFallback implements SchedualServiceHi {
    @Override
    public String home(String name) {
        return "生产者断开";
    }
}

package cn.homjie.gecco.iresearch;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HrefBean;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.List;

/**
 * @author jiehong.jh
 * @date 2018/3/3
 */
@Data
public class Category implements HtmlBean {
    private static final long serialVersionUID = 3018760488621382659L;

    @Text
    @HtmlField(cssPath = "dt a")
    private String parentName;

    @HtmlField(cssPath = "ul li")
    private List<HrefBean> categorys;
}

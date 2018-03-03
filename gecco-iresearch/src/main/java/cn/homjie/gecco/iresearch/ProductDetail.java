package cn.homjie.gecco.iresearch;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

/**
 * @author jiehong.jh
 * @date 2018/3/3
 */
@Data
@Gecco(matchUrl = "http://news.iresearch.cn/content/{yeary}/{month}/{code}.shtml",
    pipelines = {"consolePipeline", "productDetailPipeline"})
public class ProductDetail implements HtmlBean {

    private static final long serialVersionUID = -377053120283382723L;

    /**
     * 文本内容
     */
    @HtmlField(
        cssPath = "body > div.g-content > div.g-bd.f-mt-auto > div > div.g-mn > div > div.g-article > div.m-article")
    private String content;

    @RequestParameter
    private String code;

    @RequestParameter
    private String year;

    @RequestParameter
    private String month;

    /**
     * 标题
     */
    @Text
    @HtmlField(cssPath = "body > div.g-content > div.g-main.f-mt-auto > div > div > div.title > h1")
    private String title;
}

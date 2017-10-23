package cn.ibubbo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: uncle
 * @apdateTime: 2017/10/23
 * @describe: swagger 配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                // 指明controller路径
                .select().apis(RequestHandlerSelectors.basePackage("cn.ibubbo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 配置 API 文档标题、描述、作者等等相关信息
     * @return
     */
    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder().title("API接口文档")
                .termsOfServiceUrl("http://www.ibubbo.cn/")
                .description("SpringBoot + swagger")
                .contact(new Contact("uncle", "http://www.ibubbo.cn/", "ibubbo@126.com"))
                .build();
    }
}

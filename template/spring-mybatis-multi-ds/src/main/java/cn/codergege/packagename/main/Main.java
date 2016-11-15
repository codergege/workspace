package cn.codergege.packagename.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.codergege.packagename.service.QueryService;
import cn.codergege.packagename.util.DataSourceContextHolder;

public class Main {
	final static Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

    	ConfigurableApplicationContext ctx = 
    			new ClassPathXmlApplicationContext("spring.xml",
    					"spring-mybatis.xml", 
    					"dataSourceOne.xml",
    					"dataSourceTwo.xml");
    	ctx.registerShutdownHook();
    	ctx.refresh();
    	
    	/**
    	 * 多数据源的情况下, aop 事务 只绑定一个数据源, 如果这里不控制, 
    	 * 那就会去选择默认数据源 dataSourceOne.
    	 * 哪个 dataSource 涉及写操作, 就控制使用哪个 dataSource.
    	 * 
    	 * 以上说法未经验证.
    	 */
    	DataSourceContextHolder.setDataSourceType(
    			DataSourceContextHolder.DATASOURCE_TWO);

    	log.info("test log info");
    	QueryService queryService = (QueryService) ctx.getBean("queryService");
    	queryService.print();
    	
    }
}

package cn.edu.cmu.util;

import org.junit.Test;

import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/9/22 20:07
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class YamlTest {
    @Test
    public void testYml() {
        org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml();
        Map entity = yaml.loadAs(YamlTest.class.getResourceAsStream("/testYml.yml"), Map.class);//如果读入Map,这里可以是Mapj接口,默认实现为LinkedHashMap
        System.out.println(entity);
    }

}

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lvjinping
 * @version 1.0
 * @title MBG 逆向生成类
 * @className
 * @since 2018-05-17
 */
public class MBG {
    public static void main(String[] args) {
        try{
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File("E:\\development\\studyspace\\MBG\\src\\main\\resources\\generatorConfig.xml");
            if (!configFile.exists()){
                System.out.println("文件不存在");
                return;
            }
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);

            // @todo 删除代码注释的正则表达式   /\*{1,2}[\s\S]*?\*/
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
